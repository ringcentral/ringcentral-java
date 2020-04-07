package com.ringcentral.definitions;


public class CallQueuePresenceEventBody {
    /**
     * Agent extension ID
     */
    public String extensionId;
    /**
     * Call queue extension ID
     */
    public String callQueueId;
    /**
     * Call queue agent availability for calls of this queue
     */
    public Boolean acceptCalls;

    public CallQueuePresenceEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public CallQueuePresenceEventBody callQueueId(String callQueueId) {
        this.callQueueId = callQueueId;
        return this;
    }

    public CallQueuePresenceEventBody acceptCalls(Boolean acceptCalls) {
        this.acceptCalls = acceptCalls;
        return this;
    }

}
