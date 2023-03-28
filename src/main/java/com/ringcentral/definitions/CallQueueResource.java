package com.ringcentral.definitions;


public class CallQueueResource {
    /**
     * Example: 873014540006
     */
    public String id;
    /**
     * Example: Sales CQ
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
