package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyBusinessHours
{
    // Canonical URI of a business-hours resource
    public String uri;
    public CompanyBusinessHours uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Schedule when an answering rule is applied
    public CompanyBusinessHoursScheduleInfo schedule;
    public CompanyBusinessHours schedule(CompanyBusinessHoursScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
}
