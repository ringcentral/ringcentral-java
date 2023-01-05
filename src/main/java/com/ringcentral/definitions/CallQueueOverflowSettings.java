package com.ringcentral.definitions;


public class CallQueueOverflowSettings
{
    /**
     * Call queue overflow status
     */
    public Boolean enabled;
    public CallQueueOverflowSettings enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     */
    public CallQueueOverflowAgent[] items;
    public CallQueueOverflowSettings items(CallQueueOverflowAgent[] items)
    {
        this.items = items;
        return this;
    }
}