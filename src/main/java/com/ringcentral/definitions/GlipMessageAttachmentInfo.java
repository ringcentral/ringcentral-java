package com.ringcentral.definitions;


public class GlipMessageAttachmentInfo
{
    /**
         * Internal identifier of an attachment
         */
        public String id;
  public GlipMessageAttachmentInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of an attachment
         * Default: Card
         * Enum: Card, Event, File, Note, Task
         */
        public String type;
  public GlipMessageAttachmentInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * A string of default text that will be rendered in the case that the client does not support Interactive Messages
         */
        public String fallback;
  public GlipMessageAttachmentInfo fallback(String fallback)
  {
    this.fallback = fallback;
    return this;
  }
  

        /**
         * A pretext to the message
         */
        public String intro;
  public GlipMessageAttachmentInfo intro(String intro)
  {
    this.intro = intro;
    return this;
  }
  

        /**
         */
        public GlipMessageAttachmentAuthorInfo author;
  public GlipMessageAttachmentInfo author(GlipMessageAttachmentAuthorInfo author)
  {
    this.author = author;
    return this;
  }
  

        /**
         * Message title
         */
        public String title;
  public GlipMessageAttachmentInfo title(String title)
  {
    this.title = title;
    return this;
  }
  

        /**
         * A large string field (up to 1000 chars) to be displayed as the body of a message (Supports GlipDown)
         */
        public String text;
  public GlipMessageAttachmentInfo text(String text)
  {
    this.text = text;
    return this;
  }
  

        /**
         * Link to an image displayed at the bottom of a message
         */
        public String imageUri;
  public GlipMessageAttachmentInfo imageUri(String imageUri)
  {
    this.imageUri = imageUri;
    return this;
  }
  

        /**
         * Link to an image preview displayed to the right of a message (82x82)
         */
        public String thumbnailUri;
  public GlipMessageAttachmentInfo thumbnailUri(String thumbnailUri)
  {
    this.thumbnailUri = thumbnailUri;
    return this;
  }
  

        /**
         * Information on navigation
         */
        public GlipMessageAttachmentFieldsInfo[] fields;
  public GlipMessageAttachmentInfo fields(GlipMessageAttachmentFieldsInfo[] fields)
  {
    this.fields = fields;
    return this;
  }
  

        /**
         */
        public GlipMessageAttachmentFootnoteInfo footnote;
  public GlipMessageAttachmentInfo footnote(GlipMessageAttachmentFootnoteInfo footnote)
  {
    this.footnote = footnote;
    return this;
  }
  

        /**
         * Internal identifier of a person created an event
         */
        public String creatorId;
  public GlipMessageAttachmentInfo creatorId(String creatorId)
  {
    this.creatorId = creatorId;
    return this;
  }
  

        /**
         * Datetime of starting an event
         */
        public String startTime;
  public GlipMessageAttachmentInfo startTime(String startTime)
  {
    this.startTime = startTime;
    return this;
  }
  

        /**
         * Datetime of ending an event
         */
        public String endTime;
  public GlipMessageAttachmentInfo endTime(String endTime)
  {
    this.endTime = endTime;
    return this;
  }
  

        /**
         * Indicates whether an event has some specific time slot or lasts for the whole day(s)
         */
        public Boolean allDay;
  public GlipMessageAttachmentInfo allDay(Boolean allDay)
  {
    this.allDay = allDay;
    return this;
  }
  

        /**
         * Event recurrence settings.
         * Enum: None, Day, Weekday, Week, Month, Year
         */
        public String recurrence;
  public GlipMessageAttachmentInfo recurrence(String recurrence)
  {
    this.recurrence = recurrence;
    return this;
  }
  

        /**
         * Condition of ending
         */
        public String endingCondition;
  public GlipMessageAttachmentInfo endingCondition(String endingCondition)
  {
    this.endingCondition = endingCondition;
    return this;
  }
  

        /**
         * Count of iterations. For periodic events only
         */
        public Long endingAfter;
  public GlipMessageAttachmentInfo endingAfter(Long endingAfter)
  {
    this.endingAfter = endingAfter;
    return this;
  }
  

        /**
         * Iterations end datetime for periodic events
         * Default: None
         * Enum: None, Count, Date
         */
        public String endingOn;
  public GlipMessageAttachmentInfo endingOn(String endingOn)
  {
    this.endingOn = endingOn;
    return this;
  }
  

        /**
         * Color of Event title, including its presentation in Calendar; or the color of the side border of an interactive message of a Card
         * Default: Black
         * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
         */
        public String color;
  public GlipMessageAttachmentInfo color(String color)
  {
    this.color = color;
    return this;
  }
  

        /**
         * Event location
         */
        public String location;
  public GlipMessageAttachmentInfo location(String location)
  {
    this.location = location;
    return this;
  }
  

        /**
         * Event details
         */
        public String description;
  public GlipMessageAttachmentInfo description(String description)
  {
    this.description = description;
    return this;
  }
  
}
