package com.ringcentral.definitions;


public class CallQueueInfo {
    /**
     * Link to a call queue
     */
    public String uri;
    /**
     * Internal identifier of a call queue
     */
    public String id;
    /**
     * Extension number of a call queue
     */
    public String extensionNumber;
    /**
     * Name of a call queue
     */
    public String name;

    public CallQueueInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallQueueInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public CallQueueInfo name(String name) {
        this.name = name;
        return this;
    }

}
