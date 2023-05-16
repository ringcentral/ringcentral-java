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
     * Only &quot;Inventory&quot; is supported now.
     * Later we may support other values like &quot;ForwardedNumber&quot; etc.
     * Required
     * Enum: Inventory
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
