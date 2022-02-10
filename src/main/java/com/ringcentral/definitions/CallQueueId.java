package com.ringcentral.definitions;


/**
 * Call queue information
 */
public class CallQueueId {
    /**
     * Internal identifier of a call queue
     */
    public String id;

    public CallQueueId id(String id) {
        this.id = id;
        return this;
    }
}
