package com.ringcentral.definitions;


public class IVRMenuListInfo
{
    /**
     * Internal identifier of an IVR Menu extension
     * Example: 7258440006
     */
    public String id;
    public IVRMenuListInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to an IVR Menu extension resource
     * Example: https://api-example.rincentral.com/restapi/v1.0/account/5936989006/ivr-menus/7258440006
     */
    public String uri;
    public IVRMenuListInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * First name of an IVR Menu user
     * Example: IVR Menu 1001
     */
    public String name;
    public IVRMenuListInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Number of an IVR Menu extension
     * Example: 1001
     */
    public String extensionNumber;
    public IVRMenuListInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}