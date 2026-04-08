package com.ringcentral.definitions;


public class FederationResource
{
    /**
     */
    public FederatedAccountResource[] accounts;
    public FederationResource accounts(FederatedAccountResource[] accounts)
    {
        this.accounts = accounts;
        return this;
    }

    /**
     * Format: date-time
     */
    public String creationTime;
    public FederationResource creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     */
    public String displayName;
    public FederationResource displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     */
    public String id;
    public FederationResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Format: date-time
     */
    public String lastModifiedTime;
    public FederationResource lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Federation type
     * Enum: Regular, AdminOnly
     */
    public String type;
    public FederationResource type(String type)
    {
        this.type = type;
        return this;
    }
}