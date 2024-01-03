package com.ringcentral.definitions;


public class AssignedRoleResource {
    /**
     * Link to an assigned role resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a role
     */
    public String id;
    /**
     * Specifies if a role can be auto assigned
     */
    public Boolean autoAssigned;
    /**
     * Name of a default role
     */
    public String displayName;
    /**
     * Site compatibility flag
     */
    public Boolean siteCompatible;
    /**
     * Site restricted flag
     */
    public Boolean siteRestricted;

    public AssignedRoleResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AssignedRoleResource id(String id) {
        this.id = id;
        return this;
    }

    public AssignedRoleResource autoAssigned(Boolean autoAssigned) {
        this.autoAssigned = autoAssigned;
        return this;
    }

    public AssignedRoleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public AssignedRoleResource siteCompatible(Boolean siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

    public AssignedRoleResource siteRestricted(Boolean siteRestricted) {
        this.siteRestricted = siteRestricted;
        return this;
    }
}
