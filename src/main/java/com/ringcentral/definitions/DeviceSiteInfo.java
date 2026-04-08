package com.ringcentral.definitions;


    /**
* Site data
*/
public class DeviceSiteInfo
{
    /**
     * Internal identifier of a site
     */
    public String id;
    public DeviceSiteInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Name of a site
     */
    public String name;
    public DeviceSiteInfo name(String name)
    {
        this.name = name;
        return this;
    }
}