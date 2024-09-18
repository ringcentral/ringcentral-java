package com.ringcentral.definitions;


public class AddPhoneNumberRequestItem {
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix).
     * Wildcards are supported to pass large sets (for example 100 numbers);
     * only one phone number record must be passed in request in that case, for example &#039;+1650123456*&#039;
     * Required
     */
    public String phoneNumber;
    /**
     * Usage type of phone number. Currently, we support the following values: `Inventory`, `InventoryPartnerBusinessMobileNumber`
     * and `PartnerBusinessMobileNumber`. Later we may support some other values like `ForwardedNumber`, etc.
     * Required
     * Default: Inventory
     * Enum: Inventory, InventoryPartnerBusinessMobileNumber, PartnerBusinessMobileNumber
     */
    public String usageType;
    /**
     * Phone number activation status. Determine whether phone number migration is completed on the partner side.
     * Enum: Active, Inactive
     */
    public String activationStatus;

    public AddPhoneNumberRequestItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AddPhoneNumberRequestItem usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    public AddPhoneNumberRequestItem activationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
        return this;
    }
}
