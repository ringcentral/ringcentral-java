package com.ringcentral.definitions;


public class ExtensionCallQueueUpdatePresence {
    /**
     *
     */
    public CallQueueId callQueue;
    /**
     * Call queue agent availability for calls of this queue
     */
    public Boolean acceptCalls;

    public ExtensionCallQueueUpdatePresence callQueue(CallQueueId callQueue) {
        this.callQueue = callQueue;
        return this;
    }

    public ExtensionCallQueueUpdatePresence acceptCalls(Boolean acceptCalls) {
        this.acceptCalls = acceptCalls;
        return this;
    }
}
