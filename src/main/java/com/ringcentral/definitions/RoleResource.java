package com.ringcentral.definitions;


public class RoleResource {
    /**
     * Required
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String domain;
    /**
     *
     */
    public String displayName;

    public RoleResource id(String id) {
        this.id = id;
        return this;
    }

    public RoleResource name(String name) {
        this.name = name;
        return this;
    }

    public RoleResource domain(String domain) {
        this.domain = domain;
        return this;
    }

    public RoleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
