package com.ringcentral.definitions;


public class GlipTaskRecurrenceInfo {
    /**
     * Task recurrence settings. For non-periodic tasks the value is 'None'
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
     */
    public Long endingAfter;
    /**
     * End date of periodic task
     * Format: date-time
     */
    public String endingOn;

    public GlipTaskRecurrenceInfo schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public GlipTaskRecurrenceInfo endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

    public GlipTaskRecurrenceInfo endingAfter(Long endingAfter) {
        this.endingAfter = endingAfter;
        return this;
    }

    public GlipTaskRecurrenceInfo endingOn(String endingOn) {
        this.endingOn = endingOn;
        return this;
    }
}
