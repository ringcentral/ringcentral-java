package com.ringcentral.definitions;


public class SmsCampaignInfo
{
    /**
     * Identifier of the associated TCR campaign
     */
    public String id;
    public SmsCampaignInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Status of the associated TCR campaign
     * Enum: Created, Submitted, Confirmed, SubmitFailed, UpdateRequested, DeleteRequested, CampaignSuspended, CampaignExpired, Draft, PreVetFailed, Unconfirmed
     */
    public String status;
    public SmsCampaignInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Use case of the associated TCR campaign
     */
    public String registrationTier;
    public SmsCampaignInfo registrationTier(String registrationTier)
    {
        this.registrationTier = registrationTier;
        return this;
    }

    /**
     * List of sub use cases of the associated TCR campaign
     */
    public String[] useCases;
    public SmsCampaignInfo useCases(String[] useCases)
    {
        this.useCases = useCases;
        return this;
    }

    /**
     */
    public ApiError[] errors;
    public SmsCampaignInfo errors(ApiError[] errors)
    {
        this.errors = errors;
        return this;
    }

    /**
     */
    public ConsentSettings consentSettings;
    public SmsCampaignInfo consentSettings(ConsentSettings consentSettings)
    {
        this.consentSettings = consentSettings;
        return this;
    }

    /**
     * Coverage type.
     * Enum: PhoneNumber, Account, Conversational, Informational, Promotional
     */
    public String coverageType;
    public SmsCampaignInfo coverageType(String coverageType)
    {
        this.coverageType = coverageType;
        return this;
    }
}