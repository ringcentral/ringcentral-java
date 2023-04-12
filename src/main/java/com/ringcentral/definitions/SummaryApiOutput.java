package com.ringcentral.definitions;


public class SummaryApiOutput {
    /**
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public SummaryApiResponse response;

    public SummaryApiOutput status(String status) {
        this.status = status;
        return this;
    }

    public SummaryApiOutput response(SummaryApiResponse response) {
        this.response = response;
        return this;
    }
}
