package com.ringcentral.definitions;


public class TMEventInfo
{
    /**
     * Internal identifier of an event
     */
    public String id;
    public TMEventInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Internal identifier of a person created an event
     */
    public String creatorId;
    public TMEventInfo creatorId(String creatorId)
    {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * Event title
     */
    public String title;
    public TMEventInfo title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * Datetime of starting an event
     * Format: date-time
     */
    public String startTime;
    public TMEventInfo startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Datetime of ending an event
     * Format: date-time
     */
    public String endTime;
    public TMEventInfo endTime(String endTime)
    {
        this.endTime = endTime;
        return this;
    }

    /**
     * Indicates whether an event has some specific time slot or lasts for the whole day(s)
     */
    public Boolean allDay;
    public TMEventInfo allDay(Boolean allDay)
    {
        this.allDay = allDay;
        return this;
    }

    /**
     */
    public EventRecurrenceInfo recurrence;
    public TMEventInfo recurrence(EventRecurrenceInfo recurrence)
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
    public TMEventInfo color(String color)
    {
        this.color = color;
        return this;
    }

    /**
     * Event location
     */
    public String location;
    public TMEventInfo location(String location)
    {
        this.location = location;
        return this;
    }

    /**
     * Event details
     */
    public String description;
    public TMEventInfo description(String description)
    {
        this.description = description;
        return this;
    }
}