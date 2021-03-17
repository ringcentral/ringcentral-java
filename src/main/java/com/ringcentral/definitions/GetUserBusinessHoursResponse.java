package com.ringcentral.definitions;


public class GetUserBusinessHoursResponse
{
    /**
         * Canonical URI of a business-hours resource
         */
        public String uri;
  public GetUserBusinessHoursResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public ScheduleInfoUserBusinessHours schedule;
  public GetUserBusinessHoursResponse schedule(ScheduleInfoUserBusinessHours schedule)
  {
    this.schedule = schedule;
    return this;
  }
  
}
