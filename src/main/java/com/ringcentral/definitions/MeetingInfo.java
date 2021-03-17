package com.ringcentral.definitions;


public class MeetingInfo
{
    /**
         * Unique identifier of a meeting instance
         */
        public String uuid;
  public MeetingInfo uuid(String uuid)
  {
    this.uuid = uuid;
    return this;
  }
  

        /**
         */
        public String id;
  public MeetingInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public String topic;
  public MeetingInfo topic(String topic)
  {
    this.topic = topic;
    return this;
  }
  

        /**
         */
        public String startTime;
  public MeetingInfo startTime(String startTime)
  {
    this.startTime = startTime;
    return this;
  }
  
}
