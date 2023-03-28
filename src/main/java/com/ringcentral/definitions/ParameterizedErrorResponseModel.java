package com.ringcentral.definitions;


/**
 * Standard error response which may include parameterized errors
 */
public class ParameterizedErrorResponseModel {
    /**
     * The array of errors (there will be just one in the most of cases)
     * Required
     */
    public ApiErrorWithParameter[] errors;

    public ParameterizedErrorResponseModel errors(ApiErrorWithParameter[] errors) {
        this.errors = errors;
        return this;
    }
}
