package com.ringcentral.definitions;


public class BusinessSiteResource {
    /**
     * Example: 872781820006
     */
    public String id;
    /**
     * Example: Sales site
     */
    public String name;
    /**
     * Example: 1007
     */
    public String code;

    public BusinessSiteResource id(String id) {
        this.id = id;
        return this;
    }

    public BusinessSiteResource name(String name) {
        this.name = name;
        return this;
    }

    public BusinessSiteResource code(String code) {
        this.code = code;
        return this;
    }
}
