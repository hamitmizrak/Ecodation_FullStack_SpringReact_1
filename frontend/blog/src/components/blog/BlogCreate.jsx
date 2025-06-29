// rfce
import React, { useEffect, useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import { withTranslation } from "react-i18next";

import BlogCategoryApi from "../../services/BlogCategoryApi";
import BlogApi from "../../services/BlogApi";

function BlogCreate({ props, t, i18n }) {
  let navigate = useNavigate();

  const [blogHeader, setBlogHeader] = useState("");
  const [blogContent, setBlogContent] = useState("");
  const [blogTitle, setBlogTitle] = useState("");
  const [categoryId, setCategoryId] = useState(null);
  const [categories, setCategories] = useState([]);
  const [error, setError] = useState(undefined);
  const [spinner, setSpinner] = useState(false);
  const [multipleRequest, setMultipleRequest] = useState(false);

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
  }, []);

  const clearFunction = () => {
    setBlogHeader("");
    setBlogContent("");
    setBlogTitle("");
    setCategoryId(null);
    setError(undefined);
    setSpinner(false);
    setMultipleRequest(false);
  };

  const blogCreateSubmit = async (e) => {
    e.preventDefault();

    if (categoryId === null) {
      setError((prev) => ({
        ...prev,
        categoryId: "Kategori seçimi zorunludur.",
      }));
      return;
    }

    const blogRequest = {
      header: blogHeader,
      title: blogTitle,
      content: blogContent,
      blogCategoryDto: {
        categoryId: categoryId,
      },
    };

    setError(null);
    setSpinner(true);
    setMultipleRequest(true);

    try {
      const response = await BlogApi.objectApiCreate(blogRequest);
      if (response.status === 200 || response.status === 201) {
        console.log("Blog Eklendi!");
        setSpinner(false);
        setMultipleRequest(false);
        clearFunction();
        navigate("/blog/list");
        window.alert("Blog Eklendi!");
      }
    } catch (err) {
      console.error("Blog Eklenmedi", err);
      if (err.response?.status === 400) {
        setError(err.response.data.validationErrors);
      } else if (err.response?.status === 500) {
        setError("Internal Server Error: " + err.response.data.message);
        window.alert("Internal Server Error: " + err.response.data.message);
      } else {
        setError("Error: " + err.response?.data?.message);
        window.alert("Error: " + err.response?.data?.message);
      }
    } finally {
      setSpinner(false);
      setMultipleRequest(false);
    }
  };
  

  const inputInvalidErrorClass = error
    ? "form-control is-invalid"
    : "form-control";

  return (
    <div className="container mt-5">
      <h1 className="text-center mb-4 mt-4">{t("blog_create")}</h1>
      <form onSubmit={blogCreateSubmit}>
        <div className="form-group">
          <label htmlFor="blogHeader" className="mb-1">
            {t("blog_header")}
          </label>
          <input
            type="text"
            className={inputInvalidErrorClass}
            id="blogHeader"
            name="blogHeader"
            required
            placeholder={t("blog_header")}
            value={blogHeader}
            onChange={(e) => setBlogHeader(e.target.value)}
          />
          {error?.blogHeader && (
            <div className="invalid-feedback">{error.blogHeader}</div>
          )}
        </div>

        <div className="form-group">
          <label htmlFor="blogTitle" className="mb-1 mt-4">
            {t("blog_title")}
          </label>
          <input
            type="text"
            className={inputInvalidErrorClass}
            id="blogTitle"
            name="blogTitle"
            required
            placeholder={t("blog_title")}
            value={blogTitle}
            onChange={(e) => setBlogTitle(e.target.value)}
          />
          {error?.blogTitle && (
            <div className="invalid-feedback">{error.blogTitle}</div>
          )}
        </div>

        <div className="form-group">
          <label htmlFor="blogContent" className="mb-1 mt-4">
            {t("blog_content")}
          </label>
          <input
            type="text"
            className={inputInvalidErrorClass}
            id="blogContent"
            name="blogContent"
            required
            placeholder={t("blog_content")}
            value={blogContent}
            onChange={(e) => setBlogContent(e.target.value)}
          />
          {error?.blogContent && (
            <div className="invalid-feedback">{error.blogContent}</div>
          )}
        </div>

        <div className="form-group mb-3">
          <label className="mb-1 mt-4">{t("blog_category_name")}</label>
          <select
            className={`form-control ${error?.categoryId ? "is-invalid" : ""}`}
            value={categoryId ?? ""}
            onChange={(e) =>
              setCategoryId(e.target.value ? Number(e.target.value) : null)
            }
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

        <button
          type="reset"
          className="btn btn-secondary mt-3 me-2"
          onClick={clearFunction}
        >
          {t("clear")}
        </button>

        <button
          type="submit"
          className="btn btn-warning mt-3 ms-2 shadow"
          disabled={multipleRequest}
        >
          {spinner && (
            <span
              className="spinner-border spinner-border-sm me-2"
              role="status"
              aria-hidden="true"
            />
          )}
          {t("create")}
        </button>

        <Link className="btn btn-primary mt-3 ms-3" to={`/blog/list/`}>
          {t("home")}
        </Link>
      </form>
    </div>
  );
}

export default withTranslation()(BlogCreate);
