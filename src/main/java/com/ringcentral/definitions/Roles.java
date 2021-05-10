package com.ringcentral.definitions;


public class Roles {
    /**
     * Link to a role
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a role
     */
    public String id;
    /**
     *
     */
    public Boolean autoAssigned;
    /**
     *
     */
    public String displayName;
    /**
     *
     */
    public Boolean siteCompatible;
    /**
     *
     */
    public Boolean siteRestricted;

    public Roles uri(String uri) {
        this.uri = uri;
        return this;
    }

    public Roles id(String id) {
        this.id = id;
        return this;
    }

    public Roles autoAssigned(Boolean autoAssigned) {
        this.autoAssigned = autoAssigned;
        return this;
    }

    public Roles displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public Roles siteCompatible(Boolean siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

    public Roles siteRestricted(Boolean siteRestricted) {
        this.siteRestricted = siteRestricted;
        return this;
    }
}
