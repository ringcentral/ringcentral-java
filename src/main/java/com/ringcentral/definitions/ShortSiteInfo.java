package com.ringcentral.definitions;


public class ShortSiteInfo {
    /**
     * Internal idetifier of a site extension
     */
    public String id;
    /**
     * Extension user first name
     */
    public String name;

    public ShortSiteInfo id(String id) {
        this.id = id;
        return this;
    }

    public ShortSiteInfo name(String name) {
        this.name = name;
        return this;
    }

}
