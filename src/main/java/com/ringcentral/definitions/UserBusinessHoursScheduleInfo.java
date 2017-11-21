package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserBusinessHoursScheduleInfo
{
    // Weekly schedule
    public WeeklyScheduleInfo weeklyRanges;
    public UserBusinessHoursScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
}
