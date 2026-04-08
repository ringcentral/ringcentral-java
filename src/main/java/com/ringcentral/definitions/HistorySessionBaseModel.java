package com.ringcentral.definitions;

public class HistorySessionBaseModel {
    /**
     * Session start time. If a session hasn&#039;t been started this fields should be set to
     * &quot;scheduledStartTime&quot; Format: date-time
     */
    public String startTime;

    public HistorySessionBaseModel startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Session end time. If a session hasn&#039;t been finished this fields should be set to
     * (&quot;startTime&quot;+&quot;scheduledDuration&quot;) Format: date-time
     */
    public String endTime;

    public HistorySessionBaseModel endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Session duration in seconds rounded up (returned if &#039;startTime&#039; and
     * &#039;endTime&#039; are not empty) Format: int32 Example: 3600
     */
    public Long duration;

    public HistorySessionBaseModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /** Session title. If blank - derived from webinar title. Example: Live Broadcasting US */
    public String title;

    public HistorySessionBaseModel title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Session. If blank - derived from webinar title. Example:
     * Live session for US-based participants
     */
    public String description;

    public HistorySessionBaseModel description(String description) {
        this.description = description;
        return this;
    }

    /** Session scheduled start time. Format: date-time */
    public String scheduledStartTime;

    public HistorySessionBaseModel scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    /** The scheduled duration of the Session in seconds. Format: int32 Example: 1800 */
    public Long scheduledDuration;

    public HistorySessionBaseModel scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    /**
     * IANA-compatible time zone name (see https://www.iana.org/time-zones). Example:
     * America/New_York
     */
    public String timeZone;

    public HistorySessionBaseModel timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /** Session locale code. Can&#039;t be blank or null. Example: en-US Default: en-US */
    public String localeCode;

    public HistorySessionBaseModel localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    /**
     * The time offset (positive, in seconds) indicating how much in advance (comparing to
     * &quot;scheduledStartTime&quot;) panel members should join for the pre-webinar team sync
     * Format: int32 Example: 900
     */
    public Long panelJoinTimeOffset;

    public HistorySessionBaseModel panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    /** The time when broadcasting started. Format: date-time */
    public String broadcastingStartTime;

    public HistorySessionBaseModel broadcastingStartTime(String broadcastingStartTime) {
        this.broadcastingStartTime = broadcastingStartTime;
        return this;
    }

    /** The time when broadcasting ended. Format: date-time */
    public String broadcastingEndTime;

    public HistorySessionBaseModel broadcastingEndTime(String broadcastingEndTime) {
        this.broadcastingEndTime = broadcastingEndTime;
        return this;
    }

    /** Webinar session status Example: Finished Enum: Scheduled, Active, Finished */
    public String status;

    public HistorySessionBaseModel status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Session runtime status (for &#039;Active&#039; Sessions only). Please note that
     * &#039;Idle&#039; status shouldn&#039;t be returned in the API (but can be delivered in an
     * event) Example: Live Enum: Idle, Practice, GoingLive, Live, Break, Debrief
     */
    public String runtimeStatus;

    public HistorySessionBaseModel runtimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
        return this;
    }

    /**
     * The number of participants (of all roles) who joined the webinar Format: int32 Example: 150
     */
    public Long participantCount;

    public HistorySessionBaseModel participantCount(Long participantCount) {
        this.participantCount = participantCount;
        return this;
    }

    /** The number of attendees who joined the webinar Format: int32 Example: 145 */
    public Long attendeeCount;

    public HistorySessionBaseModel attendeeCount(Long attendeeCount) {
        this.attendeeCount = attendeeCount;
        return this;
    }

    /**
     * Unique number of participants (of all roles) who joined the webinar Format: int32 Example:
     * 140
     */
    public Long uniqueParticipantCount;

    public HistorySessionBaseModel uniqueParticipantCount(Long uniqueParticipantCount) {
        this.uniqueParticipantCount = uniqueParticipantCount;
        return this;
    }

    /** Unique number of attendees who joined the webinar Format: int32 Example: 135 */
    public Long uniqueAttendeeCount;

    public HistorySessionBaseModel uniqueAttendeeCount(Long uniqueAttendeeCount) {
        this.uniqueAttendeeCount = uniqueAttendeeCount;
        return this;
    }
}
