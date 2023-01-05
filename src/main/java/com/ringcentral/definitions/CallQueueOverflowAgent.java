package com.ringcentral.definitions;


public class CallQueueOverflowAgent
{
    /**
     * Internal identifier of a Call queue extension
     */
    public String id;
    public CallQueueOverflowAgent id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Extension number of call queue
     */
    public String extensionNumber;
    public CallQueueOverflowAgent extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Name of a call queue
     */
    public String name;
    public CallQueueOverflowAgent name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Queue current state (Enabled/Disabled)
     * Enum: Disabled, Enabled
     */
    public String status;
    public CallQueueOverflowAgent status(String status)
    {
        this.status = status;
        return this;
    }
}