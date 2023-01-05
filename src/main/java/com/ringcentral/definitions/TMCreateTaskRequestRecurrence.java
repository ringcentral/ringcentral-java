package com.ringcentral.definitions;


public class TMCreateTaskRequestRecurrence
{
    /**
     * Task recurrence settings.
     * Default: None
     * Enum: None, Daily, Weekdays, Weekly, Monthly, Yearly
     */
    public String schedule;
    public TMCreateTaskRequestRecurrence schedule(String schedule)
    {
        this.schedule = schedule;
        return this;
    }

    /**
     * Task ending condition.
     * Default: None
     * Enum: None, Count, Date
     */
    public String endingCondition;
    public TMCreateTaskRequestRecurrence endingCondition(String endingCondition)
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
    public TMCreateTaskRequestRecurrence endingAfter(Long endingAfter)
    {
        this.endingAfter = endingAfter;
        return this;
    }

    /**
     * The end date of periodic task in UTC time zone.
     * Format: date-time
     */
    public String endingOn;
    public TMCreateTaskRequestRecurrence endingOn(String endingOn)
    {
        this.endingOn = endingOn;
        return this;
    }
}