package com.ringcentral.definitions;


public class DiarizeApiResponse {
    /**
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public DiarizeApiResponseResponse response;

    public DiarizeApiResponse status(String status) {
        this.status = status;
        return this;
    }

    public DiarizeApiResponse response(DiarizeApiResponseResponse response) {
        this.response = response;
        return this;
    }
}
