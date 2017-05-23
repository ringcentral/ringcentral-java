package com.ringcentral.definitions;

public class MeetingInfo {
    // Canonical URI of a meeting resource
    public String uri;
    // Internal identifier of a meeting as retrieved from Zoom
    public String id;
    // Topic of a meeting
    public String topic;
    // Type of a meeting
    public String meetingType;
    // Password required to join a meeting
    public String password;
    // Current status of a meeting
    public String status;
    // Links to start/join the meeting
    public LinksInfo links;
    // Schedule of a meeting
    public MeetingScheduleInfo schedule;
    // If 'True' then the meeting can be joined and started by any participant (not host only). Supported for the meetings of 'Scheduled' and 'Recurring' type.
    public Boolean allowJoinBeforeHost;
    // Enables starting video when host joins the meeting
    public Boolean startHostVideo;
    // Enables starting video when participants join the meeting
    public Boolean startParticipantsVideo;
    // Meeting audio options. Possible values are 'Phone', 'ComputerAudio'
    public String[] audioOptions;

    public MeetingInfo uri(String uri) {
        this.uri = uri;
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

    public MeetingInfo meetingType(String meetingType) {
        this.meetingType = meetingType;
        return this;
    }

    public MeetingInfo password(String password) {
        this.password = password;
        return this;
    }

    public MeetingInfo status(String status) {
        this.status = status;
        return this;
    }

    public MeetingInfo links(LinksInfo links) {
        this.links = links;
        return this;
    }

    public MeetingInfo schedule(MeetingScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

    public MeetingInfo allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public MeetingInfo startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }

    public MeetingInfo startParticipantsVideo(Boolean startParticipantsVideo) {
        this.startParticipantsVideo = startParticipantsVideo;
        return this;
    }

    public MeetingInfo audioOptions(String[] audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }
}
