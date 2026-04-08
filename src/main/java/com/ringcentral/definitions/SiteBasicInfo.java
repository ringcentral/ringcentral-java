package com.ringcentral.definitions;


public class SiteBasicInfo
{
    /**
     * Site extension identifier or &quot;main-site&quot; for the main site
     * Required
     */
    public String id;
    public SiteBasicInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Site name
     * Required
     */
    public String name;
    public SiteBasicInfo name(String name)
    {
        this.name = name;
        return this;
    }
}