package com.enigma.java_error_exeption_handling.reasons;

import java.util.Arrays;

public class SystemErrors {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[Integer.MAX_VALUE];
            System.out.println("Sampai sinikah");
            System.out.println(Arrays.toString(intArray));
            System.out.println("Atau sini");
        } catch (OutOfMemoryError e) {
            System.out.println("Spek penampung kurang");
            System.out.println(e.getMessage());
        }
    }
}
