package com.ringcentral.definitions;


    /**
* Schedule when an answering rule is applied
*/
public class ScheduleInfoUserBusinessHours
{
    /**
     */
    public WeeklyScheduleInfo weeklyRanges;
    public ScheduleInfoUserBusinessHours weeklyRanges(WeeklyScheduleInfo weeklyRanges)
    {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
}