package com.ringcentral.definitions;


public class MeetingInfo {
    /**
     * Unique identifier of a meeting instance
     */
    public String uuid;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String topic;
    /**
     * Format: date-time
     */
    public String startTime;

    public MeetingInfo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public MeetingInfo id(String id) {
        this.id = id;
        return this;
    }

    public MeetingInfo topic(String topic) {
        this.topic = topic;
        return this;
    }

    public MeetingInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
}
