package com.ringcentral.definitions;


/**
 * Meeting information
 */
public class Meeting {
    /**
     * call id
     * Required
     */
    public String id;
    /**
     * bridge id
     * Required
     */
    public String bridgeId;
    /**
     * short bridge id
     * Required
     */
    public String shortId;
    /**
     * start time ISO 8601
     * Required
     * Format: date-time
     */
    public String startTime;
    /**
     * duration second
     * Format: int32
     * Example: 36
     */
    public Long duration;
    /**
     * meetings name
     * Required
     */
    public String displayName;
    /**
     * meeting type
     * Required
     * Enum: Meeting, Call
     */
    public String type;
    /**
     * meeting status
     * Required
     * Enum: InProgress, Done
     */
    public String status;
    /**
     * Required
     */
    public Host hostInfo;
    /**
     * chat id
     */
    public String chatId;
    /**
     * participants list
     * Required
     */
    public Participant[] participants;
    /**
     * recording information
     */
    public Recording[] recordings;
    /**
     * chat location
     */
    public String chatUrl;

    public Meeting id(String id) {
        this.id = id;
        return this;
    }

    public Meeting bridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    public Meeting shortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public Meeting startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public Meeting duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public Meeting displayName(String displayName) {
        this.displayName = displayName;
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

    public Meeting hostInfo(Host hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public Meeting chatId(String chatId) {
        this.chatId = chatId;
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
