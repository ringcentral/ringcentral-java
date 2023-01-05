package com.ringcentral.definitions;


public class IVRMenuList
{
    /**
     * Link to an IVR Menu list
     */
    public String uri;
    public IVRMenuList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of ivr menus
     */
    public IVRMenuListInfo[] records;
    public IVRMenuList records(IVRMenuListInfo[] records)
    {
        this.records = records;
        return this;
    }
}