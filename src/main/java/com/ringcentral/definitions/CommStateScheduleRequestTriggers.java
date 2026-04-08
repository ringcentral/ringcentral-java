package com.ringcentral.definitions;

public class CommStateScheduleRequestTriggers {
    /** Trigger type Example: Range Enum: Daily, Weekly, Range */
    public String triggerType;

    public CommStateScheduleRequestTriggers triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /** Start time in format hh:mm:ss Format: time */
    public String startTime;

    public CommStateScheduleRequestTriggers startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** End time in format hh:mm:ss Format: time */
    public String endTime;

    public CommStateScheduleRequestTriggers endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** */
    public CommWeeklyItemsResource ranges;

    public CommStateScheduleRequestTriggers ranges(CommWeeklyItemsResource ranges) {
        this.ranges = ranges;
        return this;
    }
}
