package com.ringcentral.definitions;


public class UserVideoConfiguration
{
    /**
     * Video provider of the user
     * Enum: RCMeetings, RCVideo, None
     */
    public String provider;
    public UserVideoConfiguration provider(String provider)
    {
        this.provider = provider;
        return this;
    }

    /**
     * Specifies if the user is &#039;paid&#039; (has meeting license) or &#039;free&#039; (w/o meeting license)
     * Enum: Paid, Free
     */
    public String userLicenseType;
    public UserVideoConfiguration userLicenseType(String userLicenseType)
    {
        this.userLicenseType = userLicenseType;
        return this;
    }
}