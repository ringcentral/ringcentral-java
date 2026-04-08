package com.ringcentral.definitions;


public class CommIntegrationResource
{
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String phoneNumber;
    public CommIntegrationResource phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Integration type
     * Required
     * Enum: MsTeamsDirectRouting, FmcLite
     */
    public String type;
    public CommIntegrationResource type(String type)
    {
        this.type = type;
        return this;
    }
}