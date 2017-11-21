package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserBusinessHoursUpdateRequest
{
    // Schedule when an answering rule is applied
    public WeeklyScheduleInfo schedule;
    public UserBusinessHoursUpdateRequest schedule(WeeklyScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
}
