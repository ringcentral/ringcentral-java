package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyBusinessHoursUpdateRequest
{
    // Schedule when an answering rule is applied
    public CompanyBusinessHoursScheduleInfo schedule;
    public CompanyBusinessHoursUpdateRequest schedule(CompanyBusinessHoursScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
}
