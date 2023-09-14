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
     * Usage type of a phone number. Currently we support the following three enum values: &#039;Inventory&#039;, &#039;InventoryPartnerBusinessMobileNumber&#039; and &#039;PartnerBusinessMobileNumber&#039;.
     * Later we may support other values like &#039;ForwardedNumber&#039; etc.
     * Required
     * Default: Inventory
     * Enum: Inventory, InventoryPartnerBusinessMobileNumber, PartnerBusinessMobileNumber
     */
    public String usageType;

    public AddPhoneNumberRequestItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AddPhoneNumberRequestItem usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
}
