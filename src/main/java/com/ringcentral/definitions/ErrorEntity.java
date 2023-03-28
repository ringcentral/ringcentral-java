package com.ringcentral.definitions;


public class ErrorEntity {
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
    /**
     * Value of invalid parameter
     */
    public String parameterValue;

    public ErrorEntity errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ErrorEntity message(String message) {
        this.message = message;
        return this;
    }

    public ErrorEntity parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    public ErrorEntity parameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }
}
