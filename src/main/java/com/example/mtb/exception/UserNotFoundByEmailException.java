package com.example.mtb.exception;

public class UserNotFoundByEmailException extends RuntimeException{
    private String message;

    public UserNotFoundByEmailException(String message) {
        this.message = message;
    }
}
