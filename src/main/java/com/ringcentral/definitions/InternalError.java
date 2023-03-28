package com.ringcentral.definitions;


public class InternalError {
    /**
     * List of errors
     */
    public ErrorBody[] errors;

    public InternalError errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
