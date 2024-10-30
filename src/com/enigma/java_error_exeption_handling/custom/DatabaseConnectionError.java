package com.enigma.java_error_exeption_handling.custom;

public class DatabaseConnectionError extends Error {
    public DatabaseConnectionError(String message) {
        super(message);
    }
}
