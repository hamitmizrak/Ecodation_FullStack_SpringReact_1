// rfce ==> TAB

// REACT
import React from 'react'

// I18N
import { withTranslation } from 'react-i18next'

// HEADER,MAIN,FOOTER
import BlogHeader from './components/BlogHeader.jsx'
import BlogFooter from './components/BlogFooter'
import BlogMain from './components/BlogMain'

// ROUTER
import { Navigate, Route, Routes } from 'react-router-dom'

// BLOG CATEGORY
import BlogCategoryList from "./components/blogCategory/BlogCategoryList";
import BlogCategoryCreate from "./components/blogCategory/BlogCategoryCreate";
import BlogCategoryView from "./components/blogCategory/BlogCategoryView";
import BlogCategoryUpdate from "./components/blogCategory/BlogCategoryUpdate";

// FUNCTION BlogRouter
function BlogRouter() {

    //RETURN
    return (
        <React.Fragment>
            {/* Blog Header */}
            <BlogHeader logo44="fa-solid fa-road-barrier"></BlogHeader>

            {/* Blog Main */}
           {/* Dark Mode için: App-header yazmalısınız*/}
            <div className="container App-header">
                <Routes>
                    {/* Root Path */}
                    <Route path={"/"} element={<BlogMain/>} />
                    <Route path={"/index"} element={<BlogMain/>} />

                    {/* Blog Category */}
                    <Route path={"/blog/category/list"} element={<BlogCategoryList/>} />
                    <Route path={"/blog/category/create"} element={<BlogCategoryCreate/>} />
                    <Route path={"/blog/category/view/:id"} element={<BlogCategoryView/>} />
                    <Route path={"/blog/category/update/:id"} element={<BlogCategoryUpdate/>} />

                    {/* Blog */}
                    {/* Register */}
                    {/* Login */}
                    {/* Email */}
                    {/* Rol */}

                    {/* Bad Request */}
                    {/* <Route path={"*"} element={<h1>404</h1>} /> */}
                    <Route path={"*"} element={<Navigate to={"/"}/>}/>
                </Routes>
            </div>  {/*  Main */}

            {/* Blog Footer */}
            <BlogFooter copy="&copy; Bütün Haklar Saklıdır."></BlogFooter>
        </React.Fragment>
    ) //end Return
} //end BlogRouter

// I18N
// EXPORT (BlogRouter)
export default withTranslation()(BlogRouter) 
