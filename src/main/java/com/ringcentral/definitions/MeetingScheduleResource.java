package com.ringcentral.definitions;


/**
 * Timing of a meeting
 */
public class MeetingScheduleResource {
    /**
     * Format: date-time
     */
    public String startTime;
    /**
     * Format: int32
     */
    public Long durationInMinutes;
    /**
     *
     */
    public MeetingsTimezoneResource timeZone;

    public MeetingScheduleResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public MeetingScheduleResource durationInMinutes(Long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        return this;
    }

    public MeetingScheduleResource timeZone(MeetingsTimezoneResource timeZone) {
        this.timeZone = timeZone;
        return this;
    }
}
