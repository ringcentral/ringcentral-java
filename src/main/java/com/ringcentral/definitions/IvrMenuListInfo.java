package com.ringcentral.definitions;


public class IvrMenuListInfo
{
    /**
     * Internal identifier of an IVR Menu extension
     * Example: 7258440006
     */
    public String id;
    public IvrMenuListInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link to an IVR Menu extension resource
     * Format: uri
     * Example: https://api-example.rincentral.com/restapi/v1.0/account/5936989006/ivr-menus/7258440006
     */
    public String uri;
    public IvrMenuListInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * First name of an IVR Menu user
     * Example: IVR Menu 1001
     */
    public String name;
    public IvrMenuListInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Number of an IVR Menu extension
     * Example: 1001
     */
    public String extensionNumber;
    public IvrMenuListInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}