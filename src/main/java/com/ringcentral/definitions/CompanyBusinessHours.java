package com.ringcentral.definitions;


public class CompanyBusinessHours
{
    /**
         * Canonical URI of a business-hours resource
         */
        public String uri;
  public CompanyBusinessHours uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public CompanyBusinessHoursScheduleInfo schedule;
  public CompanyBusinessHours schedule(CompanyBusinessHoursScheduleInfo schedule)
  {
    this.schedule = schedule;
    return this;
  }
  
}
