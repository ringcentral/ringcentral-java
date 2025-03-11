package com.ringcentral.definitions;


public class SmsCampaignInfo {
    /**
     * Identifier of the associated TCR campaign
     */
    public String id;
    /**
     * Status of the associated TCR campaign
     * Enum: Created, Submitted, Confirmed, SubmitFailed, UpdateRequested, DeleteRequested, CampaignSuspended, CampaignExpired, Draft, PreVetFailed, Unconfirmed
     */
    public String status;
    /**
     * Use case of the associated TCR campaign
     */
    public String registrationTier;
    /**
     * List of sub use cases of the associated TCR campaign
     */
    public String[] useCases;
    /**
     *
     */
    public ApiError[] errors;

    public SmsCampaignInfo id(String id) {
        this.id = id;
        return this;
    }

    public SmsCampaignInfo status(String status) {
        this.status = status;
        return this;
    }

    public SmsCampaignInfo registrationTier(String registrationTier) {
        this.registrationTier = registrationTier;
        return this;
    }

    public SmsCampaignInfo useCases(String[] useCases) {
        this.useCases = useCases;
        return this;
    }

    public SmsCampaignInfo errors(ApiError[] errors) {
        this.errors = errors;
        return this;
    }
}
