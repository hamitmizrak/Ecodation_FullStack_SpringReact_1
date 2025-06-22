// rfce
import React from 'react'

// I18N
import { withTranslation } from 'react-i18next'
import OtherLanguageReusability from '../internationalization/OtherLanguageReusability'; // Resuability

// REACT ROUTER
import {Link} from "react-router-dom/dist";

// CSS DARK MODE
import DarkMode from "./DarkMode/DarkMode";

// FUNCTION COMPONENT HEADER
function HeaderComponent(props) {


  // object destructing (t= I18N)
  const { t } = props;
  return (
  // <i class={props.logo}></i>
    <React.Fragment>
      <header >
        <nav className="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
          <div className="container">
            {/* LOGO */}
              <Link className="navbar-brand"  style={{ color: `#123}` }} to="/"><i className={props.logo}></i></Link>

            <button
                className="navbar-toggler d-lg-none"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#collapsibleNavId"
                aria-controls="collapsibleNavId"
                aria-expanded="false"
                aria-label="Toggle navigation"
            >
              <span className="navbar-toggler-icon" />
            </button>
            <div className="collapse navbar-collapse" id="collapsibleNavId">
              <ul className="navbar-nav me-auto mt-2 mt-lg-0">
                <li className="nav-item">
                  {/* Root: relative Path */}
                  <Link to="/blog/category/list">Blog Category</Link>
                </li>
              </ul>


              {/* Dark Mode */}
              <ul className="navbar-nav mr-1 me-auto44 mt-2 mt-lg-0">
                <li className="nav-item">
                  {/* dark mode */}
                  <DarkMode />
                </li>


                <li className="nav-item dropdown">
                  <a
                      className="nav-link dropdown-toggle"
                      href="#"
                      id="dropdownId"
                      data-bs-toggle="dropdown"
                      aria-haspopup="true"
                      aria-expanded="false"
                  >
                    {t('language')}
                  </a>

                  <div className="dropdown-menu" aria-labelledby="dropdownId">
                    <OtherLanguageReusability />
                  </div>
                </li>

                <li className="nav-item dropdown">
                  <a
                      className="nav-link dropdown-toggle"
                      href="#"
                      id="dropdownId"
                      data-bs-toggle="dropdown"
                      aria-haspopup="true"
                      aria-expanded="false"
                  >
                    {t('login')}
                  </a>

                  <div className="dropdown-menu" aria-labelledby="dropdownId">
                    <Link className="dropdown-item" to="/login" >{t('login')}</Link>
                    <Link className="dropdown-item" to="/register/create" >{t('register')} </Link>
                  </div>
                </li>

                  {/* Search Form */}
                  <form  className="d-flex my-2 my-lg-0 ">
                  <input
                      type="text"
                      id="tags"
                      className="form-control me-sm-2"
                      placeholder={t('search')}
                  />
                  <button
                      type="submit"
                      className="btn btn-outline-success my-2 my-sm-0"
                     >
                    {t('search')}
                  </button>
                </form>

              </ul>

            </div>
          </div>
        </nav>
        <span style={{ marginBottom: "2rem" }}>.</span>
      </header>

    </React.Fragment>
  )
}

// EXPORT
export default withTranslation()(HeaderComponent) 