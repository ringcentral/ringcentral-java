package com.ringcentral.definitions;


/**
 * Generalized API error structure suitable for any error type
 */
public class ApiError {
    /**
     * Logical error code (typically, 3 letters followed with number, dash separated)
     * Required
     * Example: XXX-123
     */
    public String errorCode;
    /**
     * User-friendly error message
     * Required
     * Example: Something went wrong
     */
    public String message;

    public ApiError errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ApiError message(String message) {
        this.message = message;
        return this;
    }
}
