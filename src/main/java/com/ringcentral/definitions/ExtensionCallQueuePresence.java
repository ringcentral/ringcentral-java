package com.ringcentral.definitions;


public class ExtensionCallQueuePresence {
    /**
     * Call queue information
     */
    public CallQueueInfo callQueue;
    /**
     * Call queue agent availability for calls of this queue
     */
    public Boolean acceptCalls;

    public ExtensionCallQueuePresence callQueue(CallQueueInfo callQueue) {
        this.callQueue = callQueue;
        return this;
    }

    public ExtensionCallQueuePresence acceptCalls(Boolean acceptCalls) {
        this.acceptCalls = acceptCalls;
        return this;
    }

}
