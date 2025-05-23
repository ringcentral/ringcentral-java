package com.ringcentral.definitions;


public class CommWeeklyRangeResource {
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

    public CommWeeklyRangeResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CommWeeklyRangeResource endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
}
