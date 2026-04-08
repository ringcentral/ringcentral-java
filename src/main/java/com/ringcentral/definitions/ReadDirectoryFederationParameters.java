package com.ringcentral.definitions;


    /**
* Query parameters for operation readDirectoryFederation
*/
public class ReadDirectoryFederationParameters
{
    /**
     * Federation types for search
     * Enum: All, Regular, AdminOnly
     */
    public String types;
    public ReadDirectoryFederationParameters types(String types)
    {
        this.types = types;
        return this;
    }
}