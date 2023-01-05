package com.ringcentral.definitions;


public class PermissionResource
{
    /**
     * Format: uri
     */
    public String uri;
    public PermissionResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String id;
    public PermissionResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String displayName;
    public PermissionResource displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     */
    public String description;
    public PermissionResource description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public Boolean assignable;
    public PermissionResource assignable(Boolean assignable)
    {
        this.assignable = assignable;
        return this;
    }

    /**
     */
    public Boolean readOnly;
    public PermissionResource readOnly(Boolean readOnly)
    {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Site compatibility flag set for permission
     * Enum: Incompatible, Compatible, Independent
     */
    public String siteCompatible;
    public PermissionResource siteCompatible(String siteCompatible)
    {
        this.siteCompatible = siteCompatible;
        return this;
    }

    /**
     */
    public PermissionCategoryIdResource category;
    public PermissionResource category(PermissionCategoryIdResource category)
    {
        this.category = category;
        return this;
    }

    /**
     */
    public PermissionIdResource[] includedPermissions;
    public PermissionResource includedPermissions(PermissionIdResource[] includedPermissions)
    {
        this.includedPermissions = includedPermissions;
        return this;
    }
}