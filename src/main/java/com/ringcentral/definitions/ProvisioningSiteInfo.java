package com.ringcentral.definitions;

/**
 * Site data. If multi-site feature is turned on for an account, then ID of a site must be
 * specified. In order to assign a wireless point to the main site (company) the site ID should be
 * set to `main-site`
 */
public class ProvisioningSiteInfo {
    /** Internal identifier of a site Format: uri */
    public String id;

    public ProvisioningSiteInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Link to a site resource Format: uri */
    public String uri;

    public ProvisioningSiteInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Name of a site */
    public String name;

    public ProvisioningSiteInfo name(String name) {
        this.name = name;
        return this;
    }

    /** Site code value. Returned only if specified */
    public String code;

    public ProvisioningSiteInfo code(String code) {
        this.code = code;
        return this;
    }
}
