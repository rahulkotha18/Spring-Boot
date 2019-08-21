package com.springbootrest.cruddemo.EXCEPTION;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
