package com.enigma.java_error_exeption_handling.reasons;

public class InputErrors {
    public static void main(String[] args) {
        try {
            String input = "abc";
            int number = Integer.parseInt(input); // akan terjadi error
            System.out.println("Number is " + number);
        } catch(NumberFormatException e) {
            System.out.println("Input harus berupa angka");
        } catch(Exception e) {
            System.out.println("Exception tak terduga");
        }
    }
}
