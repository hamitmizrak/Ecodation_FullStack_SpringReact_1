// admin/resuability/toastHelper.js
// npm install react-hot-toast
import toast from "react-hot-toast";

/**
 * Uygulamanın her yerinde kolayca toast gösterimi için yardımcı fonksiyonlar.
 * İster JS dosyasında ister component içinde import edip çağırabilirsin.
 */

// Kısa success mesajı göster
export function showSuccess(message, options = {}) {
    toast.success(message, options);
}

// Kısa error mesajı göster
export function showError(message, options = {}) {
    toast.error(message, options);
}

// Bilgilendirici toast (renkli, icon ekleyebilirsin)
export function showInfo(message, options = {}) {
    toast(message, { icon: "ℹ️", ...options });
}

// Özelleştirilmiş custom toast (daha fazla içerik, render)
export function showCustom(content, options = {}) {
    toast.custom(content, options);
}

// Promise'li işlem (yükleniyor, başarılı, hatalı)
export function showPromise(promise, messages = {}, options = {}) {
    return toast.promise(
        promise,
        {
            loading: messages.loading || "İşleniyor...",
            success: messages.success || "Başarılı!",
            error: messages.error || "Bir hata oluştu!",
        },
        options
    );
}
