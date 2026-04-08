package com.ringcentral.definitions;

public class SessionGlobalResource {
    /** Internal object ID Example: 78654321 */
    public String id;

    public SessionGlobalResource id(String id) {
        this.id = id;
        return this;
    }

    /** Object creation time Required Format: date-time */
    public String creationTime;

    public SessionGlobalResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Object last modification time Required Format: date-time */
    public String lastModifiedTime;

    public SessionGlobalResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Required */
    public WebinarRefModel webinar;

    public SessionGlobalResource webinar(WebinarRefModel webinar) {
        this.webinar = webinar;
        return this;
    }

    /**
     * Session start time. If a session hasn&#039;t been started this fields should be set to
     * &quot;scheduledStartTime&quot; Format: date-time
     */
    public String startTime;

    public SessionGlobalResource startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Session end time. If a session hasn&#039;t been finished this fields should be set to
     * (&quot;startTime&quot;+&quot;scheduledDuration&quot;) Format: date-time
     */
    public String endTime;

    public SessionGlobalResource endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Session duration in seconds rounded up (returned if &#039;startTime&#039; and
     * &#039;endTime&#039; are not empty) Format: int32 Example: 3600
     */
    public Long duration;

    public SessionGlobalResource duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /** Session title. If blank - derived from webinar title. Example: Live Broadcasting US */
    public String title;

    public SessionGlobalResource title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Session. If blank - derived from webinar title. Example:
     * Live session for US-based participants
     */
    public String description;

    public SessionGlobalResource description(String description) {
        this.description = description;
        return this;
    }

    /** Session scheduled start time. Format: date-time */
    public String scheduledStartTime;

    public SessionGlobalResource scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    /** The scheduled duration of the Session in seconds. Format: int32 Example: 1800 */
    public Long scheduledDuration;

    public SessionGlobalResource scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    /**
     * IANA-compatible time zone name (see https://www.iana.org/time-zones). Example:
     * America/New_York
     */
    public String timeZone;

    public SessionGlobalResource timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /** Session locale code. Can&#039;t be blank or null. Example: en-US Default: en-US */
    public String localeCode;

    public SessionGlobalResource localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    /**
     * The time offset (positive, in seconds) indicating how much in advance (comparing to
     * &quot;scheduledStartTime&quot;) panel members should join for the pre-webinar team sync
     * Format: int32 Example: 900
     */
    public Long panelJoinTimeOffset;

    public SessionGlobalResource panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    /** The time when broadcasting started. Format: date-time */
    public String broadcastingStartTime;

    public SessionGlobalResource broadcastingStartTime(String broadcastingStartTime) {
        this.broadcastingStartTime = broadcastingStartTime;
        return this;
    }

    /** The time when broadcasting ended. Format: date-time */
    public String broadcastingEndTime;

    public SessionGlobalResource broadcastingEndTime(String broadcastingEndTime) {
        this.broadcastingEndTime = broadcastingEndTime;
        return this;
    }

    /** Webinar session status Example: Finished Enum: Scheduled, Active, Finished */
    public String status;

    public SessionGlobalResource status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Session runtime status (for &#039;Active&#039; Sessions only). Please note that
     * &#039;Idle&#039; status shouldn&#039;t be returned in the API (but can be delivered in an
     * event) Example: Live Enum: Idle, Practice, GoingLive, Live, Break, Debrief
     */
    public String runtimeStatus;

    public SessionGlobalResource runtimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
        return this;
    }

    /**
     * The number of participants (of all roles) who joined the webinar Format: int32 Example: 150
     */
    public Long participantCount;

    public SessionGlobalResource participantCount(Long participantCount) {
        this.participantCount = participantCount;
        return this;
    }

    /** The number of attendees who joined the webinar Format: int32 Example: 145 */
    public Long attendeeCount;

    public SessionGlobalResource attendeeCount(Long attendeeCount) {
        this.attendeeCount = attendeeCount;
        return this;
    }

    /**
     * Unique number of participants (of all roles) who joined the webinar Format: int32 Example:
     * 140
     */
    public Long uniqueParticipantCount;

    public SessionGlobalResource uniqueParticipantCount(Long uniqueParticipantCount) {
        this.uniqueParticipantCount = uniqueParticipantCount;
        return this;
    }

    /** Unique number of attendees who joined the webinar Format: int32 Example: 135 */
    public Long uniqueAttendeeCount;

    public SessionGlobalResource uniqueAttendeeCount(Long uniqueAttendeeCount) {
        this.uniqueAttendeeCount = uniqueAttendeeCount;
        return this;
    }

    /** The RCV bridge id Example: 839874770 */
    public String videoBridgeId;

    public SessionGlobalResource videoBridgeId(String videoBridgeId) {
        this.videoBridgeId = videoBridgeId;
        return this;
    }

    /** */
    public RecordingModel recording;

    public SessionGlobalResource recording(RecordingModel recording) {
        this.recording = recording;
        return this;
    }

    /** The list of livestreams configured for the session */
    public SessionLivestreamMinimalModel[] livestreams;

    public SessionGlobalResource livestreams(SessionLivestreamMinimalModel[] livestreams) {
        this.livestreams = livestreams;
        return this;
    }
}
