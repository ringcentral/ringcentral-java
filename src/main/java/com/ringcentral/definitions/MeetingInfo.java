package com.ringcentral.definitions;


public class MeetingInfo {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String topic;
    /**
     *
     */
    public String startTime;

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
