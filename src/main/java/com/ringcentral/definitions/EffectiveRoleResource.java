package com.ringcentral.definitions;


public class EffectiveRoleResource
{
    /**
     * Format: uri
     */
    public String uri;
    public EffectiveRoleResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String id;
    public EffectiveRoleResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String domain;
    public EffectiveRoleResource domain(String domain)
    {
        this.domain = domain;
        return this;
    }
}