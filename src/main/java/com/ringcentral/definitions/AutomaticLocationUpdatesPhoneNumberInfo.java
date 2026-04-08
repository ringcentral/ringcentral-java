package com.ringcentral.definitions;


public class AutomaticLocationUpdatesPhoneNumberInfo
{
    /**
     * Internal identifier of a phone number
     * Format: int64
     */
    public Long id;
    public AutomaticLocationUpdatesPhoneNumberInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Phone number
     */
    public String phoneNumber;
    public AutomaticLocationUpdatesPhoneNumberInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}