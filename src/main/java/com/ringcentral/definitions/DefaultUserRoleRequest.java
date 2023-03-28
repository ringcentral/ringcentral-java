package com.ringcentral.definitions;


public class DefaultUserRoleRequest {
    /**
     * Internal identifier of a user role to be set as default
     */
    public String id;

    public DefaultUserRoleRequest id(String id) {
        this.id = id;
        return this;
    }
}
