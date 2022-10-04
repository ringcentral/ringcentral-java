package com.ringcentral.definitions;


public class IVRMenuList {
    /**
     * Link to an IVR Menu list
     */
    public String uri;
    /**
     * List of ivr menus
     */
    public IVRMenuInfo[] records;

    public IVRMenuList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IVRMenuList records(IVRMenuInfo[] records) {
        this.records = records;
        return this;
    }
}
