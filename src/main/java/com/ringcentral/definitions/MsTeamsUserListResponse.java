package com.ringcentral.definitions;


public class MsTeamsUserListResponse
{
    /**
     * Required
     */
    public MsTeamsUserListResponseMappings[] mappings;
    public MsTeamsUserListResponse mappings(MsTeamsUserListResponseMappings[] mappings)
    {
        this.mappings = mappings;
        return this;
    }
}