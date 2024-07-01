package com.ringcentral.definitions;


public class TMCreateEventRequest {
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
     * Required
     */
    public String title;
    /**
     * Datetime of starting an event
     * Required
     * Format: date-time
     */
    public String startTime;
    /**
     * Datetime of ending an event
     * Required
     * Format: date-time
     */
    public String endTime;
    /**
     * Indicates whether event has some specific time slot or lasts for whole day(s)
     */
    public Boolean allDay;
    /**
     *
     */
    public EventRecurrenceInfo recurrence;
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

    public TMCreateEventRequest id(String id) {
        this.id = id;
        return this;
    }

    public TMCreateEventRequest creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public TMCreateEventRequest title(String title) {
        this.title = title;
        return this;
    }

    public TMCreateEventRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public TMCreateEventRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public TMCreateEventRequest allDay(Boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    public TMCreateEventRequest recurrence(EventRecurrenceInfo recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public TMCreateEventRequest color(String color) {
        this.color = color;
        return this;
    }

    public TMCreateEventRequest location(String location) {
        this.location = location;
        return this;
    }

    public TMCreateEventRequest description(String description) {
        this.description = description;
        return this;
    }
}
