package com.ringcentral.definitions;


public class IVRMenuListInfo {
    /**
     * Internal identifier of an IVR Menu extension
     * Example: 7258440006
     */
    public String id;
    /**
     * Link to an IVR Menu extension resource
     * Format: uri
     * Example: https://api-example.rincentral.com/restapi/v1.0/account/5936989006/ivr-menus/7258440006
     */
    public String uri;
    /**
     * First name of an IVR Menu user
     * Example: IVR Menu 1001
     */
    public String name;
    /**
     * Number of an IVR Menu extension
     * Example: 1001
     */
    public String extensionNumber;

    public IVRMenuListInfo id(String id) {
        this.id = id;
        return this;
    }

    public IVRMenuListInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IVRMenuListInfo name(String name) {
        this.name = name;
        return this;
    }

    public IVRMenuListInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
