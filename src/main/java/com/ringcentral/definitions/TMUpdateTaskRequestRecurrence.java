package com.ringcentral.definitions;


public class TMUpdateTaskRequestRecurrence
{
    /**
     * Task recurrence settings.
     * Default: None
     * Enum: None, Daily, Weekdays, Weekly, Monthly, Yearly
     */
    public String schedule;
    public TMUpdateTaskRequestRecurrence schedule(String schedule)
    {
        this.schedule = schedule;
        return this;
    }

    /**
     * Task ending condition.
     * Enum: None, Count, Date
     */
    public String endingCondition;
    public TMUpdateTaskRequestRecurrence endingCondition(String endingCondition)
    {
        this.endingCondition = endingCondition;
        return this;
    }

    /**
     * Count of iterations of periodic tasks.
     * Maximum: 10
     * Minimum: 1
     * Format: int32
     */
    public Long endingAfter;
    public TMUpdateTaskRequestRecurrence endingAfter(Long endingAfter)
    {
        this.endingAfter = endingAfter;
        return this;
    }

    /**
     * The end date of periodic task in UTC time zone.
     * Format: date-time
     */
    public String endingOn;
    public TMUpdateTaskRequestRecurrence endingOn(String endingOn)
    {
        this.endingOn = endingOn;
        return this;
    }
}