package com.hamitmizrak.examples.javacore.tutorials.tutorials_2025.week_2;

import java.time.LocalDate;

public class _11_3_LocalDate {
    public static void main(String[] args) {
        // LocalDate Java 8 sürümüyle
        // LocalDate : java.time
        // Sadece Tarih: yıl,ay,gün
        // Tercihi: Basit ve güvenli bir kullanım
        LocalDate today = LocalDate.now(); // bugünü tarihi
        System.out.println("Bugün: "+today);

        LocalDate specialDay = LocalDate.of(2025,1,27);
        System.out.println("Belirli tarihi:"+specialDay);

    }
}