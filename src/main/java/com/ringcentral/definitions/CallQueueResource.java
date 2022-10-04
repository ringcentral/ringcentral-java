package com.ringcentral.definitions;


public class CallQueueResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;

    public CallQueueResource id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueResource name(String name) {
        this.name = name;
        return this;
    }
}
