package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserBusinessHoursUpdate
{
    // Canonical URI of a business-hours resource
    public String uri;
    public UserBusinessHoursUpdate uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Schedule when an answering rule is applied
    public UserBusinessHoursScheduleInfo schedule;
    public UserBusinessHoursUpdate schedule(UserBusinessHoursScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
}
