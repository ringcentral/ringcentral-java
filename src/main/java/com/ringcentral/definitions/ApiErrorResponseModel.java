package com.ringcentral.definitions;


/**
 * Standard error response model which is returned in case of any unsuccessful operation
 */
public class ApiErrorResponseModel {
    /**
     * The array of errors (there will be just one in the most of the cases)
     * Required
     */
    public ApiError[] errors;

    public ApiErrorResponseModel errors(ApiError[] errors) {
        this.errors = errors;
        return this;
    }
}
