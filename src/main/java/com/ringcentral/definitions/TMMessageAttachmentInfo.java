package com.ringcentral.definitions;


public class TMMessageAttachmentInfo {
    /**
     * Internal identifier of an attachment
     */
    public String id;
    /**
     * Type of an attachment
     * Default: Card
     * Enum: Card, Event, File, Note, Task
     */
    public String type;
    /**
     * A string of default text that will be rendered in the case that the client does not support Interactive Messages
     */
    public String fallback;
    /**
     * A pretext to the message
     */
    public String intro;
    /**
     *
     */
    public TMAttachmentAuthorInfo author;
    /**
     * Message title
     */
    public String title;
    /**
     * A large string field (up to 1000 chars) to be displayed as the body of a message (Supports GlipDown)
     */
    public String text;
    /**
     * Link to an image displayed at the bottom of a message
     * Format: uri
     */
    public String imageUri;
    /**
     * Link to an image preview displayed to the right of a message (82x82)
     * Format: uri
     */
    public String thumbnailUri;
    /**
     * Information on navigation
     */
    public TMAttachmentFieldsInfo[] fields;
    /**
     *
     */
    public TMAttachmentFootnoteInfo footnote;
    /**
     * Internal identifier of a person created an event
     */
    public String creatorId;
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
     * Event recurrence settings.
     * Enum: None, Day, Weekday, Week, Month, Year
     */
    public String recurrence;
    /**
     * Condition of ending an event
     * Enum: None, Count, Date
     */
    public String endingCondition;
    /**
     * Count of event iterations. For periodic events only. Value range is 1 - 10.
     * Must be specified if `endingCondition` is `Count`
     * Format: int32
     */
    public Long endingAfter;
    /**
     * Iterations ending datetime for periodic events in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String endingOn;
    /**
     * Color of Event title, including its presentation in Calendar; or the color of the side border of an interactive message of a Card
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

    public TMMessageAttachmentInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMMessageAttachmentInfo type(String type) {
        this.type = type;
        return this;
    }

    public TMMessageAttachmentInfo fallback(String fallback) {
        this.fallback = fallback;
        return this;
    }

    public TMMessageAttachmentInfo intro(String intro) {
        this.intro = intro;
        return this;
    }

    public TMMessageAttachmentInfo author(TMAttachmentAuthorInfo author) {
        this.author = author;
        return this;
    }

    public TMMessageAttachmentInfo title(String title) {
        this.title = title;
        return this;
    }

    public TMMessageAttachmentInfo text(String text) {
        this.text = text;
        return this;
    }

    public TMMessageAttachmentInfo imageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    public TMMessageAttachmentInfo thumbnailUri(String thumbnailUri) {
        this.thumbnailUri = thumbnailUri;
        return this;
    }

    public TMMessageAttachmentInfo fields(TMAttachmentFieldsInfo[] fields) {
        this.fields = fields;
        return this;
    }

    public TMMessageAttachmentInfo footnote(TMAttachmentFootnoteInfo footnote) {
        this.footnote = footnote;
        return this;
    }

    public TMMessageAttachmentInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public TMMessageAttachmentInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public TMMessageAttachmentInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public TMMessageAttachmentInfo allDay(Boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    public TMMessageAttachmentInfo recurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public TMMessageAttachmentInfo endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

    public TMMessageAttachmentInfo endingAfter(Long endingAfter) {
        this.endingAfter = endingAfter;
        return this;
    }

    public TMMessageAttachmentInfo endingOn(String endingOn) {
        this.endingOn = endingOn;
        return this;
    }

    public TMMessageAttachmentInfo color(String color) {
        this.color = color;
        return this;
    }

    public TMMessageAttachmentInfo location(String location) {
        this.location = location;
        return this;
    }

    public TMMessageAttachmentInfo description(String description) {
        this.description = description;
        return this;
    }
}
