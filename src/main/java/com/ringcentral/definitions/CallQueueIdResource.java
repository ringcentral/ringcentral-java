package com.ringcentral.definitions;


public class CallQueueIdResource
{
    /**
     * Internal identifier of a call queue
     */
    public String id;
    public CallQueueIdResource id(String id)
    {
        this.id = id;
        return this;
    }
}