// rfce
// REACT
import React, { useEffect, useState } from "react";

// ROUTER
import { Link, Route, useNavigate } from "react-router-dom";

// I18N
import { withTranslation } from "react-i18next";

// CATEGORY API
import BlogCategoryApi from "../../services/BlogCategoryApi";

// FUNCTION COMPONENT (BlogCategoryCreate)
function BlogCategoryCreate({ props, t, i18n }) {
  // REDIRECT
  let navigate = useNavigate();

  // STATE
  const [categoryName, setCategoryName] = useState(null); // Category name state
  const [error, setError] = useState(undefined); // Error state
  const [spinner, setSpinner] = useState(false); // Spinner state : başlangıç değeri false
  const [multipleRequest, setMultipleRequest] = useState(false); // Multiple request state (Aynı anda çok kere isteği kapatmak

  // CLEAR
  const clearFunction = () => {
    setCategoryName(null);
    setError(undefined);
    setSpinner(false);
    setMultipleRequest(false);
  };

  // FORM SUBMIT
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
  const inputInvalidErrorClass =  error 
    ? "form-control is-invalid"
    : "form-control";

  // INPUT ON-CHANGE
  const categoryNameOnChange = (e) => {
    // e.preventDefault(); // Prevent default form submission

    // TARGET
    const { name, value } = e.target; // Get the name and value of the input
    console.log(name, value); // Log the name and value of the input
    // Set the state
    // if (name === "categoryName") setCategoryName(value); // Set category name state
    setCategoryName(value); // Set category name state
    //setCategoryName(e.target.value); // Set category name state

    // Eğer hata yoksa hata mesajını kaldır
    if (error)
    setError(undefined);
  };

  // SUBMIT
  const blogCategoryCreateSubmit = async (e) => {
    // e.preventDefault(); // Prevent default form submission

    // FORMU GÖNDERME
    const blogCategoryObject = { categoryName };

    // Hataları Göster
    setError(null);

    // SPINNER
    setSpinner(true);

    // MULTIPLE REQUEST (İsteği çok kere yapmamak için)
    setMultipleRequest(true);
    try {
      const response = await BlogCategoryApi.objectApiCreate(
        blogCategoryObject
      ); // API'den blog category ekle
      console.log(response);
      console.log(response.data);
      console.log(response.status);
      console.log(response.headers);

      // Eğer başarılı ise
      if (response.status === 200) {
        // Create işlemi başarılı ise 200 döner 201
        // Başarılı ise
        console.log("Blog Kategory Eklendi!");
        console.log(response.data);
        setSpinner(false); // SPINNER KAPAT
        setMultipleRequest(false); // MULTIPLE REQUEST KAPAT
        clearFunction(); // Formu temizle
        // REDIRECT
        navigate("/blog/category/list"); // Blog category list sayfasına yönlendir
        // Alert ile kullanıcıya bilgi ver
        window.alert("Blog Kategory Eklendi!");
      }
    } catch (err) {
      console.error(err, "Blog Kategory Eklenmedi!");
      console.error(err.message || "Blog Kategory Eklenmedi!");

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
        <h1 class="text-center mb-4 mt-4"> {t("blog_category_create")}</h1>

        <form onSubmit={onSubmitForm} action="GET">
          {/* INPUT CATEGORY NAME */}
          <div class="form-group">
            <label htmlFor="categoryName" className="mb-2">{t("blog_category_name")}</label>
            <input
              type="text"
              className={inputInvalidErrorClass}
              id="categoryName"
              name="categoryName"
              autoFocus={true}
              required={true}
              placeholder={t("blog_category_name")}
              value={categoryName || ""}
              onChange={categoryNameOnChange}
            />
            {/* {error && <div className="invalid-feedback">{error}</div>} */}
            {error ? (
              <div className="invalid-feedback">{error.categoryName}</div>
            ) : (
              ""
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
            onClick={blogCategoryCreateSubmit}
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

          <Link class="btn btn-primary mt-3 ms-3" to={`/blog/category/list/`}>
            {t("home")}
          </Link>
        </form>
      </div>
    </React.Fragment>
  );
}

// EXPORT
// i18n
export default withTranslation()(BlogCategoryCreate);