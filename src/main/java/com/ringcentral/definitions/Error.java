package com.ringcentral.definitions;


public class Error {
    /**
     * Logical error code
     * Required
     * Example: XYZ-123
     */
    public String errorCode;
    /**
     * User-friendly error message
     * Required
     * Example: Something went wrong
     */
    public String message;
    /**
     * The name of the request parameter or attribute that caused the error
     * Example: accountId
     */
    public String parameterName;

    public Error errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    public Error parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }
}
