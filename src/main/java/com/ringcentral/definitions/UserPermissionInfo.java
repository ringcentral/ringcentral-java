package com.ringcentral.definitions;

public class UserPermissionInfo {
    // Internal identifier of a permission
    public String id;
    // Canonical URI of a permission resource
    public String uri;

    public UserPermissionInfo id(String id) {
        this.id = id;
        return this;
    }

    public UserPermissionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}
