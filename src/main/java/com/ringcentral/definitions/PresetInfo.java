package com.ringcentral.definitions;


public class PresetInfo {
    /**
     * Link to a greeting resource
     */
    public String uri;
    /**
     * Internal identifier of a greeting
     */
    public String id;
    /**
     * Name of a greeting
     */
    public String name;

    public PresetInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PresetInfo id(String id) {
        this.id = id;
        return this;
    }

    public PresetInfo name(String name) {
        this.name = name;
        return this;
    }

}
