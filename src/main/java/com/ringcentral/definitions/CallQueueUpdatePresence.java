package com.ringcentral.definitions;


public class CallQueueUpdatePresence
{
    /**
     */
    public CallQueueUpdateMemberPresence[] records;
    public CallQueueUpdatePresence records(CallQueueUpdateMemberPresence[] records)
    {
        this.records = records;
        return this;
    }
}