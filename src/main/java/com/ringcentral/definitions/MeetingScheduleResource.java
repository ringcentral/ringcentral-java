package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MeetingScheduleResource
{
    //
    public String startTime;
    public MeetingScheduleResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    //
    public Long durationInMinutes;
    public MeetingScheduleResource durationInMinutes(Long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        return this;
    }
    //
    public TimezoneResource timeZone;
    public MeetingScheduleResource timeZone(TimezoneResource timeZone) {
        this.timeZone = timeZone;
        return this;
    }
}
