package com.ringcentral.definitions;


public class MethodResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;

    public MethodResource id(String id) {
        this.id = id;
        return this;
    }

    public MethodResource name(String name) {
        this.name = name;
        return this;
    }

}
