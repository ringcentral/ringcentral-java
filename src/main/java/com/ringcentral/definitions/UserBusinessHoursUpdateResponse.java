package com.ringcentral.definitions;


public class UserBusinessHoursUpdateResponse
{
    /**
     * Canonical URI of a business-hours resource
     */
    public String uri;
    public UserBusinessHoursUpdateResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public UserBusinessHoursScheduleInfo schedule;
    public UserBusinessHoursUpdateResponse schedule(UserBusinessHoursScheduleInfo schedule)
    {
        this.schedule = schedule;
        return this;
    }
}