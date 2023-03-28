package com.ringcentral.definitions;


/**
 * Site data. If multi-site feature is turned on for an account,
 * then ID of a site must be specified. In order to assign a wireless
 * point to the main site (company) the site ID should be set to `main-site`
 */
public class AutomaticLocationUpdatesSiteInfo {
    /**
     * Internal identifier of a site
     * Format: uri
     */
    public String id;
    /**
     * Link to a site resource
     * Format: uri
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
