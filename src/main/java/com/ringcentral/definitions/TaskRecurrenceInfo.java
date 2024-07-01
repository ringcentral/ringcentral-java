package com.ringcentral.definitions;


    /**
* Task information
*/
public class TaskRecurrenceInfo
{
    /**
     * Recurrence settings of a task. None for non-periodic tasks
     * Default: None
     * Enum: None, Daily, Weekdays, Weekly, Monthly, Yearly
     */
    public String schedule;
    public TaskRecurrenceInfo schedule(String schedule)
    {
        this.schedule = schedule;
        return this;
    }

    /**
     * Ending condition of a task
     * Default: None
     * Enum: None, Count, Date
     */
    public String endingCondition;
    public TaskRecurrenceInfo endingCondition(String endingCondition)
    {
        this.endingCondition = endingCondition;
        return this;
    }

    /**
     * Count of iterations of periodic tasks
     * Maximum: 10
     * Minimum: 1
     * Format: int32
     */
    public Long endingAfter;
    public TaskRecurrenceInfo endingAfter(Long endingAfter)
    {
        this.endingAfter = endingAfter;
        return this;
    }

    /**
     * End date of a periodic task in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) 
    * format, UTC time zone
     * Format: date-time
     */
    public String endingOn;
    public TaskRecurrenceInfo endingOn(String endingOn)
    {
        this.endingOn = endingOn;
        return this;
    }
}