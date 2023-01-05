package com.ringcentral.definitions;


public class MeetingOccurrenceInfo
{
    /**
     * Identifier of a meeting occurrence
     */
    public String id;
    public MeetingOccurrenceInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Starting time of a meeting occurrence
     * Format: date-time
     */
    public String startTime;
    public MeetingOccurrenceInfo startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Duration of a meeting occurrence
     * Format: int64
     */
    public Long durationInMinutes;
    public MeetingOccurrenceInfo durationInMinutes(Long durationInMinutes)
    {
        this.durationInMinutes = durationInMinutes;
        return this;
    }

    /**
     * Status of a meeting occurrence
     */
    public String status;
    public MeetingOccurrenceInfo status(String status)
    {
        this.status = status;
        return this;
    }
}