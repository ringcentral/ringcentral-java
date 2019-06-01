package com.ringcentral.definitions;


public class TimezoneResource {
    /**
     *
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

    public TimezoneResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public TimezoneResource id(String id) {
        this.id = id;
        return this;
    }

    public TimezoneResource name(String name) {
        this.name = name;
        return this;
    }

    public TimezoneResource description(String description) {
        this.description = description;
        return this;
    }

}
