package com.ringcentral.definitions;

public class AnsweringRule_ScheduleInfo {
    // Weekly schedule. If specified, ranges cannot be specified
    public WeeklyScheduleInfo weeklyRanges;
    // Specific data ranges. If specified, weeklyRanges cannot be specified
    public RangesInfo ranges;

    public AnsweringRule_ScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }

    public AnsweringRule_ScheduleInfo ranges(RangesInfo ranges) {
        this.ranges = ranges;
        return this;
    }
}
