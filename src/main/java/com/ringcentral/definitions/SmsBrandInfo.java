package com.ringcentral.definitions;


public class SmsBrandInfo {
    /**
     * Identifier of the associated TCR brand
     */
    public String id;
    /**
     * Status of the associated TCR campaign
     * Enum: Created, Submitted, Confirmed, SubmitFailed, UpdateRequested, DeleteRequested, CampaignSuspended, CampaignExpired, Draft, PreVetFailed, Unconfirmed
     */
    public String status;
    /**
     *
     */
    public ApiError[] errors;

    public SmsBrandInfo id(String id) {
        this.id = id;
        return this;
    }

    public SmsBrandInfo status(String status) {
        this.status = status;
        return this;
    }

    public SmsBrandInfo errors(ApiError[] errors) {
        this.errors = errors;
        return this;
    }
}
