package com.ringcentral.definitions;


public class CallQueueUpdatePresence
{
    /**
     */
    public CallQueueMemberPresence[] records;
    public CallQueueUpdatePresence records(CallQueueMemberPresence[] records)
    {
        this.records = records;
        return this;
    }
}