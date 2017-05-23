package com.ringcentral.definitions;

public class AnsweringRule_ScheduleInfo {
    // Weekly schedule. If specified, ranges cannot be specified
    public WeeklyScheduleInfo weeklyRanges;
    // Specific data ranges. If specified, weeklyRanges cannot be specified
    public RangesInfo ranges;
}
