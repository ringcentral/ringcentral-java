package com.ringcentral.definitions;


public class CallQueueInfo
{
    /**
     * Link to a call queue
     * Format: uri
     */
    public String uri;
    public CallQueueInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a call queue
     */
    public String id;
    public CallQueueInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Extension number of a call queue
     */
    public String extensionNumber;
    public CallQueueInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Name of a call queue
     */
    public String name;
    public CallQueueInfo name(String name)
    {
        this.name = name;
        return this;
    }
}