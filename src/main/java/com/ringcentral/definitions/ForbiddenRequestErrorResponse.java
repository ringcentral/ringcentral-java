package com.ringcentral.definitions;


public class ForbiddenRequestErrorResponse {
    /**
     *
     */
    public ErrorBody[] errors;

    public ForbiddenRequestErrorResponse errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
