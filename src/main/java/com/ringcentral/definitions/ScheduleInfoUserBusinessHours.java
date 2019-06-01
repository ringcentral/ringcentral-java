package com.ringcentral.definitions;


public class ScheduleInfoUserBusinessHours {
    /**
     * Weekly schedule
     */
    public WeeklyScheduleInfo weeklyRanges;

    public ScheduleInfoUserBusinessHours weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }

}
