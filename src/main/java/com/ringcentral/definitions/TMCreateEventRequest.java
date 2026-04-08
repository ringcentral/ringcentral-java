package com.ringcentral.definitions;


public class TMCreateEventRequest
{
    /**
     * Internal identifier of an event
     */
    public String id;
    public TMCreateEventRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Internal identifier of a person created an event
     */
    public String creatorId;
    public TMCreateEventRequest creatorId(String creatorId)
    {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * Event title
     * Required
     */
    public String title;
    public TMCreateEventRequest title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * Datetime of starting an event
     * Required
     * Format: date-time
     */
    public String startTime;
    public TMCreateEventRequest startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Datetime of ending an event
     * Required
     * Format: date-time
     */
    public String endTime;
    public TMCreateEventRequest endTime(String endTime)
    {
        this.endTime = endTime;
        return this;
    }

    /**
     * Indicates whether event has some specific time slot or lasts for whole day(s)
     */
    public Boolean allDay;
    public TMCreateEventRequest allDay(Boolean allDay)
    {
        this.allDay = allDay;
        return this;
    }

    /**
     */
    public EventRecurrenceInfo recurrence;
    public TMCreateEventRequest recurrence(EventRecurrenceInfo recurrence)
    {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Color of Event title (including its presentation in Calendar)
     * Default: Black
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    public TMCreateEventRequest color(String color)
    {
        this.color = color;
        return this;
    }

    /**
     * Event location
     */
    public String location;
    public TMCreateEventRequest location(String location)
    {
        this.location = location;
        return this;
    }

    /**
     * Event details
     */
    public String description;
    public TMCreateEventRequest description(String description)
    {
        this.description = description;
        return this;
    }
}