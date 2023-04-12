package com.ringcentral.definitions;


public class DirectoryRoleResource {
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

    public DirectoryRoleResource id(String id) {
        this.id = id;
        return this;
    }

    public DirectoryRoleResource name(String name) {
        this.name = name;
        return this;
    }

    public DirectoryRoleResource domain(String domain) {
        this.domain = domain;
        return this;
    }

    public DirectoryRoleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
