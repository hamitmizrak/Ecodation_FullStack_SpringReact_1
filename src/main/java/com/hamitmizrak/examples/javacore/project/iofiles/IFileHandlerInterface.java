package com.hamitmizrak.examples.javacore.project.iofiles;

import java.util.List;

/**
 * 📌 Dosya işlemleri için temel arayüz
 * Her dosya yönetim sınıfının bu arayüzü uygulaması beklenir.
 * Eğer public yazarsanız farklı classlarda da erişim olur yazmaksak;
 * Sadece o pakettekiler erişim sağlar
 */
public interface IFileHandlerInterface {

    // 📌 Dosya yoksa oluştur, varsa aç.
    void createFileIfNotExists();

    /**
     * 📌 Dosyaya veri yazma metodu.
     * @param data Yazılacak veri.
     */
    void writeFile(String data);

    /**
     * 📌 Dosyadan veri okuma metodu.
     */
    List<String> readFile();

    /**
     * 📌 Loglama işlemi için varsayılan metot.
     */
    default void logInfo(String message) {
        System.out.println("ℹ️ " + message);
    }
}
