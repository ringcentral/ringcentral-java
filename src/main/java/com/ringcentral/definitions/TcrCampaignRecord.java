package com.ringcentral.definitions;

public class TcrCampaignRecord {
    /** Identifier of a TCR campaign Format: int64 */
    public Long id;

    public TcrCampaignRecord id(Long id) {
        this.id = id;
        return this;
    }

    /** Name of a TCR campaign */
    public String name;

    public TcrCampaignRecord name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Enum: Created, Submitted, Confirmed, SubmitFailed, UpdateRequested, DeleteRequested,
     * CampaignSuspended, CampaignExpired, Draft, PreventFailed, Unconfirmed
     */
    public String status;

    public TcrCampaignRecord status(String status) {
        this.status = status;
        return this;
    }

    /** Registration time Format: date-time */
    public String registrationTime;

    public TcrCampaignRecord registrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    /** External ID */
    public String externalId;

    public TcrCampaignRecord externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /** Brand info */
    public TcrCampaignRecordBrand brand;

    public TcrCampaignRecord brand(TcrCampaignRecordBrand brand) {
        this.brand = brand;
        return this;
    }

    /** Enum: LowVolume, StandardVolume */
    public String registrationTier;

    public TcrCampaignRecord registrationTier(String registrationTier) {
        this.registrationTier = registrationTier;
        return this;
    }

    /**
     * Enum: AccountNotification, ConversationsInternal, ConversationsExternal, CustomerCare,
     * DeliveryNotification, FraudAlert, HigherEducation, K12Education, MachineToMachine, Marketing,
     * Mixed, PollingVoting, PublicServiceAnnouncement, SecurityAlert, Unknown
     */
    public String[] useCases;

    public TcrCampaignRecord useCases(String[] useCases) {
        this.useCases = useCases;
        return this;
    }

    /** */
    public ApiErrorWithParameter[] errors;

    public TcrCampaignRecord errors(ApiErrorWithParameter[] errors) {
        this.errors = errors;
        return this;
    }
}
