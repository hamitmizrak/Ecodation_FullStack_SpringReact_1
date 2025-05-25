package com.hamitmizrak.runners;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// DATA SET
@Component

// Birden fazla CommandLineRunner varsa, hangi sırayla çalışacaklarını belirlemek için @Order anotasyonu kullanılabilir:
@Order(1)
public class _1_ProjectDataSet implements CommandLineRunner {

    // Injection

    // Address Save
    private void addressSave(){
        System.out.println("Address Added");
    }

    // Customer Save

    // 2 TANE ÜRÜN EKLE

    // SİPARİŞ EKLE

    // RUN
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLine Runner -1 Project Data set -1 ");
        log.info("Project Data set -1 ");
        // addressSave();
        // saveCustomer();
        // Order Kaydet
    }
} // end _1_ProjectDataSet
