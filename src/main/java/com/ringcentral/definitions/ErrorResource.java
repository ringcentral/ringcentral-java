package com.ringcentral.definitions;


public class ErrorResource {
    /**
     * Required
     */
    public Error[] errors;

    public ErrorResource errors(Error[] errors) {
        this.errors = errors;
        return this;
    }
}
