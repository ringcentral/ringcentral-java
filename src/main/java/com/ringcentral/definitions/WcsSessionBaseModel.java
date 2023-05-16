package com.ringcentral.definitions;


public class WcsSessionBaseModel {
    /**
     * Session scheduled start time.
     * Required
     * Format: date-time
     */
    public String scheduledStartTime;
    /**
     * The duration of the Session in seconds.
     * Required
     * Maximum: 43200
     * Minimum: 30
     * Format: int32
     * Example: 1800
     */
    public Long scheduledDuration;
    /**
     * IANA-compatible time zone name (see https://www.iana.org/time-zones).
     * Required
     * Example: America/New_York
     */
    public String timeZone;
    /**
     * Session locale code. Can&#039;t be blank or null
     * Example: en-US
     */
    public String localeCode;
    /**
     * The time offset (positive, in seconds) indicating how much in advance
     * (comparing to &quot;scheduledStartTime&quot;) panel members should join for the pre-webinar team sync
     * Format: int32
     * Example: 900
     */
    public Long panelJoinTimeOffset;
    /**
     * Session title. Can be left blank - then Webinar title should be used for presentation.
     * Example: Live Broadcasting US
     */
    public String title;
    /**
     * User-friendly description of the Session. Can be left blank - then Webinar title should be used for presentation.
     * Example: Live session for US-based participants
     */
    public String description;
    /**
     * Session status (for the purposes of Configuration service)
     * Example: Scheduled
     * Enum: Scheduled, Active, Finished
     */
    public String status;
    /**
     * The URI to join the webinar as a host
     * Format: uri
     * Example: https://v.ringcentral.com/w/join/de7yd8ew7yfsdfjh899843rgj
     */
    public String hostJoinUri;

    public WcsSessionBaseModel scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    public WcsSessionBaseModel scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    public WcsSessionBaseModel timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public WcsSessionBaseModel localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    public WcsSessionBaseModel panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    public WcsSessionBaseModel title(String title) {
        this.title = title;
        return this;
    }

    public WcsSessionBaseModel description(String description) {
        this.description = description;
        return this;
    }

    public WcsSessionBaseModel status(String status) {
        this.status = status;
        return this;
    }

    public WcsSessionBaseModel hostJoinUri(String hostJoinUri) {
        this.hostJoinUri = hostJoinUri;
        return this;
    }
}
