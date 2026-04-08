package com.ringcentral.definitions;


public class CommStateScheduleResourceTriggers
{
    /**
     * Trigger type
     * Example: Range
     * Enum: Daily, Weekly, Range
     */
    public String triggerType;
    public CommStateScheduleResourceTriggers triggerType(String triggerType)
    {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Start time in format hh:mm:ss
     * Format: time
     */
    public String startTime;
    public CommStateScheduleResourceTriggers startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * End time in format hh:mm:ss
     * Format: time
     */
    public String endTime;
    public CommStateScheduleResourceTriggers endTime(String endTime)
    {
        this.endTime = endTime;
        return this;
    }

    /**
     */
    public CommWeeklyItemsResource ranges;
    public CommStateScheduleResourceTriggers ranges(CommWeeklyItemsResource ranges)
    {
        this.ranges = ranges;
        return this;
    }
}