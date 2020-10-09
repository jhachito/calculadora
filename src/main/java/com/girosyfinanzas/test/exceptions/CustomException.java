package com.girosyfinanzas.test.exceptions;

public class CustomException extends Exception{
/**
 *
 */
    public static final long serialVersionUID = 700L;

    public CustomException(String message) {
        super(message);
    }
}
