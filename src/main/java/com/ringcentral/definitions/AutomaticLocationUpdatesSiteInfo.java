package com.ringcentral.definitions;


public class AutomaticLocationUpdatesSiteInfo {
    /**
     * Internal identifier of a site
     */
    public String id;
    /**
     * Link to a site resource
     */
    public String uri;
    /**
     * Name of a site
     */
    public String name;
    /**
     * Site code value. Returned only if specified
     */
    public String code;

    public AutomaticLocationUpdatesSiteInfo id(String id) {
        this.id = id;
        return this;
    }

    public AutomaticLocationUpdatesSiteInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AutomaticLocationUpdatesSiteInfo name(String name) {
        this.name = name;
        return this;
    }

    public AutomaticLocationUpdatesSiteInfo code(String code) {
        this.code = code;
        return this;
    }

}
