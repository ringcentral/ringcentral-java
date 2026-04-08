package com.ringcentral.definitions;


public class UserCallQueues
{
    /**
     * List of queues where an extension is an agent
     */
    public QueueShortInfoResource[] records;
    public UserCallQueues records(QueueShortInfoResource[] records)
    {
        this.records = records;
        return this;
    }
}