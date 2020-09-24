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
    /**
     *
     */
    public String featureName;
    /**
     *
     */
    public String parameterValue;

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

    public ValidationError featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    public ValidationError parameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

}
