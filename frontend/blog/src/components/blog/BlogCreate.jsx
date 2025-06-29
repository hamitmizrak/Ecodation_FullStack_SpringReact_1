// rfce
// REACT
import React, { useEffect, useState } from "react";

// ROUTER
import { Link, Route, useNavigate } from "react-router-dom";

// I18N
import { withTranslation } from "react-i18next";

// CATEGORY API

import BlogCategoryApi from "../../services/BlogCategoryApi";
import BlogApi from "../../services/BlogApi";

// FUNCTION COMPONENT (BlogCreate)
function BlogCreate({ props, t, i18n }) {
  // REDIRECT
  let navigate = useNavigate();

  // STATE (BLOG)    // header  content title
  const [blogHeader, setBlogHeader] = useState(""); // Category header state
  const [blogContent, setBlogContent] = useState(""); // Category content state
  const [blogTitle, setBlogTitle] = useState(""); // Category title state

  // STATE (BLOG CATEGORY)
  const [categoryId, setCategoryId] = useState(""); // Category name state
  const [categories, setCategories] = useState([]); // Category name state

  // STATE OTHER
  const [error, setError] = useState(undefined); // Error state
  const [spinner, setSpinner] = useState(false); // Spinner state : başlangıç değeri false
  const [multipleRequest, setMultipleRequest] = useState(false); // Multiple request state (Aynı anda çok kere isteği kapatmak

  // USE EFFECT
  // Blog Kategoriler  Component açıldığında Açılsın)
  useEffect(() => {
    BlogCategoryApi.objectApiList()
      .then((res) => {
        if (res.status === 200) {
          setCategories(res.data);
        }
      })
      .catch((error) => {
        console.log("Blog Kategoriler Yüklenemedi", error);
      });
  });

  // CLEAR
  const clearFunction = () => {
    blogHeader(null);
    blogContent(null);
    blogTitle(null);
    setError(undefined);
    setSpinner(false);
    setMultipleRequest(false);
  };

  // FORM SUBMIT (preventDefault)
  const onSubmitForm = async (e) => {
    e.preventDefault(); // Prevent default form submission
  };

  // SPINNER DATA
  const spinnerData = () => {
    if (spinner) {
      return (
        <div
          className="spinner-border text-warning spinner-border-sm"
          role="status"
          aria-hidden="true"
        >
          {/* <span className="visually-hidden">Loading...</span> */}
          <span className="sr-only">Loading...</span>
        </div>
      );
    } else {
      return "";
    }
  };

  // ERROR INPUT
  const inputInvalidErrorClass = error
    ? "form-control is-invalid"
    : "form-control";

  // INPUT ON-CHANGE
  const blogHeaderOnChange = (e) => {
    const { name, value } = e.target; // Get the name and value of the input
    console.log(name, value); // Log the name and value of the input
    setBlogHeader(value); // Set category name state
    if (error) setError(undefined);
  };

  // INPUT ON-CHANGE
  const blogTitleOnChange = (e) => {
    const { name, value } = e.target; // Get the name and value of the input
    console.log(name, value); // Log the name and value of the input
    setBlogTitle(value); // Set category name state
    if (error) setError(undefined);
  };

  // INPUT ON-CHANGE
  const blogContentOnChange = (e) => {
    const { name, value } = e.target; // Get the name and value of the input
    console.log(name, value); // Log the name and value of the input
    setBlogContent(value); // Set category name state
    if (error) setError(undefined);
  };

  // SUBMIT
  const blogCreateSubmit = async (e) => {
    // e.preventDefault(); // Prevent default form submission

    // FORMU GÖNDERME
    const blogRequest = { blogHeader, blogTitle, blogContent, categoryId }; // Sadece ID yeterlidir (Spring @OneToMany ile eşleştirecek)

    // Hataları Göster
    setError(null);

    // SPINNER
    setSpinner(true);

    // MULTIPLE REQUEST (İsteği çok kere yapmamak için)
    setMultipleRequest(true);
    try {
      const response = await BlogApi.objectApiCreate(blogRequest); // API'den blog category ekle
      console.log(response);
      console.log(response.data);
      console.log(response.status);
      console.log(response.headers);

      // Eğer başarılı ise
      if (response.status === 200 || response.status === 201) {
        // Create işlemi başarılı ise 200 döner 201
        // Başarılı ise
        console.log("Blog Kategory Eklendi!");
        console.log(response.data);
        setSpinner(false); // SPINNER KAPAT
        setMultipleRequest(false); // MULTIPLE REQUEST KAPAT
        clearFunction(); // Formu temizle
        // REDIRECT
        navigate("/blog/list"); // Blog category list sayfasına yönlendir
        // Alert ile kullanıcıya bilgi ver
        window.alert("Blog Eklendi!");
      }
    } catch (err) {
      console.error(err, "Blog Eklenmedi!");
      console.error(err.message || "Blog Eklenmedi!");

      // Hata mesajını göster Not: validationErrors => Javadan geliyor
      setError(err.response.data.validationErrors);

      // Eğer hata varsa (4xx = Client Error, 5xx = Server Error)
      if (err.response.status === 400) {
        // 400 Bad Request
        console.error("Bad Request: ", err.response.data);
        setError(err.response.data.validationErrors); // Hata mesajını göster
        //window.alert("Bad Request: " + err.response.data.message); // Alert ile kullanıcıya bilgi ver
      } else if (err.response.status === 500) {
        // 500 Internal Server Error
        console.error("Internal Server Error: ", err.response.data);
        setError("Internal Server Error: " + err.response.data.message); // Hata mesajını göster
        window.alert("Internal Server Error: " + err.response.data.message); // Alert ile kullanıcıya bilgi ver
      } else {
        console.error("Error: ", err.response.data);
        setError("Error: " + err.response.data.message); // Hata mesajını göster
        window.alert("Error: " + err.response.data.message); // Alert ile kullanıcıya bilgi ver
      }
    } finally {
      // SPINNER AÇ
      setSpinner(true);

      // MULTIPLE REQUEST KAPAT
      setMultipleRequest(false);
    }
  };

  // RETURN
  return (
    <React.Fragment>
      <div class="container mt-5">
        <h1 class="text-center mb-4 mt-4"> {t("blog_create")}</h1>

        <form onSubmit={onSubmitForm} action="GET">
          {/* INPUT BLOG HEADER */}
          <div class="form-group">
            <label htmlFor="blogHeader" className="mb-1">
              {t("blog_header")}
            </label>
            <input
              type="text"
              className={inputInvalidErrorClass}
              id="blogHeader"
              name="blogHeader"
              autoFocus={true}
              required={true}
              placeholder={t("blog_header")}
              value={blogHeader || ""}
              // onChange={(e) => setBlogHeader(e.target.value)}
              onChange={blogHeaderOnChange}
            />
            {/* {error && <div className="invalid-feedback">{error}</div>} */}
            {error ? (
              <div className="invalid-feedback">{error.blogHeader}</div>
            ) : (
              ""
            )}
          </div>

          {/* INPUT BLOG TITLE */}
          <div class="form-group">
            <label htmlFor="blogTitle" className="mb-1 mt-4">
              {t("blog_title")}
            </label>
            <input
              type="text"
              className={inputInvalidErrorClass}
              id="blogTitle"
              name="blogTitle"
              autoFocus={false}
              required={true}
              placeholder={t("blog_title")}
              value={blogTitle || ""}
              // onChange={(e) => setBlogTitle(e.target.value)}
              onChange={blogTitleOnChange}
            />
            {/* {error && <div className="invalid-feedback">{error}</div>} */}
            {error ? (
              <div className="invalid-feedback">{error.blogTitle}</div>
            ) : (
              ""
            )}
          </div>

          {/* INPUT BLOG CONTÊNT */}
          <div class="form-group">
            <label htmlFor="blogContent" className="mb-1 mt-4">
              {t("blog_content")}
            </label>
            <input
              type="text"
              className={inputInvalidErrorClass}
              id="blogContent"
              name="blogContent"
              autoFocus={false}
              required={true}
              placeholder={t("blog_content")}
              value={blogContent || ""}
              // onChange={(e) => setBlogContent(e.target.value)}
              onChange={blogContentOnChange}
            />
            {/* {error && <div className="invalid-feedback">{error}</div>} */}
            {error ? (
              <div className="invalid-feedback">{error.blogContent}</div>
            ) : (
              ""
            )}
          </div>

          {/* INPUT BLOG CATEGORY CHOOISE */}
          {/* Kategori Seçimi */}
          <div className="form-group mb-3">
            <label className="mb-1 mt-4">{t("blog_category_name")}</label>

            {/* Dropdown List */}
            <select
              className={`form-control ${
                error?.categoryId ? "is-invalid" : ""
              }`}
              value={categoryId}
              onChange={(e) => setCategoryId(e.target.value)}
              required
            >
              <option value="">{t("select_category")}</option>
              {categories.map((cat) => (
                <option key={cat.categoryId} value={cat.categoryId}>
                  {cat.categoryName}
                </option>
              ))}
            </select>
            {error?.categoryId && (
              <div className="invalid-feedback">{error.categoryId}</div>
            )}
          </div>

          {/* RESET - BUTTON  */}
          <button
            type="reset"
            className="btn btn-secondary mt-3 me-2"
            onClick={clearFunction}
          >
            {t("clear")}
          </button>

          {/* SUBMIT - BUTTON  */}
          <button
            type="submit"
            className="btn btn-warning mt-3 ms-2 shadow"
            onClick={blogCreateSubmit}
            disabled={multipleRequest}
          >
            {/* SPINNER */}
            {spinnerData()}
            {/* {spinner ? (
              <span className="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
            ) : (
              "Ekle"
            )} */}
            {t("create")}
          </button>

          <Link class="btn btn-primary mt-3 ms-3" to={`/blog/list/`}>
            {t("home")}
          </Link>
        </form>
      </div>
    </React.Fragment>
  );
}

// EXPORT
// i18n
export default withTranslation()(BlogCreate);