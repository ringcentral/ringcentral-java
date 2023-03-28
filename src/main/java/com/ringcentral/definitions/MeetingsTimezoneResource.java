package com.ringcentral.definitions;


public class MeetingsTimezoneResource {
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

    public MeetingsTimezoneResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingsTimezoneResource id(String id) {
        this.id = id;
        return this;
    }

    public MeetingsTimezoneResource name(String name) {
        this.name = name;
        return this;
    }

    public MeetingsTimezoneResource description(String description) {
        this.description = description;
        return this;
    }
}
