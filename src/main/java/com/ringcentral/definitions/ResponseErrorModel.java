package com.ringcentral.definitions;


public class ResponseErrorModel {
    /**
     * Logical error code (typically, 3 letters followed with number, dash separated)
     * Example: XXX-123
     */
    public String errorCode;
    /**
     * User-friendly error message
     * Example: Something went wrong
     */
    public String message;
    /**
     * The name of the API parameter which caused the error
     * Example: status
     */
    public String parameterName;

    public ResponseErrorModel errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ResponseErrorModel message(String message) {
        this.message = message;
        return this;
    }

    public ResponseErrorModel parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }
}
