package com.ringcentral.definitions;

public class CommDailyTriggerRequest {
    /** Trigger type Required Example: Daily Enum: Daily, Weekly, Range */
    public String triggerType;

    public CommDailyTriggerRequest triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /** Start time in format hh:mm:ss Required Format: time */
    public String startTime;

    public CommDailyTriggerRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** End time in format hh:mm:ss Required Format: time */
    public String endTime;

    public CommDailyTriggerRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
}
