package com.ringcentral.definitions;


public class Unauthorized {
    /**
     * List of errors
     */
    public ErrorBody[] errors;

    public Unauthorized errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
