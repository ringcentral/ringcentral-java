package com.ringcentral.definitions;


/**
 * To be used to assign a number by ID
 */
public class PhoneNumberDefinitionNumberId {
    /**
     * Phone number ID
     * Required
     */
    public String phoneNumberId;

    public PhoneNumberDefinitionNumberId phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }
}
