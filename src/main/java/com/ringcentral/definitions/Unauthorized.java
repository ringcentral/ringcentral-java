package com.ringcentral.definitions;


public class Unauthorized {
    /**
     *
     */
    public ErrorBody[] errors;

    public Unauthorized errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
