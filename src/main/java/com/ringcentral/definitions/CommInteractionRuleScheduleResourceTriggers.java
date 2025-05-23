package com.ringcentral.definitions;


public class CommInteractionRuleScheduleResourceTriggers {
    /**
     * Trigger type
     * Example: Range
     * Enum: Daily, Weekly, Range
     */
    public String triggerType;
    /**
     * Start time in format hh:mm:ss
     * Format: time
     */
    public String startTime;
    /**
     * End time in format hh:mm:ss
     * Format: time
     */
    public String endTime;
    /**
     *
     */
    public CommWeeklyItemsResource ranges;

    public CommInteractionRuleScheduleResourceTriggers triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    public CommInteractionRuleScheduleResourceTriggers startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CommInteractionRuleScheduleResourceTriggers endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public CommInteractionRuleScheduleResourceTriggers ranges(CommWeeklyItemsResource ranges) {
        this.ranges = ranges;
        return this;
    }
}
