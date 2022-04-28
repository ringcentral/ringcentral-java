package com.ringcentral.definitions;


public class BadRequest {
    /**
     *
     */
    public ErrorBody[] errors;

    public BadRequest errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
