package com.ringcentral.definitions;

public class ScheduleInfo {
    // Weekly schedule
    public WeeklyScheduleInfo weeklyRanges;
    // Specific data ranges
    public RangesInfo ranges;
    // The user's schedule specified for business hours or after hours; it can also be set/retrieved calling the corresponding method
    public String ref;
}
