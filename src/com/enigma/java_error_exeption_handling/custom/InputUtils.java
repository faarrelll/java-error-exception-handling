package com.enigma.java_error_exeption_handling.custom;

import java.util.Scanner;

public class InputUtils {
    public static String inputString(String info){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("%s: ", info);
            String input = scanner.nextLine();
            if(input.isBlank()){
                continue;
            }
            return input;
        }
    }

    public static int inputInt(String info){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("%s: ", info);
            try {
                int input = Integer.parseInt(scanner.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
