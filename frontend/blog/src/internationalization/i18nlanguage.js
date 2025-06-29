// i18next
import i18n from 'i18next';

// initReactI18next
import {initReactI18next} from 'react-i18next';

// i18n.use()
i18n.use(initReactI18next).init({
    resources: {
        en:
            {
                translations: {
                    'home': 'Home',
                    'about': 'About',
                    'blog': 'blog',
                    'newspaper': 'Newspaper',
                    'contact': 'Contact',
                    'login': 'Login',
                    'register': 'Register',
                    'create': 'Create',
                    'create_all': 'Multiple data create',
                    'clear': 'Clear',
                    'delete_all': 'All Delete',
                    'update':"Update",
                    'show':"Show",
                    'date':'Date',
                    'delete':"Delete",
                    'blog_category_list': 'Blog Category List',
                    'blog_category_update': 'Blog Category Update',
                    'blog_category_view': 'Blog Category View',
                    'blog_category_create': 'Blog Category Create',
                    'blog_category_name':'Blog Category Name',
                    'blog_list': 'Blog Category List',
                    'blog_update': 'Blog Category Update',
                    'blog_view': 'Blog Category View',
                    'blog_create': 'Blog Category Create',
                    'blog_name':'Blog Category Name',
                    'blog_header':'Blog Header',
                    'blog_title':'Blog Title',
                    'blog_content':'Blog Content',
                    'actions':'Actions',
                }
            },
        tr:
            {
                translations: {
                    'home': 'Anasayfa',
                    'about': 'Hakkımızda',
                    'blog': 'Blog',
                    'newspaper': 'Haberler',
                    'contact': 'İletişim',
                    'login': 'Giriş',
                    'register': 'Üye Ol',
                    'create': 'Ekle',
                    'create_all': 'Çoklu veri ekle',
                    'clear': 'Temizle',
                    'delete_all': 'Hepsini Sil',
                    'update':"Güncelle",
                    'show':"Göster",
                    'date':"Tarih",
                    'delete':"Sil",
                    'blog_category_list': 'Blog Kategori Listesi',
                    'blog_category_update': 'Blog Kategori Güncelleme',
                    'blog_category_view': 'Blog Kategori Göster',
                    'blog_category_create': 'Blog Kategori Oluştur',
                    'blog_category_name':'Blog Kategori Adı',
                    'blog_list': 'Blog Listesi',
                    'blog_update': 'Blog Güncellemesi',
                    'blog_view': 'Blog Gösterimi',
                    'blog_create': 'Blog oluştur',
                    'blog_name':'Blog adı',
                    'blog_header':'Blog Ana Başlık',
                    'blog_title':'Blog Alt Başlık',
                    'blog_content':'Blog İçerik',
                    'actions':'Hareketler',
                }
            }
    },
    fallbackLng: 'tr',    //default olarak Türkçe (tr)
    ns: ['translations'], //kelimeleri nerede alsın
    defaultNS: 'translations',
    keySeparator: false,
    interpolation: {escapeValue: false, formatSeparator: ','},
    react: {
        wait: true
    }
});

// EXPORT
export default i18n;