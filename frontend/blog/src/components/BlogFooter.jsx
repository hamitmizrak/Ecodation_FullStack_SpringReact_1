//rcc
// i18n 
// Dark mode

//REACT
import React, { Component } from 'react';

//I18N
import { withTranslation } from 'react-i18next';

// Tailwind React Material
import { Typography } from "@material-tailwind/react";

// Default Validation 
import PropTypes from 'prop-types';

////////////////////////////////////////////////////////////////////////////////////////
// CLASS BlogHeader
class BlogFooter extends Component {

    // Display
    static displayName = "Blog Footer"

    //Construct 
    constructor(props) {
        super(props);

        //STATE
        this.state = {};

        //BIND
        // this.method=this.method.bind(this);
    }

    // CDM

    // RENDER
    render() {

        const LINKS = [
            {
                title: "Product",
                items: ["Overview", "Features", "Solutions", "Tutorials"],
            },
            {
                title: "Company",
                items: ["About us", "Careers", "Press", "News"],
            },
            {
                title: "Resource",
                items: ["Blog", "Newsletter", "Events", "Help center"],
            },
        ];

        // DATE
        const currentYear = new Date().getFullYear();

        //RETURN
        return (
            <footer className="relative w-full  bg-hamitmizrak-antrasit text-hamitmizrak-white">
                <div className="mx-auto w-full max-w-7xl px-8">
               

                </div>
            </footer>
        ); // end return
    } //end render
} //end class BlogHeader

//EXPORT
export default withTranslation()(BlogFooter);

// Default Değerler (Class)
BlogFooter.defaultProps={
    footer_name:'Blog Project44',
}

// Default Validations (Class)
BlogFooter.propTypes={
    footer_name:PropTypes.string.isRequired,
    //footer_name:PropTypes.number.isRequired,
}
