package com.ringcentral.definitions;


public class GroupResource {
    /**
     *
     */
    public String id;
    /**
     *
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
