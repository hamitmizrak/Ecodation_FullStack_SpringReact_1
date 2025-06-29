// rfce
import React, { useEffect, useState } from "react";
import { useParams, useNavigate, Link } from "react-router-dom";
import { withTranslation } from "react-i18next";

import BlogApi from "../../services/BlogApi";
import BlogCategoryApi from "../../services/BlogCategoryApi";

function BlogUpdate({ t }) {
  const { id } = useParams();
  const navigate = useNavigate();

  const [blogHeader, setBlogHeader] = useState("");
  const [blogContent, setBlogContent] = useState("");
  const [blogTitle, setBlogTitle] = useState("");
  const [categoryId, setCategoryId] = useState(null);
  const [categories, setCategories] = useState([]);
  const [error, setError] = useState(null);
  const [spinner, setSpinner] = useState(false);

  // Blog verisini çek
  useEffect(() => {
    BlogApi.objectApiFindById(id)
      .then((res) => {
        const data = res.data;
        setBlogHeader(data.header);
        setBlogContent(data.content);
        setBlogTitle(data.title);
        setCategoryId(data.blogCategoryDto?.categoryId ?? null);
      })
      .catch((err) => {
        console.error("Blog verisi alınamadı", err);
        alert("Blog verisi alınamadı");
      });
  }, [id]);

  // Kategorileri çek
  useEffect(() => {
    BlogCategoryApi.objectApiList()
      .then((res) => setCategories(res.data))
      .catch((err) => console.error("Kategoriler alınamadı", err));
  }, []);

  // Güncelleme işlemi
  const handleSubmit = async (e) => {
    e.preventDefault();

    if (!categoryId) {
      setError({ categoryId: "Kategori seçimi zorunludur." });
      return;
    }

    const updatedBlog = {
      header: blogHeader,
      content: blogContent,
      title: blogTitle,
      blogCategoryDto: {
        categoryId: categoryId,
      },
    };

    setSpinner(true);
    setError(null);

    try {
      const response = await BlogApi.objectApiUpdate(id, updatedBlog);
      if (response.status === 200) {
        alert("Blog başarıyla güncellendi");
        navigate("/blog/list");
      }
    } catch (err) {
      console.error("Blog güncellenemedi", err);
      if (err.response?.status === 400) {
        setError(err.response.data.validationErrors);
      } else {
        alert("Bir hata oluştu: " + err.response?.data?.message);
      }
    } finally {
      setSpinner(false);
    }
  };

  return (
    <div className="container mt-5">
      <h1 className="text-center mb-4">{t("blog_update")}</h1>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label className="mb-1">{t("blog_header")}</label>
          <input
            type="text"
            className={`form-control ${error?.header ? "is-invalid" : ""}`}
            value={blogHeader}
            onChange={(e) => setBlogHeader(e.target.value)}
          />
          {error?.header && (
            <div className="invalid-feedback">{error.header}</div>
          )}
        </div>

        <div className="form-group mt-3">
          <label className="mb-1">{t("blog_title")}</label>
          <input
            type="text"
            className={`form-control ${error?.title ? "is-invalid" : ""}`}
            value={blogTitle}
            onChange={(e) => setBlogTitle(e.target.value)}
          />
          {error?.title && (
            <div className="invalid-feedback">{error.title}</div>
          )}
        </div>

        <div className="form-group mt-3">
          <label className="mb-1">{t("blog_content")}</label>
          <textarea
            className={`form-control ${error?.content ? "is-invalid" : ""}`}
            value={blogContent}
            onChange={(e) => setBlogContent(e.target.value)}
          />
          {error?.content && (
            <div className="invalid-feedback">{error.content}</div>
          )}
        </div>

        <div className="form-group mt-3">
          <label className="mb-1">{t("blog_category_name")}</label>
          <select
            className={`form-control ${error?.categoryId ? "is-invalid" : ""}`}
            value={categoryId ?? ""}
            onChange={(e) => setCategoryId(Number(e.target.value))}
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
          type="submit"
          className="btn btn-warning mt-4"
          disabled={spinner}
        >
          {spinner ? (
            <span className="spinner-border spinner-border-sm me-2" />
          ) : null}
          {t("update")}
        </button>

        <Link className="btn btn-secondary mt-4 ms-3" to="/blog/list">
          {t("home")}
        </Link>

      </form>
    </div>
  );
}

export default withTranslation()(BlogUpdate);
