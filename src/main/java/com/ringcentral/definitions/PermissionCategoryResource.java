package com.ringcentral.definitions;


public class PermissionCategoryResource {
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

    public PermissionCategoryResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PermissionCategoryResource id(String id) {
        this.id = id;
        return this;
    }

    public PermissionCategoryResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public PermissionCategoryResource description(String description) {
        this.description = description;
        return this;
    }
}
