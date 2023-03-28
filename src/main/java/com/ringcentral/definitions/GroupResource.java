package com.ringcentral.definitions;


public class GroupResource {
    /**
     * Example: 63723034
     */
    public String id;
    /**
     * Example: Leaders
     */
    public String name;

    public GroupResource id(String id) {
        this.id = id;
        return this;
    }

    public GroupResource name(String name) {
        this.name = name;
        return this;
    }
}
