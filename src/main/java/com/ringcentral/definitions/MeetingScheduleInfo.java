package com.ringcentral.definitions;

public class MeetingScheduleInfo {
    // Start time of a meeting in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String startTime;
    // Duration of a meeting in minutes
    public Long durationInMinutes;
    // Timezone of a meeting
    public MeetingScheduleInfo_TimezoneInfo timeZone;

    public MeetingScheduleInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public MeetingScheduleInfo durationInMinutes(Long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        return this;
    }

    public MeetingScheduleInfo timeZone(MeetingScheduleInfo_TimezoneInfo timeZone) {
        this.timeZone = timeZone;
        return this;
    }
}
