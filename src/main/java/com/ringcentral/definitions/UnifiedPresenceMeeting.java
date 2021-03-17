package com.ringcentral.definitions;


    // Returned if *Meetings* feature is switched on
public class UnifiedPresenceMeeting
{
    /**
         * Meeting status calculated from all user`s meetings
         * Enum: NoMeeting, InMeeting
         */
        public String status;
  public UnifiedPresenceMeeting status(String status)
  {
    this.status = status;
    return this;
  }
  
}
