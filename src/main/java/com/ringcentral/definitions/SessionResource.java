package com.ringcentral.definitions;


public class SessionResource {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
    /**
     * Object creation time
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Object last modification time
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;
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
    /**
     * The RCV bridge id
     * Example: 839874770
     */
    public String videoBridgeId;
    /**
     *
     */
    public RecordingExtendedModel recording;
    /**
     * The list of livestreams configured for the session
     */
    public SessionLivestreamMinimalModel[] livestreams;

    public SessionResource id(String id) {
        this.id = id;
        return this;
    }

    public SessionResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public SessionResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public SessionResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public SessionResource endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public SessionResource duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public SessionResource title(String title) {
        this.title = title;
        return this;
    }

    public SessionResource description(String description) {
        this.description = description;
        return this;
    }

    public SessionResource scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    public SessionResource scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    public SessionResource timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public SessionResource panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    public SessionResource broadcastingStartTime(String broadcastingStartTime) {
        this.broadcastingStartTime = broadcastingStartTime;
        return this;
    }

    public SessionResource broadcastingEndTime(String broadcastingEndTime) {
        this.broadcastingEndTime = broadcastingEndTime;
        return this;
    }

    public SessionResource status(String status) {
        this.status = status;
        return this;
    }

    public SessionResource runtimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
        return this;
    }

    public SessionResource participantCount(Long participantCount) {
        this.participantCount = participantCount;
        return this;
    }

    public SessionResource attendeeCount(Long attendeeCount) {
        this.attendeeCount = attendeeCount;
        return this;
    }

    public SessionResource uniqueParticipantCount(Long uniqueParticipantCount) {
        this.uniqueParticipantCount = uniqueParticipantCount;
        return this;
    }

    public SessionResource uniqueAttendeeCount(Long uniqueAttendeeCount) {
        this.uniqueAttendeeCount = uniqueAttendeeCount;
        return this;
    }

    public SessionResource videoBridgeId(String videoBridgeId) {
        this.videoBridgeId = videoBridgeId;
        return this;
    }

    public SessionResource recording(RecordingExtendedModel recording) {
        this.recording = recording;
        return this;
    }

    public SessionResource livestreams(SessionLivestreamMinimalModel[] livestreams) {
        this.livestreams = livestreams;
        return this;
    }
}
