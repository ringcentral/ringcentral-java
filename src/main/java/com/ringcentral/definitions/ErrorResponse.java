package com.ringcentral.definitions;


// Format of response in case that any error occured during request processing
public class ErrorResponse {
    /**
     * Collection of all gathered errors
     */
    public Error[] errors;

    public ErrorResponse errors(Error[] errors) {
        this.errors = errors;
        return this;
    }

}
