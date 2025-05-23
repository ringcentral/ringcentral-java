package com.ringcentral.definitions;


public class CommTriggerResource {
    /**
     * Trigger type
     * Required
     * Enum: Daily, Weekly, Range
     */
    public String triggerType;

    public CommTriggerResource triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
}
