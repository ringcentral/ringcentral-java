package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyBusinessHoursScheduleInfo
{
    //
    public WeeklyScheduleInfo weeklyRanges;
    public CompanyBusinessHoursScheduleInfo weeklyRanges(WeeklyScheduleInfo weeklyRanges) {
        this.weeklyRanges = weeklyRanges;
        return this;
    }
}
