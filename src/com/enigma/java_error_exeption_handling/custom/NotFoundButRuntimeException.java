package com.enigma.java_error_exeption_handling.custom;

/*
* Untuk membuat custom exception kita harus extend ke beberapa class exception yang tersedia
* garis besarnya itu, kalau yang Checked itu pakai extend Exception class
* sedangkan kalau yang unchecked itu pakai extend yang RuntimeException class
* Exception itu checked
* RuntimeException itu unchecked
* */
public class NotFoundButRuntimeException extends RuntimeException {
    public NotFoundButRuntimeException(String message) {
        super(message);
    }
}
