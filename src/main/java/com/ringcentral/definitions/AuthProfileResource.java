package com.ringcentral.definitions;


public class AuthProfileResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public ActivePermissionResource[] permissions;

    public AuthProfileResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AuthProfileResource permissions(ActivePermissionResource[] permissions) {
        this.permissions = permissions;
        return this;
    }

}
