package com.ringcentral.definitions;

public class CommTriggerRequest {
    /** Trigger type Required Enum: Daily, Weekly, Range */
    public String triggerType;

    public CommTriggerRequest triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
}
