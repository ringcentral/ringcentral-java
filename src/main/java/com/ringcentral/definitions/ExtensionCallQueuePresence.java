package com.ringcentral.definitions;


public class ExtensionCallQueuePresence
{
    /**
     */
    public PresenceCallQueueInfo callQueue;
    public ExtensionCallQueuePresence callQueue(PresenceCallQueueInfo callQueue)
    {
        this.callQueue = callQueue;
        return this;
    }

    /**
     * Call queue agent availability for calls of this queue
     */
    public Boolean acceptCalls;
    public ExtensionCallQueuePresence acceptCalls(Boolean acceptCalls)
    {
        this.acceptCalls = acceptCalls;
        return this;
    }
}