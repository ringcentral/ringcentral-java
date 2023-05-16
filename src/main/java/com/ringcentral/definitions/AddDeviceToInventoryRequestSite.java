package com.ringcentral.definitions;


public class AddDeviceToInventoryRequestSite {
    /**
     * Site extension identifier or &quot;main-site&quot; for the main site
     */
    public String id;

    public AddDeviceToInventoryRequestSite id(String id) {
        this.id = id;
        return this;
    }
}
