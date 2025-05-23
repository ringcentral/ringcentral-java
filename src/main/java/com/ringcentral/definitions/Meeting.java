package com.ringcentral.definitions;


/**
 * Meeting information
 */
public class Meeting {
    /**
     * Meeting id
     * Required
     */
    public String id;
    /**
     * Short bridge id
     * Required
     */
    public String shortId;
    /**
     * Bridge id
     * Required
     */
    public String bridgeId;
    /**
     * Start time ISO 8601
     * Required
     * Format: date-time
     */
    public String startTime;
    /**
     * Meeting name
     * Required
     */
    public String displayName;
    /**
     * Required
     */
    public Host hostInfo;
    /**
     * Meeting duration in seconds
     * Format: int32
     * Example: 36
     */
    public Long duration;
    /**
     * Meeting type
     * Required
     * Enum: Meeting, Call
     */
    public String type;
    /**
     * Meeting status
     * Required
     * Enum: InProgress, Done
     */
    public String status;
    /**
     * Describe access rights which has participants to meeting
     * Required
     * Enum: delete, download, share
     */
    public String[] rights;
    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about this meeting
     */
    public String longSummary;
    /**
     * During meeting AI team analyze code and after meeting finished generates text summary about this meeting
     */
    public String shortSummary;
    /**
     * During meeting AI team analyze code and after meeting finished generates key words used in meeting
     */
    public String[] keywords;
    /**
     * List of the participants in the meeting
     * Required
     */
    public Participant[] participants;
    /**
     * Recording information
     * Required
     */
    public Recording[] recordings;
    /**
     * Chat location
     */
    public String chatUrl;

    public Meeting id(String id) {
        this.id = id;
        return this;
    }

    public Meeting shortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public Meeting bridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    public Meeting startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public Meeting displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public Meeting hostInfo(Host hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public Meeting duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Meeting type(String type) {
        this.type = type;
        return this;
    }

    public Meeting status(String status) {
        this.status = status;
        return this;
    }

    public Meeting rights(String[] rights) {
        this.rights = rights;
        return this;
    }

    public Meeting longSummary(String longSummary) {
        this.longSummary = longSummary;
        return this;
    }

    public Meeting shortSummary(String shortSummary) {
        this.shortSummary = shortSummary;
        return this;
    }

    public Meeting keywords(String[] keywords) {
        this.keywords = keywords;
        return this;
    }

    public Meeting participants(Participant[] participants) {
        this.participants = participants;
        return this;
    }

    public Meeting recordings(Recording[] recordings) {
        this.recordings = recordings;
        return this;
    }

    public Meeting chatUrl(String chatUrl) {
        this.chatUrl = chatUrl;
        return this;
    }
}
