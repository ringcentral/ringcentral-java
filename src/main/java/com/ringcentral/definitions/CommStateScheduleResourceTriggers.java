package com.ringcentral.definitions;


public class CommStateScheduleResourceTriggers {
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

    public CommStateScheduleResourceTriggers triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    public CommStateScheduleResourceTriggers startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CommStateScheduleResourceTriggers endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public CommStateScheduleResourceTriggers ranges(CommWeeklyItemsResource ranges) {
        this.ranges = ranges;
        return this;
    }
}
