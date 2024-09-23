package com.cg.eis.exception;

// Define the custom EmployeeException
public class EmployeeException extends Exception {
    // Constructor to pass the exception message
    public EmployeeException(String message) {
        super(message);
    }
}
