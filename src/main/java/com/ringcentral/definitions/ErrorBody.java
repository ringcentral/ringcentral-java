package com.ringcentral.definitions;


public class ErrorBody {
    /**
     * Required
     */
    public String errorCode;
    /**
     * Required
     */
    public String message;

    public ErrorBody errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ErrorBody message(String message) {
        this.message = message;
        return this;
    }
}
