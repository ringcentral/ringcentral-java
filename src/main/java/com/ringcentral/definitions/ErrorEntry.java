package com.ringcentral.definitions;


/**
 * Single (of potential multiple) error entry in an ASG error response
 */
public class ErrorEntry {
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

    public ErrorEntry errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ErrorEntry message(String message) {
        this.message = message;
        return this;
    }
}
