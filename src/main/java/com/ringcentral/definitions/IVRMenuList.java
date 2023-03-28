package com.ringcentral.definitions;


public class IVRMenuList {
    /**
     * Link to an IVR Menu list
     * Format: uri
     */
    public String uri;
    /**
     * List of ivr menus
     */
    public IVRMenuListInfo[] records;

    public IVRMenuList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IVRMenuList records(IVRMenuListInfo[] records) {
        this.records = records;
        return this;
    }
}
