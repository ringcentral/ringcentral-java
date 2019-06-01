package com.ringcentral.definitions;


public class AssistedUserResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;

    public AssistedUserResource id(String id) {
        this.id = id;
        return this;
    }

    public AssistedUserResource name(String name) {
        this.name = name;
        return this;
    }

}
