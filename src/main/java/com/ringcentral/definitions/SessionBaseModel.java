package com.ringcentral.definitions;


public class SessionBaseModel {
    /**
     * Session start time. If a session hasn&#039;t been started this fields should be set to &quot;scheduledStartTime&quot;
     * Format: date-time
     */
    public String startTime;
    /**
     * Session end time. If a session hasn&#039;t been finished this fields should be set to (&quot;startTime&quot;+&quot;scheduledDuration&quot;)
     * Format: date-time
     */
    public String endTime;
    /**
     * Session duration in seconds rounded up (returned if &#039;startTime&#039; and &#039;endTime&#039; are not empty)
     * Format: int32
     * Example: 3600
     */
    public Long duration;
    /**
     * Session title. If blank - derived from webinar title.
     * Example: Live Broadcasting US
     */
    public String title;
    /**
     * User-friendly description of the Session. If blank - derived from webinar title.
     * Example: Live session for US-based participants
     */
    public String description;
    /**
     * Session scheduled start time.
     * Format: date-time
     */
    public String scheduledStartTime;
    /**
     * The scheduled duration of the Session in seconds.
     * Format: int32
     * Example: 1800
     */
    public Long scheduledDuration;
    /**
     * IANA-compatible time zone name (see https://www.iana.org/time-zones).
     * Example: America/New_York
     */
    public String timeZone;
    /**
     * The time offset (positive, in seconds) indicating how much in advance
     * (comparing to &quot;scheduledStartTime&quot;) panel members should join for the pre-webinar team sync
     * Format: int32
     * Example: 900
     */
    public Long panelJoinTimeOffset;
    /**
     * The time when broadcasting started.
     * Format: date-time
     */
    public String broadcastingStartTime;
    /**
     * The time when broadcasting ended.
     * Format: date-time
     */
    public String broadcastingEndTime;
    /**
     * Session status from Configuration service
     * Example: Finished
     * Enum: Scheduled, Active, Finished
     */
    public String status;
    /**
     * Session runtime status (for &#039;Active&#039; Sessions only).
     * It is omitted (or null) if the status is not Active
     * Enum: Idle, Practice, GoingLive, Live, Break, Debrief
     */
    public String runtimeStatus;
    /**
     * The number of participants (of all roles) who joined the webinar
     * Format: int32
     * Example: 150
     */
    public Long participantCount;
    /**
     * The number of attendees who joined the webinar
     * Format: int32
     * Example: 145
     */
    public Long attendeeCount;
    /**
     * Unique number of participants (of all roles) who joined the webinar
     * Format: int32
     * Example: 140
     */
    public Long uniqueParticipantCount;
    /**
     * Unique number of attendees who joined the webinar
     * Format: int32
     * Example: 135
     */
    public Long uniqueAttendeeCount;

    public SessionBaseModel startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public SessionBaseModel endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public SessionBaseModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public SessionBaseModel title(String title) {
        this.title = title;
        return this;
    }

    public SessionBaseModel description(String description) {
        this.description = description;
        return this;
    }

    public SessionBaseModel scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    public SessionBaseModel scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    public SessionBaseModel timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public SessionBaseModel panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    public SessionBaseModel broadcastingStartTime(String broadcastingStartTime) {
        this.broadcastingStartTime = broadcastingStartTime;
        return this;
    }

    public SessionBaseModel broadcastingEndTime(String broadcastingEndTime) {
        this.broadcastingEndTime = broadcastingEndTime;
        return this;
    }

    public SessionBaseModel status(String status) {
        this.status = status;
        return this;
    }

    public SessionBaseModel runtimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
        return this;
    }

    public SessionBaseModel participantCount(Long participantCount) {
        this.participantCount = participantCount;
        return this;
    }

    public SessionBaseModel attendeeCount(Long attendeeCount) {
        this.attendeeCount = attendeeCount;
        return this;
    }

    public SessionBaseModel uniqueParticipantCount(Long uniqueParticipantCount) {
        this.uniqueParticipantCount = uniqueParticipantCount;
        return this;
    }

    public SessionBaseModel uniqueAttendeeCount(Long uniqueAttendeeCount) {
        this.uniqueAttendeeCount = uniqueAttendeeCount;
        return this;
    }
}
