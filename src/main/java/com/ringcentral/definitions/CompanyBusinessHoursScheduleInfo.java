package com.ringcentral.definitions;


public class CompanyBusinessHoursScheduleInfo {
    /**
     *
     */
    public WeeklyScheduleInfo weeklyRanges;

    public CompanyBusinessHoursScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }

}
