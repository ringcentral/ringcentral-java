package com.ringcentral.definitions;


public class ExtensionCallQueueUpdatePresence
{
    /**
     */
    public CallQueueId callQueue;
    public ExtensionCallQueueUpdatePresence callQueue(CallQueueId callQueue)
    {
        this.callQueue = callQueue;
        return this;
    }

    /**
     * Call queue agent availability for calls of this queue
     */
    public Boolean acceptCalls;
    public ExtensionCallQueueUpdatePresence acceptCalls(Boolean acceptCalls)
    {
        this.acceptCalls = acceptCalls;
        return this;
    }
}