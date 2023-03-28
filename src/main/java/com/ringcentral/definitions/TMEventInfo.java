package com.ringcentral.definitions;


public class TMEventInfo {
    /**
     * Internal identifier of an event
     */
    public String id;
    /**
     * Internal identifier of a person created an event
     */
    public String creatorId;
    /**
     * Event title
     */
    public String title;
    /**
     * Datetime of starting an event
     * Format: date-time
     */
    public String startTime;
    /**
     * Datetime of ending an event
     * Format: date-time
     */
    public String endTime;
    /**
     * Indicates whether an event has some specific time slot or lasts for the whole day(s)
     */
    public Boolean allDay;
    /**
     * Event recurrence settings
     * Enum: None, Day, Weekday, Week, Month, Year
     */
    public String recurrence;
    /**
     * Condition of ending
     */
    public String endingCondition;
    /**
     * Count of iterations. For periodic events only
     * Format: int32
     */
    public Long endingAfter;
    /**
     * Iterations end datetime for periodic events
     * Default: None
     * Enum: None, Count, Date
     */
    public String endingOn;
    /**
     * Color of Event title (including its presentation in Calendar)
     * Default: Black
     * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
     */
    public String color;
    /**
     * Event location
     */
    public String location;
    /**
     * Event details
     */
    public String description;

    public TMEventInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMEventInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public TMEventInfo title(String title) {
        this.title = title;
        return this;
    }

    public TMEventInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public TMEventInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public TMEventInfo allDay(Boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    public TMEventInfo recurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public TMEventInfo endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

    public TMEventInfo endingAfter(Long endingAfter) {
        this.endingAfter = endingAfter;
        return this;
    }

    public TMEventInfo endingOn(String endingOn) {
        this.endingOn = endingOn;
        return this;
    }

    public TMEventInfo color(String color) {
        this.color = color;
        return this;
    }

    public TMEventInfo location(String location) {
        this.location = location;
        return this;
    }

    public TMEventInfo description(String description) {
        this.description = description;
        return this;
    }
}
