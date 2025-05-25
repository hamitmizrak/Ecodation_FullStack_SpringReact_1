package com.hamitmizrak.examples.javacore.tutorials.tutorials_2025.week_2;


import java.util.Scanner;

public class _07_5_Switch_Scanner_Conditional {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = scanner.nextInt();

        // switch
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("1<=X<=5 dışındır.");
                break;
        }

        // Scanner Close
        scanner.close();
    }
}