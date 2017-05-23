package com.ringcentral.definitions;

public class BusinessHour_ScheduleInfo {
    // Weekly schedule
    public WeeklyScheduleInfo weeklyRanges;

    public BusinessHour_ScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
}
