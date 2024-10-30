package com.enigma.java_error_exeption_handling.exception;

public class Person {
    private String getName() {
        return name;
    }

    private String name = "";

    public Person(String firstName, Integer age) throws InstantiationException, CustomError {
        if (age <= 5) {
//            throw new InstantiationException("age must be greater than 5");
            throw new CustomError("age must be greater than 5");
        }
    }
}
