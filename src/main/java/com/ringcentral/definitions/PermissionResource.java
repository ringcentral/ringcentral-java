package com.ringcentral.definitions;


public class PermissionResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String displayName;
    /**
     *
     */
    public String description;
    /**
     *
     */
    public Boolean assignable;
    /**
     *
     */
    public Boolean readOnly;
    /**
     * Site compatibility flag set for permission
     * Enum: Incompatible, Compatible, Independent
     */
    public String siteCompatible;
    /**
     *
     */
    public PermissionCategoryIdResource category;
    /**
     *
     */
    public PermissionIdResource[] includedPermissions;

    public PermissionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PermissionResource id(String id) {
        this.id = id;
        return this;
    }

    public PermissionResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public PermissionResource description(String description) {
        this.description = description;
        return this;
    }

    public PermissionResource assignable(Boolean assignable) {
        this.assignable = assignable;
        return this;
    }

    public PermissionResource readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public PermissionResource siteCompatible(String siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

    public PermissionResource category(PermissionCategoryIdResource category) {
        this.category = category;
        return this;
    }

    public PermissionResource includedPermissions(PermissionIdResource[] includedPermissions) {
        this.includedPermissions = includedPermissions;
        return this;
    }
}
