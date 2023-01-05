package com.ringcentral.definitions;


public class QueueShortInfoResource
{
    /**
     * Call queue extension identifier
     */
    public String id;
    public QueueShortInfoResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Call queue name (read-only)
     */
    public String name;
    public QueueShortInfoResource name(String name)
    {
        this.name = name;
        return this;
    }
}