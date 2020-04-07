package com.ringcentral.definitions;


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
