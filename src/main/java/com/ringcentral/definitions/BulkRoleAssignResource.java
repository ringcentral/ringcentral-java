package com.ringcentral.definitions;


public class BulkRoleAssignResource
{
    /**
     * Example: true
     */
    public Boolean siteRestricted;
    public BulkRoleAssignResource siteRestricted(Boolean siteRestricted)
    {
        this.siteRestricted = siteRestricted;
        return this;
    }

    /**
     */
    public Boolean siteCompatible;
    public BulkRoleAssignResource siteCompatible(Boolean siteCompatible)
    {
        this.siteCompatible = siteCompatible;
        return this;
    }

    /**
     * Format: uri
     */
    public String uri;
    public BulkRoleAssignResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String[] addedExtensionIds;
    public BulkRoleAssignResource addedExtensionIds(String[] addedExtensionIds)
    {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }

    /**
     */
    public String[] removedExtensionIds;
    public BulkRoleAssignResource removedExtensionIds(String[] removedExtensionIds)
    {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }
}