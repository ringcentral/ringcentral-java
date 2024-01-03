package com.ringcentral.definitions;


public class WcsSessionResource {
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
     * Required
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
    /**
     * The RCV bridge id
     * Example: 839874770
     */
    public String videoBridgeId;
    /**
     * The RCV bridge password. Returned only if requested by Host/Co-host/Panelist and a password for the bridge is set.
     * Format: password
     * Example: abc123
     */
    public String videoBridgePassword;
    /**
     * The RCV bridge PSTN password. Returned only if requested by Host/Co-host/Panelist and a PSTN password for the bridge is set.
     * Format: password
     * Example: abc123
     */
    public String videoBridgePstnPassword;
    /**
     * The URI for attendees to join the Webinar (if it is a public webinar)
     * Format: uri
     * Example: https://v.ringcentral.com/w/a/join/iuyef77fsj473wn10ashjfk34
     */
    public String attendeeJoinUri;
    /**
     * Calculated attribute indicating if there are any unsent/deferred invites to session participants
     */
    public Boolean hasUnsentInvites;

    public WcsSessionResource id(String id) {
        this.id = id;
        return this;
    }

    public WcsSessionResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public WcsSessionResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public WcsSessionResource scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    public WcsSessionResource scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    public WcsSessionResource timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public WcsSessionResource localizedTimeZoneDescription(String localizedTimeZoneDescription) {
        this.localizedTimeZoneDescription = localizedTimeZoneDescription;
        return this;
    }

    public WcsSessionResource panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    public WcsSessionResource title(String title) {
        this.title = title;
        return this;
    }

    public WcsSessionResource description(String description) {
        this.description = description;
        return this;
    }

    public WcsSessionResource status(String status) {
        this.status = status;
        return this;
    }

    public WcsSessionResource hostJoinUri(String hostJoinUri) {
        this.hostJoinUri = hostJoinUri;
        return this;
    }

    public WcsSessionResource localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    public WcsSessionResource videoBridgeId(String videoBridgeId) {
        this.videoBridgeId = videoBridgeId;
        return this;
    }

    public WcsSessionResource videoBridgePassword(String videoBridgePassword) {
        this.videoBridgePassword = videoBridgePassword;
        return this;
    }

    public WcsSessionResource videoBridgePstnPassword(String videoBridgePstnPassword) {
        this.videoBridgePstnPassword = videoBridgePstnPassword;
        return this;
    }

    public WcsSessionResource attendeeJoinUri(String attendeeJoinUri) {
        this.attendeeJoinUri = attendeeJoinUri;
        return this;
    }

    public WcsSessionResource hasUnsentInvites(Boolean hasUnsentInvites) {
        this.hasUnsentInvites = hasUnsentInvites;
        return this;
    }
}
