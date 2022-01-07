package com.ringcentral.definitions;


// Error response
public class ErrorResponse {
    /**
     * Error code
     * Example: CMN-101
     */
    public String errorCode;
    /**
     * Human-readable description of the error. Not suitable for end users.
     * Example: AccountId 1234 is invalid
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
