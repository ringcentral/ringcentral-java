package com.ringcentral.definitions;


public class InternalServerErrorResponse {
    /**
     *
     */
    public ErrorBody[] errors;

    public InternalServerErrorResponse errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
