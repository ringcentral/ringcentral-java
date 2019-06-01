package com.ringcentral.definitions;


public class BusinessSiteResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     *
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
