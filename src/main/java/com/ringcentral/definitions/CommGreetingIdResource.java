package com.ringcentral.definitions;


public class CommGreetingIdResource {
    /**
     * Internal identifier of a greeting
     * Required
     * Example: 66319
     */
    public String id;

    public CommGreetingIdResource id(String id) {
        this.id = id;
        return this;
    }
}
