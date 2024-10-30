package com.enigma.java_error_exeption_handling.custom;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = {1,2,3,4};

        try {
            try {
                System.out.println(number / 0);
            } catch (Exception e) {
//                e.getMessage(); // cuma print pesan errornya aja
                System.out.println("Masuk Sini Inner Nest");
                e.printStackTrace(); // bagus untuk development, lebih detail seperti letak errornya dimana
            } finally {
                System.out.println(numbers[4]);
            }
        } catch (Exception e) {
            System.out.println("Masuk Sini Outer Nest");
            e.printStackTrace();
        }
    }
}
