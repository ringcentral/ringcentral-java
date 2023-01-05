package com.ringcentral.definitions;


public class RolesTimezoneResource
{
    /**
     * Format: uri
     */
    public String uri;
    public RolesTimezoneResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String id;
    public RolesTimezoneResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public RolesTimezoneResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String description;
    public RolesTimezoneResource description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public String bias;
    public RolesTimezoneResource bias(String bias)
    {
        this.bias = bias;
        return this;
    }
}