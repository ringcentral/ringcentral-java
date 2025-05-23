package com.ringcentral.definitions;


public class CommDailyTriggerResource {
    /**
     * Trigger type
     * Required
     * Example: Daily
     * Enum: Daily, Weekly, Range
     */
    public String triggerType;
    /**
     * Start time in format hh:mm:ss
     * Required
     * Format: time
     */
    public String startTime;
    /**
     * End time in format hh:mm:ss
     * Required
     * Format: time
     */
    public String endTime;

    public CommDailyTriggerResource triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    public CommDailyTriggerResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CommDailyTriggerResource endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
}
