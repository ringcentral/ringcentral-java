package com.ringcentral.definitions;


public class GlipAttachmentInfoRequest {
    /**
     * Type of attachment
     * Default: Card
     * Enum: Card, Event, Note
     */
    public String type;
    /**
     * Attachment title
     */
    public String title;
    /**
     * Default message returned in case the client does not support interactive messages
     */
    public String fallback;
    /**
     * Color of Event title, including its presentation in Calendar; or the color of the side border of an interactive message of a Card. The default color is 'Black'
     */
    public String color;
    /**
     * Introductory text displayed directly above a message
     */
    public String intro;
    /**
     * Information about the author
     */
    public GlipMessageAttachmentAuthorInfo author;
    /**
     * Text of attachment (up to 1000 chars), supports GlipDown
     */
    public String text;
    /**
     * Link to an image displayed at the bottom of a message
     */
    public String imageUri;
    /**
     * Link to an image preview displayed to the right of a message (82x82)
     */
    public String thumbnailUri;
    /**
     * Individual subsections within a message
     */
    public GlipMessageAttachmentFieldsInfo[] fields;
    /**
     * Message footer information
     */
    public GlipMessageAttachmentFootnoteInfo footnote;
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
     * Event recurrence settings. For non-periodic events the value is 'None'. Must be greater or equal to event duration: 1- Day/Weekday; 7 - Week; 28 - Month; 365 - Year
     * Enum: None, Day, Weekday, Week, Month, Year
     */
    public String recurrence;
    /**
     * Condition of ending an event
     */
    public String endingCondition;

    public GlipAttachmentInfoRequest type(String type) {
        this.type = type;
        return this;
    }

    public GlipAttachmentInfoRequest title(String title) {
        this.title = title;
        return this;
    }

    public GlipAttachmentInfoRequest fallback(String fallback) {
        this.fallback = fallback;
        return this;
    }

    public GlipAttachmentInfoRequest color(String color) {
        this.color = color;
        return this;
    }

    public GlipAttachmentInfoRequest intro(String intro) {
        this.intro = intro;
        return this;
    }

    public GlipAttachmentInfoRequest author(GlipMessageAttachmentAuthorInfo author) {
        this.author = author;
        return this;
    }

    public GlipAttachmentInfoRequest text(String text) {
        this.text = text;
        return this;
    }

    public GlipAttachmentInfoRequest imageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    public GlipAttachmentInfoRequest thumbnailUri(String thumbnailUri) {
        this.thumbnailUri = thumbnailUri;
        return this;
    }

    public GlipAttachmentInfoRequest fields(GlipMessageAttachmentFieldsInfo[] fields) {
        this.fields = fields;
        return this;
    }

    public GlipAttachmentInfoRequest footnote(GlipMessageAttachmentFootnoteInfo footnote) {
        this.footnote = footnote;
        return this;
    }

    public GlipAttachmentInfoRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public GlipAttachmentInfoRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public GlipAttachmentInfoRequest allDay(Boolean allDay) {
        this.allDay = allDay;
        return this;
    }

    public GlipAttachmentInfoRequest recurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public GlipAttachmentInfoRequest endingCondition(String endingCondition) {
        this.endingCondition = endingCondition;
        return this;
    }

}
