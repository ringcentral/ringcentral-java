package com.ringcentral.definitions;


public class AddonInfo
{
    /**
     */
    public String id;
    public AddonInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public AddonInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public Long count;
    public AddonInfo count(Long count)
    {
        this.count = count;
        return this;
    }
}