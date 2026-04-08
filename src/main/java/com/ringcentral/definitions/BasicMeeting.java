package com.ringcentral.definitions;

/** Meeting information */
public class BasicMeeting {
    /** Meeting id Required */
    public String id;

    public BasicMeeting id(String id) {
        this.id = id;
        return this;
    }

    /** Short bridge id Required */
    public String shortId;

    public BasicMeeting shortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    /** Bridge id */
    public String bridgeId;

    public BasicMeeting bridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    /** Start time ISO 8601 Required Format: date-time */
    public String startTime;

    public BasicMeeting startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** Meeting name Required */
    public String displayName;

    public BasicMeeting displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** Required */
    public Host hostInfo;

    public BasicMeeting hostInfo(Host hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }
}
