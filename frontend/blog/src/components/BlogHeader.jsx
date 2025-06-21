// rfce ==> TAB

// HEADER
// REACT
import React, { Fragment, useState } from 'react'

// Link
import { Link } from 'react-router-dom'

// i18N
import { withTranslation } from 'react-i18next'

// Dil için (Reusability)
import OtherLanguageReusability from "../internationalization/OtherLanguageReusability";

// Dark Mode
import '../dark.css'
import DarkMode from "./DarkMode/DarkMode";

////////////////////////////////////////////////////////////////////////////////////////////////////
// npm i @headlessui/react
// npm i @heroicons/react
// https://tailwindui.com/components/marketing/elements/headers

// Font Awesome
//npm i @fortawesome/react-fontawesome

// FontAwesome
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'

// Dialog
import { Dialog, Disclosure, Popover, Transition } from '@headlessui/react'
import {
    ArrowPathIcon,
    Bars3Icon,
    ChartPieIcon,
    CursorArrowRaysIcon,
    FingerPrintIcon,
    SquaresPlusIcon,
    XMarkIcon,
} from '@heroicons/react/24/outline'

import { ChevronDownIcon, PhoneIcon, PlayCircleIcon } from '@heroicons/react/20/solid'



////////////////////////////////////////////////////////////////////////////////////////////////////
// Navbar
const blogCategory = [
    { name: 'BlogCategoryList', description: 'Blog Category List', href: '/blog/category/list', icon: ChartPieIcon },
    { name: 'BlogCategoryCreate', description: 'Blog Category Create', href: '/blog/category/create', icon: CursorArrowRaysIcon },
]


const products = [
    { name: 'Analytics', description: 'Get a better understanding of your traffic', href: '#', icon: ChartPieIcon },
    { name: 'Engagement', description: 'Speak directly to your customers', href: '#', icon: CursorArrowRaysIcon },
    { name: 'Security', description: 'Your customers’ data will be safe and secure', href: '#', icon: FingerPrintIcon },
    { name: 'Integrations', description: 'Connect with third-party tools', href: '#', icon: SquaresPlusIcon },
    { name: 'Automations', description: 'Build strategic funnels that will convert', href: '#', icon: ArrowPathIcon },
]

const callsToAction = [
    { name: 'Watch demo', href: '#', icon: PlayCircleIcon },
    { name: 'Contact sales', href: '#', icon: PhoneIcon },
]

function classNames(...classes) {
    return classes.filter(Boolean).join(' ')
}

// Admin
function admin() {
    return (
        <li className="mb-4 lg:mb-0 lg:pr-2" data-te-nav-item-ref="">
            {/* Dashboard link */}
            {/* User avatar */}
            <img
                src="https://tecdn.b-cdn.net/img/new/avatars/2.jpg"
                className="rounded-full"
                style={{ height: 25, width: 25 }}
                alt=""
                loading="lazy"
            />
        </li>
    );
}
{/* <li className="mb-4 lg:mb-0 lg:pr-2" data-te-nav-item-ref="">
        <a
            className="text-blue-600 transition duration-200 hover:text-neutral-700 hover:ease-in-out focus:text-neutral-700 disabled:text-black/30 motion-reduce:transition-none dark:text-neutral-200 dark:hover:text-neutral-300 dark:focus:text-neutral-300 lg:px-2 [&.active]:text-black/90 dark:[&.active]:text-zinc-400"
            href="#"
            data-te-nav-link-ref="">
            Admin
        </a>
    </li> */}


// Login Register
function loginAndRegister() {
    return (
        <React.Fragment>

            <li className="mb-4 lg:mb-0 lg:pr-2" data-te-nav-item-ref="">
                {/* Cart Icon */}
                <Link to=""
                    className="mr-2 rounded-full text-neutral-600 transition duration-200 hover:text-neutral-700 hover:ease-in-out focus:text-neutral-700 disabled:text-black/30 motion-reduce:transition-none dark:text-neutral-200 dark:hover:text-neutral-300 dark:focus:text-neutral-300 [&.active]:text-black/90 dark:[&.active]:text-neutral-400"
                    href="#">
                    <span className="[&>svg]:w-5">
                        <FontAwesomeIcon icon="fa-regular fa-user" />
                        <i class="text-hamitmizrak-red fa-regular fa-user">
                            {/* {t('login')}  */}
                        </i>
                    </span>
                </Link>
            </li>

            <li className="mb-4 lg:mb-0 lg:pr-2" data-te-nav-item-ref="">
                <Link to=""
                    className="mr-2 text-neutral-600 transition duration-200 hover:text-neutral-700 hover:ease-in-out focus:text-neutral-700 disabled:text-black/30 motion-reduce:transition-none dark:text-neutral-200 dark:hover:text-neutral-300 dark:focus:text-neutral-300 [&.active]:text-black/90 dark:[&.active]:text-neutral-400"
                    href="#">
                    <span className="[&>svg]:w-5">
                        <i class="text-hamitmizrak-red fa-solid fa-user-shield">
                            {/* {t('register')}  */}
                        </i>
                    </span>
                </Link>
            </li>
        </React.Fragment>
    )
};

