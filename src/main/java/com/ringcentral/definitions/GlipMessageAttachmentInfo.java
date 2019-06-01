package com.ringcentral.definitions;


public class GlipMessageAttachmentInfo {
    /**
     * Internal identifier of an attachment
     */
    public String id;
    /**
     * Type of an attachment
     * Default: Card
     * Enum: Card, Event, Note
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
     * Information about the author
     */
    public GlipMessageAttachmentAuthorInfo author;
    /**
     * Message title
     */
    public String title;
    /**
     * A large string field (up to 1000 chars) to be displayed as the body of a message (Supports GlipDown)
     */
    public String text;
    /**
     * url used to display a single image at the bottom of a message
     */
    public String imageUri;
    /**
     * url used to display a thumbnail to the right of a message (82x82)
     */
    public String thumbnailUri;
    /**
     * Information on navigation
     */
    public GlipMessageAttachmentFieldsInfo[] fields;
    /**
     * Message Footer
     */
    public GlipMessageAttachmentFootnoteInfo footnote;
    /**
     * Internal identifier of a person created an event
     */
    public String creatorId;
    /**
     * Datetime of starting an event
     */
    public String startTime;
    /**
     * Datetime of ending an event
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
     * Condition of ending
     */
    public String endingCondition;
    /**
     * Count of iterations. For periodic events only
     */
    public Long endingAfter;
    /**
     * Iterations end datetime for periodic events
     * Default: None
     * Enum: None, Count, Date
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

    public GlipMessageAttachmentInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipMessageAttachmentInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipMessageAttachmentInfo fallback(String fallback) {
        this.fallback = fallback;
        return this;
    }

    public GlipMessageAttachmentInfo intro(String intro) {
        this.intro = intro;
        return this;
    }

    public GlipMessageAttachmentInfo author(GlipMessageAttachmentAuthorInfo author) {
        this.author = author;
        return this;
    }

    public GlipMessageAttachmentInfo title(String title) {
        this.title = title;
        return this;
    }

    public GlipMessageAttachmentInfo text(String text) {
        this.text = text;
        return this;
    }

    public GlipMessageAttachmentInfo imageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    public GlipMessageAttachmentInfo thumbnailUri(String thumbnailUri) {
        this.thumbnailUri = thumbnailUri;
        return this;
    }

    public GlipMessageAttachmentInfo fields(GlipMessageAttachmentFieldsInfo[] fields) {
        this.fields = fields;
        return this;
    }

    public GlipMessageAttachmentInfo footnote(GlipMessageAttachmentFootnoteInfo footnote) {
        this.footnote = footnote;
        return this;
    }

    public GlipMessageAttachmentInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public GlipMessageAttachmentInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public GlipMessageAttachmentInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public GlipMessageAttachmentInfo allDay(Boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    public GlipMessageAttachmentInfo recurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public GlipMessageAttachmentInfo endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

    public GlipMessageAttachmentInfo endingAfter(Long endingAfter) {
        this.endingAfter = endingAfter;
        return this;
    }

    public GlipMessageAttachmentInfo endingOn(String endingOn) {
        this.endingOn = endingOn;
        return this;
    }

    public GlipMessageAttachmentInfo color(String color) {
        this.color = color;
        return this;
    }

    public GlipMessageAttachmentInfo location(String location) {
        this.location = location;
        return this;
    }

    public GlipMessageAttachmentInfo description(String description) {
        this.description = description;
        return this;
    }

}
