package com.ringcentral.definitions;


public class InvalidRequestResponse {
    /**
     *
     */
    public ErrorBody[] errors;

    public InvalidRequestResponse errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
