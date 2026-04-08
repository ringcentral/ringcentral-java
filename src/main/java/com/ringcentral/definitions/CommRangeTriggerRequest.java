package com.ringcentral.definitions;


public class CommRangeTriggerRequest
{
    /**
     * Trigger type
     * Required
     * Example: Range
     * Enum: Daily, Weekly, Range
     */
    public String triggerType;
    public CommRangeTriggerRequest triggerType(String triggerType)
    {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Required
     */
    public CommRangeRequest[] ranges;
    public CommRangeTriggerRequest ranges(CommRangeRequest[] ranges)
    {
        this.ranges = ranges;
        return this;
    }
}