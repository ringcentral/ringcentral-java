package com.ringcentral.definitions;

public class WcsSessionResource {
    /** Internal object ID Example: 78654321 */
    public String id;

    public WcsSessionResource id(String id) {
        this.id = id;
        return this;
    }

    /** Object creation time Required Format: date-time */
    public String creationTime;

    public WcsSessionResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Object last modification time Required Format: date-time */
    public String lastModifiedTime;

    public WcsSessionResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Session scheduled start time. Required Format: date-time */
    public String scheduledStartTime;

    public WcsSessionResource scheduledStartTime(String scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
        return this;
    }

    /**
     * The duration of the Session in seconds. Required Maximum: 43200 Minimum: 30 Format: int32
     * Example: 1800
     */
    public Long scheduledDuration;

    public WcsSessionResource scheduledDuration(Long scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
        return this;
    }

    /**
     * IANA-compatible time zone name (see https://www.iana.org/time-zones). Required Example:
     * America/New_York
     */
    public String timeZone;

    public WcsSessionResource timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /** Localized time zone description. Example: Eastern Time (America/New_York) */
    public String localizedTimeZoneDescription;

    public WcsSessionResource localizedTimeZoneDescription(String localizedTimeZoneDescription) {
        this.localizedTimeZoneDescription = localizedTimeZoneDescription;
        return this;
    }

    /**
     * The time offset (positive, in seconds) indicating how much in advance (comparing to
     * &quot;scheduledStartTime&quot;) panel members should join for the pre-webinar team sync
     * Format: int32 Example: 900
     */
    public Long panelJoinTimeOffset;

    public WcsSessionResource panelJoinTimeOffset(Long panelJoinTimeOffset) {
        this.panelJoinTimeOffset = panelJoinTimeOffset;
        return this;
    }

    /**
     * Session title. Can be left blank - then Webinar title should be used for presentation.
     * Example: Live Broadcasting US
     */
    public String title;

    public WcsSessionResource title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Session. Can be left blank - then Webinar title should be
     * used for presentation. Example: Live session for US-based participants
     */
    public String description;

    public WcsSessionResource description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Session status (for the purposes of Configuration service) Example: Scheduled Enum:
     * Scheduled, Active, Finished
     */
    public String status;

    public WcsSessionResource status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The URI to join the webinar as a host Format: uri Example:
     * https://v.ringcentral.com/w/join/de7yd8ew7yfsdfjh899843rgj
     */
    public String hostJoinUri;

    public WcsSessionResource hostJoinUri(String hostJoinUri) {
        this.hostJoinUri = hostJoinUri;
        return this;
    }

    /** Session locale code. Can&#039;t be blank or null Example: en-US */
    public String localeCode;

    public WcsSessionResource localeCode(String localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    /** The RCV bridge id Example: 839874770 */
    public String videoBridgeId;

    public WcsSessionResource videoBridgeId(String videoBridgeId) {
        this.videoBridgeId = videoBridgeId;
        return this;
    }

    /**
     * The RCV bridge password. Returned only if requested by Host/Co-host/Panelist and a password
     * for the bridge is set. Format: password Example: abc123
     */
    public String videoBridgePassword;

    public WcsSessionResource videoBridgePassword(String videoBridgePassword) {
        this.videoBridgePassword = videoBridgePassword;
        return this;
    }

    /**
     * The RCV bridge PSTN password. Returned only if requested by Host/Co-host/Panelist and a PSTN
     * password for the bridge is set. Format: password Example: abc123
     */
    public String videoBridgePstnPassword;

    public WcsSessionResource videoBridgePstnPassword(String videoBridgePstnPassword) {
        this.videoBridgePstnPassword = videoBridgePstnPassword;
        return this;
    }

    /**
     * The URI for attendees to join the Webinar (if it is a public webinar) Format: uri Example:
     * https://v.ringcentral.com/w/a/join/iuyef77fsj473wn10ashjfk34
     */
    public String attendeeJoinUri;

    public WcsSessionResource attendeeJoinUri(String attendeeJoinUri) {
        this.attendeeJoinUri = attendeeJoinUri;
        return this;
    }

    /**
     * Calculated attribute indicating if there are any unsent/deferred invites to session
     * participants
     */
    public Boolean hasUnsentInvites;

    public WcsSessionResource hasUnsentInvites(Boolean hasUnsentInvites) {
        this.hasUnsentInvites = hasUnsentInvites;
        return this;
    }
}
