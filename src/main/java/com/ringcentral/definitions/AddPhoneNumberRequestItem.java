package com.ringcentral.definitions;

public class AddPhoneNumberRequestItem {
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix). Wildcards are supported to pass
     * large sets (for example 100 numbers); only one phone number record must be passed in request
     * in that case, for example &#039;+1650123456*&#039; Required
     */
    public String phoneNumber;

    public AddPhoneNumberRequestItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Usage type of phone number. Currently, we support the following values: `Inventory`,
     * `InventoryPartnerBusinessMobileNumber`, `InventoryFmcBusinessMobileNumber`,
     * `PartnerBusinessMobileNumber`, `InventoryMobileNumber`. Later we may support some other
     * values like `ForwardedNumber`, etc. Required Default: Inventory Enum: Inventory,
     * InventoryPartnerBusinessMobileNumber, InventoryFmcBusinessMobileNumber,
     * PartnerBusinessMobileNumber, InventoryMobileNumber
     */
    public String usageType;

    public AddPhoneNumberRequestItem usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    /**
     * Phone number activation status. Determine whether phone number migration is completed on the
     * partner side. Enum: Active, Inactive
     */
    public String activationStatus;

    public AddPhoneNumberRequestItem activationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
        return this;
    }

    /** Internal identifier of a phone provider */
    public String providerId;

    public AddPhoneNumberRequestItem providerId(String providerId) {
        this.providerId = providerId;
        return this;
    }
}
