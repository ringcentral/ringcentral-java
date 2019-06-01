package com.ringcentral.definitions;


public class RoleIdResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String id;

    public RoleIdResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RoleIdResource id(String id) {
        this.id = id;
        return this;
    }

}
