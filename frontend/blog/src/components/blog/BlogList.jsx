// rfce
// REACT
import React, { useEffect, useState } from "react";

// ROUTER
import { Link, Route, useNavigate } from "react-router-dom";

// I18N
import { withTranslation } from "react-i18next";

// BLOG API
import BlogApi from "../../services/BlogApi";

// FUNCTION COMPONENT
function BlogList({ props, t, i18n }) {
  // REDIRECT
  let navigate = useNavigate();

  // STATE
  const [blogApiListData, setBlogApiListData] = useState([]); //unutma diziyi yaz (dizi boş dizi)

  // EFFECT
  useEffect(() => {
    //2.YOL
    fetchBlogList();
  }, []); //end useEffect

  // Fetch users from API
  const fetchBlogList = async () => {
    try {
      const response = await BlogApi.objectApiList(); //fetch('https://api.example.com/users');
      setBlogApiListData(response.data);
      console.log(response);
      console.log(response.data);
      console.log(response.status);
      console.log(response.headers);
      if (response.status === 200) {
        setBlogApiListData(response.data);
      }
    } catch (error) {
      console.error("Error fetching users:", error);
    }
  }; // end fetchBlogList

  // FUNCTION
  // LIST AFTER LOADING
  const listManipulationAfter = () => {
    BlogApi.objectApiList()
      .then((response) => {
        console.log(response);
        console.log(response.data);
        console.log(response.status);
        console.log(response.headers);
        if (response.status === 200) {
          setBlogApiListData(response.data);
        }
      })
      .catch((err) => {
        console.log(err);
      });
  }; // end listManipulationAfter

  ////////////////////////////
  // CRUD
  // BLOG UPDATE
  const setUpdateBlog = (data) => {
    // 1.YOL (id useParams)
    // 2.YOL (localStorage)
    let { id, header,title,content } = data;
    localStorage.setItem("blog_update_id", data.id);
    localStorage.setItem("blog_header", header);
    localStorage.setItem("blog_title", title);
    localStorage.setItem("blog_content", content);
  };

  // BLOG VIEW
  const setViewBlog = (id) => {
    // 1.YOL (id useParams)
    // 2.YOL (localStorage)
    localStorage.setItem("blog_view_id", id);
  }; // end setViewBlog

  // BLOG DELETE
  const setDeleteBlog = (id) => {
    if (window.confirm(id + " id datayı silmek istiyor musunuz ?")) {
      // 1.YOL
      BlogApi.objectApiDelete(id)
        .then((response) => {
          if (response.status === 200) {
            listManipulationAfter();
            navigate("/blog/list");
            //window.location = "/blog/list"
          }
        })
        .catch((err) => {
          console.error(err);
          navigate("/blog/list");
          //window.location = "/register/list"
        });
    } else {
      alert(id + " nolu data silinmedi !!!");
      window.location = "/blog/list";
    }
    // 2.YOL (delete axios yazarak)
    // axios.delete(" http://localhost:4444/blog/api/v1.0.0/delete/"+id).then().catch();
  }; // end setDeleteBlog

  // RETURN
  return (
    // Dikkat: React.Fragment içinde return yazılmalı ve en az 1 tane Div veya <> veya React.Fragment olmalı
    <React.Fragment>
      <br />
      <br />
      <br />
      <br />
      <h1 className="text-center display-5 mb-5">{t("blog_list")}</h1>
      <Link className="btn btn-primary me-2" to="/blog/create">
        {t("create")}
      </Link>

      {/* Table */}
      <table className="table table-striped table-responsive mb-5">
        <thead>
          <tr>
            <th>{t("id")}</th>
            <th>{t("blog_header")}</th>
            <th>{t("blog_title")}</th>
            <th>{t("blog_content")}</th>
            <th>{t("category")}</th>

            <th>{t("date")}</th>
            <th>{t("update")}</th>
            <th>{t("show")}</th>
            <th>{t("delete")}</th>
          </tr>
        </thead>
        <tbody>
          {blogApiListData.map((blog) => (
            <tr key={blog.blogId}>
              <td>{blog.blogId}</td>
              <td>{blog.header}</td>
              <td>{blog.content}</td>
              <td>{blog.title}</td>
              <td>{blog.blogCategoryDto.categoryName}</td>
              <td>{blog.systemCreatedDate}</td>
              <td>
                <Link to={`/blog/update/${blog.blogId}`}>
                  <i
                    onClick={() => setUpdateBlog(blog)}
                    className="fa-solid fa-pen-nib text-primary"
                  ></i>
                </Link>
              </td>
              <td>
                <Link to={`/blog/view/${blog.blogId}`}>
                  <i
                    onClick={() => setViewBlog(blog.blogId)}
                    className="fa-solid fa-eye text-secondary"
                  ></i>
                </Link>
              </td>
              <td>
                <Link>
                  <i
                    onClick={() => setDeleteBlog(blog.blogId)}
                    className="fa-solid fa-trash text-danger"
                  ></i>
                </Link>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </React.Fragment>
  ); //end return
} //end function

// i18n
export default withTranslation()(BlogList);
