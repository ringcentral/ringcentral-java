package com.ringcentral.definitions;


/**
 * Meeting information
 */
public class AdminAccessMeeting {
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
     * Required
     * Format: int32
     * Example: 36
     */
    public Long duration;
    /**
     * List of the participants in the meeting
     * Required
     */
    public BasicParticipant[] participants;
    /**
     * Public chat txt file for the meeting
     */
    public String chatContentUri;

    public AdminAccessMeeting id(String id) {
        this.id = id;
        return this;
    }

    public AdminAccessMeeting shortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public AdminAccessMeeting bridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    public AdminAccessMeeting startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public AdminAccessMeeting displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public AdminAccessMeeting hostInfo(Host hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public AdminAccessMeeting duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public AdminAccessMeeting participants(BasicParticipant[] participants) {
        this.participants = participants;
        return this;
    }

    public AdminAccessMeeting chatContentUri(String chatContentUri) {
        this.chatContentUri = chatContentUri;
        return this;
    }
}
