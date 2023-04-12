package com.ringcentral.definitions;


public class CaiErrorResponse {
    /**
     *
     */
    public CaiErrorCodeResponse[] errors;

    public CaiErrorResponse errors(CaiErrorCodeResponse[] errors) {
        this.errors = errors;
        return this;
    }
}
