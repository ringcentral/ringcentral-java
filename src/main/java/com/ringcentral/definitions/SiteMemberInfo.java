package com.ringcentral.definitions;


public class SiteMemberInfo
{
    /**
     * Format: int64
     */
    public Long id;
    public SiteMemberInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Format: uri
     */
    public String uri;
    public SiteMemberInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String extensionNumber;
    public SiteMemberInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     */
    public String type;
    public SiteMemberInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public String name;
    public SiteMemberInfo name(String name)
    {
        this.name = name;
        return this;
    }
}