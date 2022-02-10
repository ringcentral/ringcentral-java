package com.ringcentral.definitions;


/**
 * Schedule when an answering rule is applied
 */
public class UserBusinessHoursScheduleInfo {
    /**
     *
     */
    public WeeklyScheduleInfo weeklyRanges;

    public UserBusinessHoursScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
}
