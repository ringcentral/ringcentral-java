package com.ringcentral.definitions;


public class CompanyBusinessHoursUpdateRequest
{
    /**
     */
    public CompanyBusinessHoursScheduleInfo schedule;
    public CompanyBusinessHoursUpdateRequest schedule(CompanyBusinessHoursScheduleInfo schedule)
    {
        this.schedule = schedule;
        return this;
    }
}