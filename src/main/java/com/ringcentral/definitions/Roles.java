package com.ringcentral.definitions;


public class Roles {
    /**
     *
     */
    public String uri;
    /**
     * Internal identifier of a role
     */
    public String id;

    public Roles uri(String uri) {
        this.uri = uri;
        return this;
    }

    public Roles id(String id) {
        this.id = id;
        return this;
    }

}
