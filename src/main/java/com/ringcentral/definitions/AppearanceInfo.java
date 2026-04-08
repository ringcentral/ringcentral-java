package com.ringcentral.definitions;


    /**
* Appearance phone numbers information. Supported only for Delegated Lines Group extensions
*/
public class AppearanceInfo
{
    /**
     * Appearance phone number
     */
    public String phoneNumber;
    public AppearanceInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Appearance number. The value range is from 1 to 8
     * Format: int32
     */
    public Long appearanceNumber;
    public AppearanceInfo appearanceNumber(Long appearanceNumber)
    {
        this.appearanceNumber = appearanceNumber;
        return this;
    }
}