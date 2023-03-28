package com.ringcentral.definitions;


/**
 * Call queue member information
 */
public class CallQueueMemberId {
    /**
     * Internal identifier of an extension - queue member
     */
    public String id;

    public CallQueueMemberId id(String id) {
        this.id = id;
        return this;
    }
}
