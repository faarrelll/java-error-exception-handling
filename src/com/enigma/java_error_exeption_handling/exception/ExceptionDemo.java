package com.enigma.java_error_exeption_handling.exception;

public class ExceptionDemo {
    public static void main(String[] args) throws InstantiationException, CustomError {
        try {
            Person person = new Person("", 0);
        } catch (CustomError e) {
            System.out.println(e.getMessage());
        }



//        try{
//            int x = 10
//        }
//        catch (Exception e) {
//            System.out.println("syntax");
//        }

    }
}
