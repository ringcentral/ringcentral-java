package com.ringcentral.definitions;


public class RolesTimezoneResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String description;
    /**
     *
     */
    public String bias;

    public RolesTimezoneResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RolesTimezoneResource id(String id) {
        this.id = id;
        return this;
    }

    public RolesTimezoneResource name(String name) {
        this.name = name;
        return this;
    }

    public RolesTimezoneResource description(String description) {
        this.description = description;
        return this;
    }

    public RolesTimezoneResource bias(String bias) {
        this.bias = bias;
        return this;
    }
}
