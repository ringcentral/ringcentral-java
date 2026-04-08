package com.ringcentral.definitions;


public class CallQueueOverflowSettingsRequestResource
{
    /**
     * Call queue overflow status
     */
    public Boolean enabled;
    public CallQueueOverflowSettingsRequestResource enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     */
    public CallQueueIdResource[] items;
    public CallQueueOverflowSettingsRequestResource items(CallQueueIdResource[] items)
    {
        this.items = items;
        return this;
    }
}