package com.ringcentral.definitions;

public class RoleResource {
    /** Link to a role resource Format: uri */
    public String uri;

    public RoleResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Internal identifier of a role */
    public String id;

    public RoleResource id(String id) {
        this.id = id;
        return this;
    }

    /** Display name of a role Example: Super Admin */
    public String displayName;

    public RoleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** Role description Example: Primary company administrator role */
    public String description;

    public RoleResource description(String description) {
        this.description = description;
        return this;
    }

    /** Site compatibility of a user role */
    public Boolean siteCompatible;

    public RoleResource siteCompatible(Boolean siteCompatible) {
        this.siteCompatible = siteCompatible;
        return this;
    }

    /** Specifies if a user role is custom */
    public Boolean custom;

    public RoleResource custom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Specifies resource for permission Enum: Account, AllExtensions, Federation, Group,
     * NonUserExtensions, RoleBased, Self, UserExtensions
     */
    public String scope;

    public RoleResource scope(String scope) {
        this.scope = scope;
        return this;
    }

    /** */
    public Boolean hidden;

    public RoleResource hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /** Format: date-time */
    public String lastUpdated;

    public RoleResource lastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /** */
    public PermissionIdResource[] permissions;

    public RoleResource permissions(PermissionIdResource[] permissions) {
        this.permissions = permissions;
        return this;
    }
}
