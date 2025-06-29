

// rfce
// REACT
import React, { useEffect, useState } from "react";

// ROUTER
import { Link, Route, useNavigate, useParams } from "react-router-dom";

// I18N
import { withTranslation } from "react-i18next";

// CATEGORY API
import BlogCategoryApi from "../../services/BlogCategoryApi";

// FUNCTION COMPONENT (BlogUpdate)
function BlogUpdate({ props, t, i18n }) {

  // REDIRECT
  let navigate = useNavigate();

  // STATE
  const [categoryName, setCategoryName] = useState(null); // Category name state
  const [error, setError] = useState(undefined); // Error state
  const [spinner, setSpinner] = useState(false); // Spinner state : başlangıç değeri false
  const [multipleRequest, setMultipleRequest] = useState(false); // Multiple request state (Aynı anda çok kere isteği kapatmak


  // PARAMS
  // const { id } = useParams(); // Get the id from the URL params (1.YOL)
  // console.log(id); // Log the id
  const [paramID, setParamID] = useState(null); // State for param ID
  const updateBlogCategoryID = useParams(); // Get the id from the URL params (2.YOL)

  // EFFECT
  useEffect(() => {
    // Set the param ID from the URL params
    setParamID(updateBlogCategoryID.id);
    localStorage.setItem("blog_category_update_id", updateBlogCategoryID.id); // Store the param ID in localStorage
    console.log("Param ID: ", updateBlogCategoryID.id); // Log the param ID

    BlogCategoryApi.objectApiFindById(updateBlogCategoryID.id) // Fetch the blog category by ID
      .then((response) => {
        console.log(response);
        console.log(response.data);
        console.log(response.status);
        console.log(response.headers);
        if (response.status === 200) {
          // If the response is successful, set the category name
          setCategoryName(response.data.categoryName);
        }
      })
      .catch((err) => {
        console.log(err);
        console.error("Error fetching blog category by ID: ", err);
        // Alert ile kullanıcıya bilgi ver
        window.alert("Error fetching blog category by ID: " + err.message);
      })},
      []); // end BlogCategoryApi.objectApiFindById


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
  const blogCategoryUpdateSubmit = async (e) => {
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
      const response = await BlogCategoryApi.objectApiUpdate(
       localStorage.getItem("blog_category_update_id"), blogCategoryObject
      ); // API'den blog category ekle
      console.log(response);
      console.log(response.data);
      console.log(response.status);
      console.log(response.headers);

      // Eğer başarılı ise
      if (response.status === 200) {
        // Update işlemi başarılı ise 200 döner 201
        // Başarılı ise
        console.log("Blog Kategory Güncellendi!");
        console.log(response.data);
        setSpinner(false); // SPINNER KAPAT
        setMultipleRequest(false); // MULTIPLE REQUEST KAPAT
        clearFunction(); // Formu temizle
        // REDIRECT
        navigate("/blog/category/list"); // Blog category list sayfasına yönlendir
        // Alert ile kullanıcıya bilgi ver
        window.alert("Blog Kategory Güncellendi!");
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
        <h1 class="text-center mb-4 mt-4"> {t("blog_category_update")}</h1>

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
            onClick={blogCategoryUpdateSubmit}
            disabled={multipleRequest}
          >
            {/* SPINNER */}
            {spinnerData()}
            {/* {spinner ? (
              <span className="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
            ) : (
              "Ekle"
            )} */}
            {t("update")}
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
export default withTranslation()(BlogUpdate);