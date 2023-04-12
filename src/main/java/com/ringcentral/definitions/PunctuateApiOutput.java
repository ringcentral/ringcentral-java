package com.ringcentral.definitions;


public class PunctuateApiOutput {
    /**
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public PunctuateApiResponse response;

    public PunctuateApiOutput status(String status) {
        this.status = status;
        return this;
    }

    public PunctuateApiOutput response(PunctuateApiResponse response) {
        this.response = response;
        return this;
    }
}
