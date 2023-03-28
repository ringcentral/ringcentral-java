package com.ringcentral.definitions;


public class BulkRoleAssignResource {
    /**
     * Example: true
     */
    public Boolean siteRestricted;
    /**
     *
     */
    public Boolean siteCompatible;
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String[] addedExtensionIds;
    /**
     *
     */
    public String[] removedExtensionIds;

    public BulkRoleAssignResource siteRestricted(Boolean siteRestricted) {
        this.siteRestricted = siteRestricted;
        return this;
    }

    public BulkRoleAssignResource siteCompatible(Boolean siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

    public BulkRoleAssignResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public BulkRoleAssignResource addedExtensionIds(String[] addedExtensionIds) {
        this.addedExtensionIds = addedExtensionIds;
        return this;
    }

    public BulkRoleAssignResource removedExtensionIds(String[] removedExtensionIds) {
        this.removedExtensionIds = removedExtensionIds;
        return this;
    }
}
