package com.ringcentral.definitions;


public class SwitchSiteInfo
{
    /**
     * Internal identifier of a site. The company identifier value
    * is &#039;main-site&#039;
     */
    public String id;
    public SwitchSiteInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of a site
     */
    public String name;
    public SwitchSiteInfo name(String name)
    {
        this.name = name;
        return this;
    }
}