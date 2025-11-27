// admin/resuability/ReusableToast.jsx
// npm install react-hot-toast
import React from "react";
import { Toaster } from "react-hot-toast";

/**
 * Uygulamanın ana (root) seviyesine 1 kez eklenir.
 * Tüm toast mesajlarını ekranda göstermek için merkezi bir bileşendir.
 * İstenirse props ile özelleştirilebilir (pozisyon, duration, tema, vs).
 */
export default function ReusableToast({
                                          position = "top-right",
                                          duration = 4000,
                                          ...props
                                      }) {
    return (
        <Toaster
            position={position}
            toastOptions={{
                duration,
                style: { borderRadius: "10px", padding: "10px" },
                success: { icon: "✅" },
                error: { icon: "⚠️" },
            }}
            {...props}
        />
    );
}
