package com.ringcentral.definitions;


public class BadRequest {
    /**
     * List of errors
     */
    public ErrorBody[] errors;

    public BadRequest errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
