package com.ringcentral.definitions;


/**
 * Error response
 */
public class ASGErrorResponse {
    /**
     * Error code
     */
    public String errorCode;
    /**
     * Human-readable description of an error. Not suitable for end users
     * Example: AccountId 1234 is invalid
     */
    public String description;

    public ASGErrorResponse errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ASGErrorResponse description(String description) {
        this.description = description;
        return this;
    }
}
