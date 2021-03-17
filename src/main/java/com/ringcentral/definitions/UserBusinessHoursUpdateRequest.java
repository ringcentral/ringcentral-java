package com.ringcentral.definitions;


public class UserBusinessHoursUpdateRequest
{
    /**
         */
        public UserBusinessHoursScheduleInfo schedule;
  public UserBusinessHoursUpdateRequest schedule(UserBusinessHoursScheduleInfo schedule)
  {
    this.schedule = schedule;
    return this;
  }
  
}
