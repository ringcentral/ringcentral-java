package com.ringcentral.definitions;


/**
 * Generalized API error structure suitable for any error type
 */
public class ApiErrorWithParameter {
    /**
     * Logical error code (typically, 3 letters followed with number, dash separated)
     * Required
     * Example: XXX-123
     */
    public String errorCode;
    /**
     * User-friendly error message
     * Required
     * Example: Something went wrong
     */
    public String message;
    /**
     * The name of the API parameter/attribute which caused the error
     */
    public String parameterName;
    /**
     * The value of the API parameter/attribute which caused the error
     */
    public String parameterValue;

    public ApiErrorWithParameter errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public ApiErrorWithParameter message(String message) {
        this.message = message;
        return this;
    }

    public ApiErrorWithParameter parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    public ApiErrorWithParameter parameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }
}
