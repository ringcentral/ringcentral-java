package com.ringcentral.definitions;


public class EmergencyAddressAutoUpdateSiteInfo {
    /**
     * Internal identifier of a site
     */
    public String id;
    /**
     * Name pf a site
     */
    public String name;

    public EmergencyAddressAutoUpdateSiteInfo id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyAddressAutoUpdateSiteInfo name(String name) {
        this.name = name;
        return this;
    }
}
