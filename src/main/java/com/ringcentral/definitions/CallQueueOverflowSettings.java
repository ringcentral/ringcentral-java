package com.ringcentral.definitions;

public class CallQueueOverflowSettings {
    /** Call queue overflow status */
    public Boolean enabled;

    public CallQueueOverflowSettings enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Extension subtype, if applicable. For unrecognized subtypes the `Unknown` value is returned
     * Enum: VideoPro, VideoProPlus, DigitalSignageOnlyRooms, Unknown, Emergency
     */
    public String subType;

    public CallQueueOverflowSettings subType(String subType) {
        this.subType = subType;
        return this;
    }

    /** */
    public CallQueueInfo[] items;

    public CallQueueOverflowSettings items(CallQueueInfo[] items) {
        this.items = items;
        return this;
    }
}
