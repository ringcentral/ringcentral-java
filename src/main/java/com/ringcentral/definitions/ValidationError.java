package com.ringcentral.definitions;


public class ValidationError {
    /**
     * Error code
     */
    public String errorCode;
    /**
     * Error message
     */
    public String message;
    /**
     * Name of invalid parameter
     */
    public String parameterName;

    public ValidationError errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ValidationError message(String message) {
        this.message = message;
        return this;
    }

    public ValidationError parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

}
