package com.ringcentral.definitions;


public class PermissionCategoryIdResource
{
    /**
     * Format: uri
     */
    public String uri;
    public PermissionCategoryIdResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String id;
    public PermissionCategoryIdResource id(String id)
    {
        this.id = id;
        return this;
    }
}