package com.ringcentral.definitions;


// Schedule when an answering rule should be applied
public class ScheduleInfo {
    /**
     *
     */
    public WeeklyScheduleInfo weeklyRanges;
    /**
     * Specific data ranges
     */
    public RangesInfo[] ranges;
    /**
     * The user&#039;s schedule specified for business hours or after hours; it can also be set/retrieved calling the corresponding method
     * Enum: BusinessHours, AfterHours
     */
    public String ref;

    public ScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }

    public ScheduleInfo ranges(RangesInfo[] ranges) {
        this.ranges = ranges;
        return this;
    }

    public ScheduleInfo ref(String ref) {
        this.ref = ref;
        return this;
    }
}
