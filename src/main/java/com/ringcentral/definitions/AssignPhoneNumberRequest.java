package com.ringcentral.definitions;


public class AssignPhoneNumberRequest {
    /**
     * Type of phone number
     * Enum: VoiceFax, VoiceOnly, FaxOnly
     */
    public String type;
    /**
     * Target usage type of phone number (only listed values are supported)
     * Required
     * Enum: MainCompanyNumber, CompanyNumber, DirectNumber, PhoneLine, ContactCenterNumber
     */
    public String usageType;
    /**
     *
     */
    public AssignPhoneNumberRequestExtension extension;
    /**
     *
     */
    public String costCenterId;
    /**
     *
     */
    public ContactCenterProvider contactCenterProvider;

    public AssignPhoneNumberRequest type(String type) {
        this.type = type;
        return this;
    }

    public AssignPhoneNumberRequest usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public AssignPhoneNumberRequest extension(AssignPhoneNumberRequestExtension extension) {
        this.extension = extension;
        return this;
    }

    public AssignPhoneNumberRequest costCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
        return this;
    }

    public AssignPhoneNumberRequest contactCenterProvider(ContactCenterProvider contactCenterProvider) {
        this.contactCenterProvider = contactCenterProvider;
        return this;
    }
}
