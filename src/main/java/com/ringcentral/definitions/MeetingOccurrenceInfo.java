package com.ringcentral.definitions;


public class MeetingOccurrenceInfo {
    /**
     * Identifier of a meeting occurrence
     */
    public String id;
    /**
     * Starting time of a meeting occurrence
     */
    public String startTime;
    /**
     * Duration of a meeting occurrence
     */
    public Long durationInMinutes;
    /**
     * Status of a meeting occurrence
     */
    public String status;

    public MeetingOccurrenceInfo id(String id) {
        this.id = id;
        return this;
    }

    public MeetingOccurrenceInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public MeetingOccurrenceInfo durationInMinutes(Long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        return this;
    }

    public MeetingOccurrenceInfo status(String status) {
        this.status = status;
        return this;
    }

}
