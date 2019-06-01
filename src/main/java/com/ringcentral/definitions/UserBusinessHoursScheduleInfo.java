package com.ringcentral.definitions;


public class UserBusinessHoursScheduleInfo {
    /**
     * Weekly schedule
     */
    public WeeklyScheduleInfo weeklyRanges;

    public UserBusinessHoursScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }

}
