package com.ringcentral.definitions;


// Schedule when an answering rule is applied
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
