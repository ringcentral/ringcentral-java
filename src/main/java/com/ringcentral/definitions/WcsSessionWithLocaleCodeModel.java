package com.ringcentral.definitions;


public class WcsSessionWithLocaleCodeModel {
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
     * Localized time zone description.
     * Example: Eastern Time (America/New_York)
     */
    public String localizedTimeZoneDescription;
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
    /**
     * Session locale code. Can&#039;t be blank or null
     * Example: en-US
     */
    public String localeCode;

    public WcsSessionWithLocaleCodeModel scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    public WcsSessionWithLocaleCodeModel scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    public WcsSessionWithLocaleCodeModel timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public WcsSessionWithLocaleCodeModel localizedTimeZoneDescription(String localizedTimeZoneDescription) {
        this.localizedTimeZoneDescription = localizedTimeZoneDescription;
        return this;
    }

    public WcsSessionWithLocaleCodeModel panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    public WcsSessionWithLocaleCodeModel title(String title) {
        this.title = title;
        return this;
    }

    public WcsSessionWithLocaleCodeModel description(String description) {
        this.description = description;
        return this;
    }

    public WcsSessionWithLocaleCodeModel status(String status) {
        this.status = status;
        return this;
    }

    public WcsSessionWithLocaleCodeModel hostJoinUri(String hostJoinUri) {
        this.hostJoinUri = hostJoinUri;
        return this;
    }

    public WcsSessionWithLocaleCodeModel localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }
}
