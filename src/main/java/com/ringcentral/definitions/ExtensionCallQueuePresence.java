package com.ringcentral.definitions;


public class ExtensionCallQueuePresence {
    /**
     *
     */
    public PresenceCallQueueInfo callQueue;
    /**
     * Call queue agent availability for calls of this queue
     */
    public Boolean acceptCalls;

    public ExtensionCallQueuePresence callQueue(PresenceCallQueueInfo callQueue) {
        this.callQueue = callQueue;
        return this;
    }

    public ExtensionCallQueuePresence acceptCalls(Boolean acceptCalls) {
        this.acceptCalls = acceptCalls;
        return this;
    }
}
