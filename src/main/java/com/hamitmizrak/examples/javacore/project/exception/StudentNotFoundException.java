package com.hamitmizrak.examples.javacore.project.exception;

// Öğrenci bulunamazsa Fırlatılacak Özel Excepiton
public class StudentNotFoundException extends RuntimeException {

    // Parametresiz Constructor
    public StudentNotFoundException() {
        super("Kayıt bulunamadı");
    }

    // Parametreli Constructor
    public StudentNotFoundException(String message) {
        super(message);
    }
}
