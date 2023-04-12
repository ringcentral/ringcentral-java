package com.ringcentral.definitions;


public class RoleResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     * Example: Super Admin
     */
    public String displayName;
    /**
     * Example: Primary company administrator role
     */
    public String description;
    /**
     * Site compatibility of a user role
     */
    public Boolean siteCompatible;
    /**
     *
     */
    public Boolean custom;
    /**
     *
     */
    public String scope;
    /**
     *
     */
    public Boolean hidden;
    /**
     * Format: date-time
     */
    public String lastUpdated;
    /**
     *
     */
    public PermissionIdResource[] permissions;

    public RoleResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RoleResource id(String id) {
        this.id = id;
        return this;
    }

    public RoleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public RoleResource description(String description) {
        this.description = description;
        return this;
    }

    public RoleResource siteCompatible(Boolean siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

    public RoleResource custom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    public RoleResource scope(String scope) {
        this.scope = scope;
        return this;
    }

    public RoleResource hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public RoleResource lastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    public RoleResource permissions(PermissionIdResource[] permissions) {
        this.permissions = permissions;
        return this;
    }
}
