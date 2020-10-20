package com.ringcentral.definitions;


// Error response
public class ErrorResponse {
    /**
     * Error code
     */
    public String errorCode;
    /**
     * Human-readable description of an error. Not suitable for end users
     */
    public String description;

    public ErrorResponse errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ErrorResponse description(String description) {
        this.description = description;
        return this;
    }

}
