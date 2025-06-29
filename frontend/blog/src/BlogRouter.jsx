// rfce ==> TAB
// REACT
import React from 'react';

// I18N
import { withTranslation } from 'react-i18next';

// HEADER,MAIN,FOOTER
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import MainComponent from './components/MainComponent';

// ROUTER
import { Navigate, Route, Routes } from 'react-router-dom';

// BLOG CATEGORY
import BlogCategoryList from './components/blog_category/BlogCategoryList';
import BlogCategoryCreate from './components/blog_category/BlogCategoryCreate';
import BlogCategoryView from './components/blog_category/BlogCategoryView';
import BlogCategoryUpdate from './components/blog_category/BlogCategoryUpdate';

// BLOG 
import BlogList from './components/blog/BlogList';
import BlogCreate from './components/blog/BlogCreate';
import BlogView from './components/blog/BlogView';
import BlogUpdate from './components/blog/BlogUpdate';

// CLASS COMPONENT BlogRouter
function BlogRouter() {

    // RETURN
        return (
            <React.Fragment>

                {/* Blog Header */}
                    <HeaderComponent logo="fa-solid fa-blog"></HeaderComponent>

                {/* Blog Main */}
                {/* Dark Mode için: App-header yazmalısınız*/}
                    <div class="container">
                    <Routes>
                            {/* Root Path */}
                            <Route path={"/"} element={<MainComponent />} />
                            <Route path={"/index"} element={<MainComponent />} />

                             {/* Blog Categories */}
                            <Route path={"/blog/list"} element={<BlogList/>} />
                            <Route path={"/blog/create"} element={<BlogCreate/>} />
                            <Route path={"/blog/view/:id"} element={<BlogView/>} />
                            <Route path={"/blog/update/:id"} element={<BlogUpdate/>} />


                            {/* Blog Categories */}
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
                            <Route path={"*"} element={<Navigate to={"/"} />} />
                            {/* 
                            <Route path="/blog/:slug" element={<BlogDetail />} />
                            <Route path="*" element={<NotFound />} /> */}
                    </Routes>
                    </div>

                    <FooterComponent copy="&copy; Bütün Haklar Saklıdır."></FooterComponent>
            </React.Fragment>
        ); //end Return
}//end BlogRouter

// I18N => EXPORT
// export default withTranslation()(BlogRouter);
export default withTranslation()(BlogRouter) ;