package com.ringcentral.definitions;


public class LoginToExtensionRequiredErrorResponse {
    /**
     *
     */
    public ErrorBody[] errors;

    public LoginToExtensionRequiredErrorResponse errors(ErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
