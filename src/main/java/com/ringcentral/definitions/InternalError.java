package com.ringcentral.definitions;


public class InternalError {
    /**
     *
     */
    public ErrorBody[] errors;

    public InternalError errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
