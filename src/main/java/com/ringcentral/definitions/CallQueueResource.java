package com.ringcentral.definitions;


public class CallQueueResource
{
    /**
     * Example: 873014540006
     */
    public String id;
    public CallQueueResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Example: Sales CQ
     */
    public String name;
    public CallQueueResource name(String name)
    {
        this.name = name;
        return this;
    }
}