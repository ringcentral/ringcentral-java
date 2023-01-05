package com.ringcentral.definitions;


public class RoleResource
{
    /**
     * Required
     */
    public String id;
    public RoleResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public RoleResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String domain;
    public RoleResource domain(String domain)
    {
        this.domain = domain;
        return this;
    }

    /**
     */
    public String displayName;
    public RoleResource displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
}