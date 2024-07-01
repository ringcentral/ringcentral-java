package com.ringcentral.definitions;


public class EventRecurrenceInfo
{
    /**
     * Event recurrence settings. For non-periodic events the value 
    * is `None`. Must be greater or equal to event duration: 1- Day/Weekday; 
    * 7 - Week; 28 - Month; 365 - Year
     * Enum: None, Day, Weekday, Week, Month, Year
     */
    public String schedule;
    public EventRecurrenceInfo schedule(String schedule)
    {
        this.schedule = schedule;
        return this;
    }

    /**
     * Condition of ending an event
     * Enum: None, Count, Date
     */
    public String endingCondition;
    public EventRecurrenceInfo endingCondition(String endingCondition)
    {
        this.endingCondition = endingCondition;
        return this;
    }

    /**
     * Count of event iterations. For periodic events only. Value range is 1 - 10. 
    * Must be specified if `endingCondition` is `Count`
     * Format: int32
     */
    public Long endingAfter;
    public EventRecurrenceInfo endingAfter(Long endingAfter)
    {
        this.endingAfter = endingAfter;
        return this;
    }

    /**
     * Iterations ending datetime for periodic events in 
    * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String endingOn;
    public EventRecurrenceInfo endingOn(String endingOn)
    {
        this.endingOn = endingOn;
        return this;
    }
}