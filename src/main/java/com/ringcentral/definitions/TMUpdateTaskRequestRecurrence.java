package com.ringcentral.definitions;


public class TMUpdateTaskRequestRecurrence {
    /**
     * Task recurrence settings.
     * Default: None
     * Enum: None, Daily, Weekdays, Weekly, Monthly, Yearly
     */
    public String schedule;
    /**
     * Task ending condition.
     * Enum: None, Count, Date
     */
    public String endingCondition;
    /**
     * Count of iterations of periodic tasks
     * Maximum: 10
     * Minimum: 1
     * Format: int32
     */
    public Long endingAfter;
    /**
     * The end date of periodic task in UTC time zone
     * Format: date-time
     */
    public String endingOn;

    public TMUpdateTaskRequestRecurrence schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public TMUpdateTaskRequestRecurrence endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

    public TMUpdateTaskRequestRecurrence endingAfter(Long endingAfter) {
        this.endingAfter = endingAfter;
        return this;
    }

    public TMUpdateTaskRequestRecurrence endingOn(String endingOn) {
        this.endingOn = endingOn;
        return this;
    }
}
