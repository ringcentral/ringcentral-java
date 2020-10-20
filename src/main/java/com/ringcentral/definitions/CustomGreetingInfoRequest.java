package com.ringcentral.definitions;


public class CustomGreetingInfoRequest {
    /**
     * Internal identifier of a custom user greeting
     */
    public String id;

    public CustomGreetingInfoRequest id(String id) {
        this.id = id;
        return this;
    }

}
