package com.enigma.java_error_exeption_handling.reasons;

public class LogicErrors {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            for (int i = 0; i <= 5; i++) {
                numbers[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }

        try {
            String nama = null;
            System.out.println(nama.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        }
    }
}
