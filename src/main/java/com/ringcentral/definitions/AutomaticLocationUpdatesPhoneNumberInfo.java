package com.ringcentral.definitions;


public class AutomaticLocationUpdatesPhoneNumberInfo {
    /**
     * Internal identifier of a phone number
     */
    public Long id;
    /**
     * Phone number
     */
    public String phoneNumber;

    public AutomaticLocationUpdatesPhoneNumberInfo id(Long id) {
        this.id = id;
        return this;
    }

    public AutomaticLocationUpdatesPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
