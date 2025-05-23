package com.ringcentral.definitions;


public class CommWeeklyTriggerResource {
    /**
     * Trigger type
     * Required
     * Example: Weekly
     * Enum: Daily, Weekly, Range
     */
    public String triggerType;
    /**
     * Required
     */
    public CommWeeklyItemsResource ranges;

    public CommWeeklyTriggerResource triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    public CommWeeklyTriggerResource ranges(CommWeeklyItemsResource ranges) {
        this.ranges = ranges;
        return this;
    }
}
