package com.ringcentral.definitions;


public class CustomGreetingInfo {
    /**
     * Link to a custom user greeting
     */
    public String uri;
    /**
     * Internal identifier of a custom user greeting
     */
    public String id;

    public CustomGreetingInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CustomGreetingInfo id(String id) {
        this.id = id;
        return this;
    }

}
