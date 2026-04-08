package com.ringcentral.definitions;

/** Assign a number by ID */
public class PhoneNumberDefinitionNumberId {
    /** Phone number identifier Required */
    public String phoneNumberId;

    public PhoneNumberDefinitionNumberId phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }
}
