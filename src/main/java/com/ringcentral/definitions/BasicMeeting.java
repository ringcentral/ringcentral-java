package com.ringcentral.definitions;


/**
 * Meeting information
 */
public class BasicMeeting {
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

    public BasicMeeting id(String id) {
        this.id = id;
        return this;
    }

    public BasicMeeting shortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public BasicMeeting bridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    public BasicMeeting startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public BasicMeeting displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public BasicMeeting hostInfo(Host hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }
}
