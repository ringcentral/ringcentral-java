package com.ringcentral.definitions;


public class GlipEventCreate
{
    /**
         * Internal identifier of an event
         */
        public String id;
  public GlipEventCreate id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Internal identifier of a person created an event
         */
        public String creatorId;
  public GlipEventCreate creatorId(String creatorId)
  {
    this.creatorId = creatorId;
    return this;
  }
  

        /**
         * Event title
         * Required
         */
        public String title;
  public GlipEventCreate title(String title)
  {
    this.title = title;
    return this;
  }
  

        /**
         * Datetime of starting an event
         * Required
         */
        public String startTime;
  public GlipEventCreate startTime(String startTime)
  {
    this.startTime = startTime;
    return this;
  }
  

        /**
         * Datetime of ending an event
         * Required
         */
        public String endTime;
  public GlipEventCreate endTime(String endTime)
  {
    this.endTime = endTime;
    return this;
  }
  

        /**
         * Indicates whether event has some specific time slot or lasts for whole day(s)
         */
        public Boolean allDay;
  public GlipEventCreate allDay(Boolean allDay)
  {
    this.allDay = allDay;
    return this;
  }
  

        /**
         * Event recurrence settings. For non-periodic events the value is 'None'. Must be greater or equal to event duration: 1- Day/Weekday; 7 - Week; 28 - Month; 365 - Year
         * Enum: None, Day, Weekday, Week, Month, Year
         */
        public String recurrence;
  public GlipEventCreate recurrence(String recurrence)
  {
    this.recurrence = recurrence;
    return this;
  }
  

        /**
         * Condition of ending
         */
        public String endingCondition;
  public GlipEventCreate endingCondition(String endingCondition)
  {
    this.endingCondition = endingCondition;
    return this;
  }
  

        /**
         * Count of iterations. For periodic events only. Value range is 1 - 10. Must be specified if 'endingCondition' is 'Count'
         */
        public Long endingAfter;
  public GlipEventCreate endingAfter(Long endingAfter)
  {
    this.endingAfter = endingAfter;
    return this;
  }
  

        /**
         * Iterations end datetime for periodic events.
         * Default: None
         * Enum: None, Count, Date
         */
        public String endingOn;
  public GlipEventCreate endingOn(String endingOn)
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
  public GlipEventCreate color(String color)
  {
    this.color = color;
    return this;
  }
  

        /**
         * Event location
         */
        public String location;
  public GlipEventCreate location(String location)
  {
    this.location = location;
    return this;
  }
  

        /**
         * Event details
         */
        public String description;
  public GlipEventCreate description(String description)
  {
    this.description = description;
    return this;
  }
  
}
