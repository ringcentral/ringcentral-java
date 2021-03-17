package com.ringcentral.definitions;


public class ReplyWithPattern
{
    /**
         * Predefined reply pattern name.
         * Enum: WillCallYouBack, CallMeBack, OnMyWay, OnTheOtherLine, WillCallYouBackLater, CallMeBackLater, InAMeeting, OnTheOtherLineNoCall
         */
        public String pattern;
  public ReplyWithPattern pattern(String pattern)
  {
    this.pattern = pattern;
    return this;
  }
  

        /**
         * Number of time units. Applicable only to WillCallYouBack, CallMeBack patterns.
         */
        public Long time;
  public ReplyWithPattern time(Long time)
  {
    this.time = time;
    return this;
  }
  

        /**
         * Time unit name.
         * Enum: Minute, Hour, Day
         */
        public String timeUnit;
  public ReplyWithPattern timeUnit(String timeUnit)
  {
    this.timeUnit = timeUnit;
    return this;
  }
  
}
