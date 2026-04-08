package com.ringcentral.definitions;

public class CommWeeklyTriggerRequest {
    /** Trigger type Required Example: Weekly Enum: Daily, Weekly, Range */
    public String triggerType;

    public CommWeeklyTriggerRequest triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /** Required */
    public CommWeeklyItemsResource ranges;

    public CommWeeklyTriggerRequest ranges(CommWeeklyItemsResource ranges) {
        this.ranges = ranges;
        return this;
    }
}
