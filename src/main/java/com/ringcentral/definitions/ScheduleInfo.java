package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ScheduleInfo
{
    // Weekly schedule
    public WeeklyScheduleInfo weeklyRanges;
    public ScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
    // Specific data ranges
    public RangesInfo ranges;
    public ScheduleInfo ranges(RangesInfo ranges) {
        this.ranges = ranges;
        return this;
    }
    // The user's schedule specified for business hours or after hours; it can also be set/retrieved calling the corresponding method
    public String ref;
    public ScheduleInfo ref(String ref) {
        this.ref = ref;
        return this;
    }
}
