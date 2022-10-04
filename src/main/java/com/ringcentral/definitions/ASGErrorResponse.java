package com.ringcentral.definitions;


/**
 * Error response
 */
public class ASGErrorResponse {
    /**
     * Error code
     * Required
     * Example: CMN-101
     */
    public String errorCode;
    /**
     * Human-readable description of the error. Not suitable for end users.
     * Required
     * Example: AccountId 1234 is invalid
     */
    public String message;

    public ASGErrorResponse errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ASGErrorResponse message(String message) {
        this.message = message;
        return this;
    }
}
