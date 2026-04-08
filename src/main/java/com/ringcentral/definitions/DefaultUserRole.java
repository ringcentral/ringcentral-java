package com.ringcentral.definitions;


public class DefaultUserRole
{
    /**
     * Link to a default role resource
     * Format: uri
     */
    public String uri;
    public DefaultUserRole uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a default role
     */
    public String id;
    public DefaultUserRole id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Custom name of a default role
     * Example: My Custom User Role
     */
    public String displayName;
    public DefaultUserRole displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Site compatibility of a user role
     */
    public Boolean siteCompatible;
    public DefaultUserRole siteCompatible(Boolean siteCompatible)
    {
        this.siteCompatible = siteCompatible;
        return this;
    }
}