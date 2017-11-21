package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetUserBusinessHoursResponse
{
    // Canonical URI of a business-hours resource
    public String uri;
    public GetUserBusinessHoursResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Schedule when an answering rule is applied
    public ScheduleInfoUserBusinessHours schedule;
    public GetUserBusinessHoursResponse schedule(ScheduleInfoUserBusinessHours schedule) {
        this.schedule = schedule;
        return this;
    }
}
