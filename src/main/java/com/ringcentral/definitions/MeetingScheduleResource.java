package com.ringcentral.definitions;


public class MeetingScheduleResource {
    /**
     *
     */
    public String startTime;
    /**
     *
     */
    public Long durationInMinutes;
    /**
     *
     */
    public TimezoneResource timeZone;

    public MeetingScheduleResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public MeetingScheduleResource durationInMinutes(Long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        return this;
    }

    public MeetingScheduleResource timeZone(TimezoneResource timeZone) {
        this.timeZone = timeZone;
        return this;
    }

}
