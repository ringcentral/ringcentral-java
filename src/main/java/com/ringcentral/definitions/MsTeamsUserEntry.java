package com.ringcentral.definitions;


public class MsTeamsUserEntry
{
    /**
     * RingCentral extension ID of the user to connect
     * Required
     */
    public String extensionId;
    public MsTeamsUserEntry extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String phoneNumber;
    public MsTeamsUserEntry phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}