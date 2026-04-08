package com.ringcentral.definitions;

public class CommInteractionRuleScheduleResourceTriggers {
    /** Trigger type Example: Range Enum: Daily, Weekly, Range */
    public String triggerType;

    public CommInteractionRuleScheduleResourceTriggers triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /** Start time in format hh:mm:ss Format: time */
    public String startTime;

    public CommInteractionRuleScheduleResourceTriggers startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** End time in format hh:mm:ss Format: time */
    public String endTime;

    public CommInteractionRuleScheduleResourceTriggers endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** */
    public CommWeeklyItemsResource ranges;

    public CommInteractionRuleScheduleResourceTriggers ranges(CommWeeklyItemsResource ranges) {
        this.ranges = ranges;
        return this;
    }
}
