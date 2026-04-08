package com.ringcentral.definitions;

public class TMMessageAttachmentInfo {
    /** Internal identifier of an attachment */
    public String id;

    public TMMessageAttachmentInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Type of an attachment Default: Card Enum: Card, Event, File, Note, Task */
    public String type;

    public TMMessageAttachmentInfo type(String type) {
        this.type = type;
        return this;
    }

    /** Link to a binary content Format: uri */
    public String contentUri;

    public TMMessageAttachmentInfo contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    /** Name of a file */
    public String name;

    public TMMessageAttachmentInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A string of default text that will be rendered in the case that the client does not support
     * Interactive Messages
     */
    public String fallback;

    public TMMessageAttachmentInfo fallback(String fallback) {
        this.fallback = fallback;
        return this;
    }

    /** A pretext to the message */
    public String intro;

    public TMMessageAttachmentInfo intro(String intro) {
        this.intro = intro;
        return this;
    }

    /** */
    public TMAttachmentAuthorInfo author;

    public TMMessageAttachmentInfo author(TMAttachmentAuthorInfo author) {
        this.author = author;
        return this;
    }

    /** Message title */
    public String title;

    public TMMessageAttachmentInfo title(String title) {
        this.title = title;
        return this;
    }

    /**
     * A large string field (up to 1000 chars) to be displayed as the body of a message (Supports
     * GlipDown)
     */
    public String text;

    public TMMessageAttachmentInfo text(String text) {
        this.text = text;
        return this;
    }

    /** Link to an image displayed at the bottom of a message Format: uri */
    public String imageUri;

    public TMMessageAttachmentInfo imageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    /** Link to an image preview displayed to the right of a message (82x82) Format: uri */
    public String thumbnailUri;

    public TMMessageAttachmentInfo thumbnailUri(String thumbnailUri) {
        this.thumbnailUri = thumbnailUri;
        return this;
    }

    /** Information on navigation */
    public TMAttachmentFieldsInfo[] fields;

    public TMMessageAttachmentInfo fields(TMAttachmentFieldsInfo[] fields) {
        this.fields = fields;
        return this;
    }

    /** */
    public TMAttachmentFootnoteInfo footnote;

    public TMMessageAttachmentInfo footnote(TMAttachmentFootnoteInfo footnote) {
        this.footnote = footnote;
        return this;
    }

    /** Internal identifier of a person created an event */
    public String creatorId;

    public TMMessageAttachmentInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /** Datetime of starting an event Format: date-time */
    public String startTime;

    public TMMessageAttachmentInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** Datetime of ending an event Format: date-time */
    public String endTime;

    public TMMessageAttachmentInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** Indicates whether an event has some specific time slot or lasts for the whole day(s) */
    public Boolean allDay;

    public TMMessageAttachmentInfo allDay(Boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    /** */
    public EventRecurrenceInfo recurrence;

    public TMMessageAttachmentInfo recurrence(EventRecurrenceInfo recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Color of Event title, including its presentation in Calendar; or the color of the side border
     * of an interactive message of a Card Default: Black Enum: Black, Red, Orange, Yellow, Green,
     * Blue, Purple, Magenta
     */
    public String color;

    public TMMessageAttachmentInfo color(String color) {
        this.color = color;
        return this;
    }

    /** Event location */
    public String location;

    public TMMessageAttachmentInfo location(String location) {
        this.location = location;
        return this;
    }

    /** Event details */
    public String description;

    public TMMessageAttachmentInfo description(String description) {
        this.description = description;
        return this;
    }
}
