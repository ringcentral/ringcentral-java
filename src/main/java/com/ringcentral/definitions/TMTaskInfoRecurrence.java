package com.ringcentral.definitions;


public class TMTaskInfoRecurrence {
    /**
     * Task recurrence settings. None for non-periodic tasks
     * Enum: None, Daily, Weekdays, Weekly, Monthly, Yearly
     */
    public String schedule;
    /**
     * Task ending condition
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
     * End date of periodic task
     * Format: date-time
     */
    public String endingOn;

    public TMTaskInfoRecurrence schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public TMTaskInfoRecurrence endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

    public TMTaskInfoRecurrence endingAfter(Long endingAfter) {
        this.endingAfter = endingAfter;
        return this;
    }

    public TMTaskInfoRecurrence endingOn(String endingOn) {
        this.endingOn = endingOn;
        return this;
    }
}
