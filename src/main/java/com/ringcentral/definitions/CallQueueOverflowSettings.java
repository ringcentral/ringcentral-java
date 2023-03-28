package com.ringcentral.definitions;


public class CallQueueOverflowSettings {
    /**
     * Call queue overflow status
     */
    public Boolean enabled;
    /**
     *
     */
    public CallQueueOverflowAgent[] items;

    public CallQueueOverflowSettings enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CallQueueOverflowSettings items(CallQueueOverflowAgent[] items) {
        this.items = items;
        return this;
    }
}
