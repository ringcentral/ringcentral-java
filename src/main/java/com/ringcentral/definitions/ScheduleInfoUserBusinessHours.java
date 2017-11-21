package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ScheduleInfoUserBusinessHours
{
    // Weekly schedule
    public WeeklyScheduleInfo weeklyRanges;
    public ScheduleInfoUserBusinessHours weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
}
