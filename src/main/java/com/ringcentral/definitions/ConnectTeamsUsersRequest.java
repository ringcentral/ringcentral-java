package com.ringcentral.definitions;


public class ConnectTeamsUsersRequest
{
    /**
     * Required
     */
    public MsTeamsUserEntry[] mappings;
    public ConnectTeamsUsersRequest mappings(MsTeamsUserEntry[] mappings)
    {
        this.mappings = mappings;
        return this;
    }
}