// rfce ==> TAB

// REACT
import React, { useEffect, useState } from "react";

// ROUTER
import { Link, Route, useNavigate } from "react-router-dom";

// I18N
import { withTranslation } from "react-i18next";

// CATEGORY API
import BlogCategoryApi from "../../services/BlogCategoryApi";

// PICTURE
import sunRise from "../../assets/images/sunrise.jpg";

// FUNCTION
function BlogCategoryView({ props, t, i18n }) {
  // STATE
  const [id, setId] = useState(null);
  const [blogCategoryView, setBlogCategoryView] = useState([]); // unutma diziyi yaz (dizi boş dizi)

  // USE EFFECT
  useEffect(() => {
    // LocalStorage'dan ID al
    setId(localStorage.getItem("blog_category_view_id"));

    // LocalStorage'dan ID al
    BlogCategoryApi.objectApiFindById(localStorage.getItem("blog_category_view_id"))
    .then((response) => {
      console.log(response);
      console.log(response.data);
      console.log(response.status);
      console.log(response.headers);
      if (response.status === 200) {
        setBlogCategoryView(response.data);
      }
    }).catch((err) => {
      console.error(err);
      //console.log(err);
    });
  }, []); // end useEffect

  // SONUÇLARI
  return (
    <React.Fragment>
      <div class="card mt-5 text-center">
        <img class="card-img-top " src={sunRise} alt="Title" />
        <div class="card-body">
          <h4 class="card-title">{blogCategoryView.categoryName}</h4>
          <p class="card-text">{blogCategoryView.createdBy}</p>
          <p class="card-text">{blogCategoryView.systemCreatedDate}</p>
        </div>
      </div>
    </React.Fragment>
  );
}

// EXPORT
export default withTranslation()(BlogCategoryView);