////////////////////////////////////////////////////////////////////////////////////////////////////
// FUNCTION
function BlogHeader({ props, t, i18n }) {
    const [mobileMenuOpen, setMobileMenuOpen] = useState(false)

    // STATE
    const [isAdmin, setIsAdmin] = useState(false)

    // NAVIGATE
    // EFFECT

    // Modal
    const [open, setOpen] = React.useState(false);
    const handleOpen = () => setOpen(!open);

    // bg-sky-100
    return (
        <div>
            <header className="sticky top-0 z-10 bg-hamitmizrak-antrasit text-hamitmizrak-white">

                {/* First Start Navbar */}
                {/* bg-[#FBFBFB] */}
                <nav className="flex-no-wrap relative bg-[#171717]  flex w-full items-center justify-between  py-2 shadow-md shadow-black/5 dark:bg-neutral-600 dark:shadow-black/10 lg:flex-wrap lg:justify-start lg:py-4">
                    <div className="flex w-full flex-wrap items-center justify-between px-3">
                        {/* Hamburger button for mobile view */}

                        {/* Collapsible navigation container */}
                        {/* Left elements */}
                        <div
                            className="!visible hidden flex-grow basis-[100%] items-center lg:!flex lg:basis-auto"
                            id="navbarSupportedContent1"
                            data-te-collapse-item="">

                            {/* Left navigation links */}
                            <ul
                                className="list-style-none mr-auto flex flex-col pl-0 lg:flex-row"
                                data-te-navbar-nav-ref="">

                                {/* Admin */}  {/* Register */}
                                {/*Eğer adminse, login veya register görünmesin*/}
                                {
                                    (isAdmin) ? admin() : loginAndRegister()
                                }
                                <Popover className="relative">
                                    <Popover.Button className="flex items-center gap-x-1 text-sm font-semibold leading-6 ">
                                        {t('blog')}
                                        <ChevronDownIcon className="h-5 w-5 flex-none text-gray-400" aria-hidden="true" />
                                    </Popover.Button>

                                    <Transition
                                        as={Fragment}
                                        enter="transition ease-out duration-200"
                                        enterFrom="opacity-0 translate-y-1"
                                        enterTo="opacity-100 translate-y-0"
                                        leave="transition ease-in duration-150"
                                        leaveFrom="opacity-100 translate-y-0"
                                        leaveTo="opacity-0 translate-y-1"
                                    >
                                        <Popover.Panel className="absolute -left-8 top-full z-10 mt-3 w-screen max-w-md overflow-hidden rounded-3xl bg-white shadow-lg ring-1 ring-gray-900/5">
                                            <div className="p-4">
                                                {blogCategory.map((item) => (
                                                    <div
                                                        key={item.name}
                                                        className="group relative flex items-center gap-x-6 rounded-lg p-4 text-sm leading-6 hover:bg-gray-50"
                                                    >
                                                        <div className="flex h-11 w-11 flex-none items-center justify-center rounded-lg bg-gray-50 group-hover:bg-white">
                                                            <item.icon className="h-6 w-6 text-gray-600 group-hover:text-indigo-600" aria-hidden="true" />
                                                        </div>
                                                        <div className="flex-auto">
                                                            <Link to={item.href} className="block font-semibold ">
                                                                {item.name}
                                                                <span className="absolute inset-0" />
                                                            </Link>
                                                            <p className="mt-1 text-gray-600">{item.description}</p>
                                                        </div>
                                                    </div>
                                                ))}
                                            </div>
                                        </Popover.Panel>
                                    </Transition>
                                </Popover>
                            </ul>
                        </div>

                        {/* Right elements */}
                        <div className="relative flex items-center">
                            {/* Second dropdown container */}
                            <div
                                className="relative"
                                data-te-dropdown-ref=""
                                data-te-dropdown-alignment="end">

                                {/*Dark Mode için*/}
                                {/* Second dropdown trigger */}
                                <a
                                    className="hidden-arrow flex items-center whitespace-nowrap transition duration-150 ease-in-out motion-reduce:transition-none"
                                    href="#"
                                    id="dropdownMenuButton2"
                                    role="button"
                                    data-te-dropdown-toggle-ref=""
                                    aria-expanded="false">
                                    {/* Dil */}
                                    <DarkMode />
                                </a>


                                {/* Second dropdown trigger */}
                                <a
                                    className="hidden-arrow flex items-center whitespace-nowrap transition duration-150 ease-in-out motion-reduce:transition-none"
                                    href="#"
                                    id="dropdownMenuButton2"
                                    role="button"
                                    data-te-dropdown-toggle-ref=""
                                    aria-expanded="false">
                                    {/* Dil */}
                                    <OtherLanguageReusability />
                                </a>
                            </div>
                        </div>
                    </div>
                </nav>
                {/* First End Navbar */}

                {/* Second Start Navbar */}
                <nav className=" mx-auto  text-2xl flex max-w-7xl items-center justify-between p-6 lg:px-8" aria-label="Global">
                    <div className="flex lg:flex-1">
                        <a href="#" className="-m-1.5 p-1.5">
                            <span className="sr-only">Blog</span>
                            <Link to="/">
                                {/* <i className={props.logo44}></i> */}
                                <i className=" fa-solid fa-road-barrier"></i>
                            </Link>
                        </a>
                    </div>

                    <div className="flex lg:hidden">
                        <button
                            type="button"
                            className="-m-2.5 inline-flex items-center justify-center rounded-md p-2.5 text-hamitmizrak-yellow"
                            onClick={() => setMobileMenuOpen(true)}
                        >
                            <span className="sr-only">Open main menu</span>
                            <Bars3Icon className="h-6 w-6" aria-hidden="true" />
                        </button>
                    </div>

                    <Popover.Group className="hidden  lg:flex lg:gap-x-12">
                        <Link to="" className="text-sm font-semibold leading-6 ">
                            {t('home')}
                        </Link>

                        <Link to="" className="text-sm font-semibold leading-6 ">
                            {t('about')}
                        </Link>

                        <Popover className="relative">
                            <Popover.Button className="flex items-center gap-x-1 text-sm font-semibold leading-6 ">
                                {t('blog')}
                                <ChevronDownIcon className="h-5 w-5 flex-none text-gray-400" aria-hidden="true" />
                            </Popover.Button>

                            <Transition
                                as={Fragment}
                                enter="transition ease-out duration-200"
                                enterFrom="opacity-0 translate-y-1"
                                enterTo="opacity-100 translate-y-0"
                                leave="transition ease-in duration-150"
                                leaveFrom="opacity-100 translate-y-0"
                                leaveTo="opacity-0 translate-y-1"
                            >
                                <Popover.Panel className="absolute -left-8 top-full z-10 mt-3 w-screen max-w-md overflow-hidden rounded-3xl bg-white shadow-lg ring-1 ring-gray-900/5">
                                    <div className="p-4">
                                        {products.map((item) => (
                                            <div
                                                key={item.name}
                                                className="group relative flex items-center gap-x-6 rounded-lg p-4 text-sm leading-6 hover:bg-gray-50"
                                            >
                                                <div className="flex h-11 w-11 flex-none items-center justify-center rounded-lg bg-gray-50 group-hover:bg-white">
                                                    <item.icon className="h-6 w-6 text-gray-600 group-hover:text-indigo-600" aria-hidden="true" />
                                                </div>
                                                <div className="flex-auto">
                                                    <a href={item.href} className="block font-semibold ">
                                                        {item.name}
                                                        <span className="absolute inset-0" />
                                                    </a>
                                                    <p className="mt-1 text-gray-600">{item.description}</p>
                                                </div>
                                            </div>
                                        ))}
                                    </div>

                                    <div className="grid grid-cols-2 divide-x divide-gray-900/5 bg-gray-50">
                                        {callsToAction.map((item) => (
                                            <a
                                                key={item.name}
                                                href={item.href}
                                                className="flex items-center justify-center gap-x-2.5 p-3 text-sm font-semibold leading-6  hover:bg-gray-100"
                                            >
                                                <item.icon className="h-5 w-5 flex-none text-gray-400" aria-hidden="true" />
                                                {item.name}
                                            </a>
                                        ))}
                                    </div>
                                </Popover.Panel>
                            </Transition>
                        </Popover>

                        <Link to="" className="text-sm font-semibold leading-6 ">
                            {t('newspaper')}
                        </Link>

                        <Link to="" className="text-sm font-semibold leading-6 ">
                            {t('contact')}
                        </Link>
                    </Popover.Group>

                    <div className="hidden lg:flex lg:flex-1 lg:justify-end">
                        <Link
                            to=""
                            className="text-sm font-semibold leading-6 hidden"
                            onClick={handleOpen} variant="gradient">
                            {t('login')} <span aria-hidden="true">&rarr;</span>
                        </Link>
                    </div>
                </nav>
                {/* Second End Navbar */}

                <Dialog as="div" className="lg:hidden" open={mobileMenuOpen} onClose={setMobileMenuOpen}>
                    <div className="fixed inset-0 z-10" />
                    <Dialog.Panel className="fixed inset-y-0 right-0 z-10 w-full overflow-y-auto bg-white px-6 py-6 sm:max-w-sm sm:ring-1 sm:ring-gray-900/10">
                        <div className="flex items-center justify-between">
                            <a href="#" className="-m-1.5 p-1.5">
                                <span className="sr-only">Your Company</span>
                                <img
                                    className="h-8 w-auto"
                                    src="https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=600"
                                    alt=""
                                />
                            </a>
                            <button
                                type="button"
                                className="-m-2.5 rounded-md p-2.5  "
                                onClick={() => setMobileMenuOpen(false)}
                            >
                                <span className="sr-only">Close menu</span>
                                <XMarkIcon className="h-6 w-6" aria-hidden="true" />
                            </button>
                        </div>

                        <div className="mt-6 flow-root ">
                            <div className="-my-6 divide-y divide-gray-500/10">
                                <div className="space-y-2 py-6 ">

                                    {/* Mobil Screen */}
                                    <Disclosure as="div" className="-mx-3">
                                        {({ open }) => (
                                            <React.Fragment>
                                                <Link
                                                    to=""
                                                    className="-mx-3 block rounded-lg px-3 py-2 text-base font-semibold leading-7  hover:bg-gray-50"
                                                >
                                                    {t('home')}
                                                </Link>

                                                <Link
                                                    to=""
                                                    className="-mx-3 block rounded-lg px-3 py-2 text-base font-semibold leading-7  hover:bg-gray-50"
                                                >
                                                    {t('about')}
                                                </Link>

                                                <Disclosure.Button className="flex w-full items-center justify-between rounded-lg py-2 pl-3 pr-3.5 text-base font-semibold leading-7  hover:bg-gray-50">
                                                    {t('blog')}
                                                    <ChevronDownIcon
                                                        className={classNames(open ? 'rotate-180' : '', 'h-5 w-5 flex-none')}
                                                        aria-hidden="true"
                                                    />
                                                </Disclosure.Button>

                                                <Disclosure.Panel className="mt-2 space-y-2">
                                                    {[...products, ...callsToAction].map((item) => (
                                                        <Disclosure.Button
                                                            key={item.name}
                                                            as="a"
                                                            href={item.href}
                                                            className="block rounded-lg py-2 pl-6 pr-3 text-sm font-semibold leading-7  hover:bg-gray-50"
                                                        >
                                                            {item.name}
                                                        </Disclosure.Button>
                                                    ))}
                                                </Disclosure.Panel>
                                            </React.Fragment>
                                        )}
                                    </Disclosure>

                                    <Link
                                        to=""
                                        className="-mx-3 block rounded-lg px-3 py-2 text-base font-semibold leading-7  hover:bg-gray-50">
                                        {t('newspaper')}
                                    </Link>

                                    <Link
                                        to=""
                                        className="-mx-3 block rounded-lg px-3 py-2 text-base font-semibold leading-7  hover:bg-gray-50">
                                        {t('contact')}
                                    </Link>
                                </div>

                                <div className="py-6">
                                    <Link
                                        to=""
                                        className="-mx-3 block rounded-lg px-3 py-2.5 text-base font-semibold leading-7  hover:bg-gray-50">
                                        {t('login')}
                                    </Link>
                                </div>
                            </div>
                        </div>
                    </Dialog.Panel>
                </Dialog>

                {/* ScrollSpy */}
                {/* Modal */}
                {/* Card */}
            </header>
        </div>
    )
}

// EXPORT
export default withTranslation()(BlogHeader);