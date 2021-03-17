package com.ringcentral.definitions;


public class GlipEventInfo
{
    /**
         * Internal identifier of an event
         */
        public String id;
  public GlipEventInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Internal identifier of a person created an event
         */
        public String creatorId;
  public GlipEventInfo creatorId(String creatorId)
  {
    this.creatorId = creatorId;
    return this;
  }
  

        /**
         * Event title
         */
        public String title;
  public GlipEventInfo title(String title)
  {
    this.title = title;
    return this;
  }
  

        /**
         * Datetime of starting an event
         */
        public String startTime;
  public GlipEventInfo startTime(String startTime)
  {
    this.startTime = startTime;
    return this;
  }
  

        /**
         * Datetime of ending an event
         */
        public String endTime;
  public GlipEventInfo endTime(String endTime)
  {
    this.endTime = endTime;
    return this;
  }
  

        /**
         * Indicates whether an event has some specific time slot or lasts for the whole day(s)
         */
        public Boolean allDay;
  public GlipEventInfo allDay(Boolean allDay)
  {
    this.allDay = allDay;
    return this;
  }
  

        /**
         * Event recurrence settings
         * Enum: None, Day, Weekday, Week, Month, Year
         */
        public String recurrence;
  public GlipEventInfo recurrence(String recurrence)
  {
    this.recurrence = recurrence;
    return this;
  }
  

        /**
         * Condition of ending
         */
        public String endingCondition;
  public GlipEventInfo endingCondition(String endingCondition)
  {
    this.endingCondition = endingCondition;
    return this;
  }
  

        /**
         * Count of iterations. For periodic events only
         */
        public Long endingAfter;
  public GlipEventInfo endingAfter(Long endingAfter)
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
  public GlipEventInfo endingOn(String endingOn)
  {
    this.endingOn = endingOn;
    return this;
  }
  

        /**
         * Color of Event title (including its presentation in Calendar)
         * Default: Black
         * Enum: Black, Red, Orange, Yellow, Green, Blue, Purple, Magenta
         */
        public String color;
  public GlipEventInfo color(String color)
  {
    this.color = color;
    return this;
  }
  

        /**
         * Event location
         */
        public String location;
  public GlipEventInfo location(String location)
  {
    this.location = location;
    return this;
  }
  

        /**
         * Event details
         */
        public String description;
  public GlipEventInfo description(String description)
  {
    this.description = description;
    return this;
  }
  
}
