package com.ringcentral.definitions;


public class AsrApiResponse {
    /**
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public AsrApiResponseResponse response;

    public AsrApiResponse status(String status) {
        this.status = status;
        return this;
    }

    public AsrApiResponse response(AsrApiResponseResponse response) {
        this.response = response;
        return this;
    }
}
