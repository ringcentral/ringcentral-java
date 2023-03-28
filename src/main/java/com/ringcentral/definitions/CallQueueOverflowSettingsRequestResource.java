package com.ringcentral.definitions;


public class CallQueueOverflowSettingsRequestResource {
    /**
     * Call queue overflow status
     */
    public Boolean enabled;
    /**
     *
     */
    public CallQueueIdResource[] items;

    public CallQueueOverflowSettingsRequestResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CallQueueOverflowSettingsRequestResource items(CallQueueIdResource[] items) {
        this.items = items;
        return this;
    }
}
