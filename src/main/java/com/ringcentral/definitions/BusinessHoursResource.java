package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BusinessHoursResource
{
    //
    public String uri;
    public BusinessHoursResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ScheduleResource schedule;
    public BusinessHoursResource schedule(ScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
}
