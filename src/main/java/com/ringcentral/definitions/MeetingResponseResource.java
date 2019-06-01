package com.ringcentral.definitions;


public class MeetingResponseResource {
    /**
     *
     */
    public String uri;
    /**
     *
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
     *
     */
    public String meetingType;
    /**
     *
     */
    public String password;
    /**
     *
     */
    public String h323Password;
    /**
     *
     */
    public String status;
    /**
     *
     */
    public MeetingLinks links;
    /**
     *
     */
    public MeetingScheduleResource schedule;
    /**
     *
     */
    public HostInfoRequest host;
    /**
     *
     */
    public Boolean allowJoinBeforeHost;
    /**
     *
     */
    public Boolean startHostVideo;
    /**
     *
     */
    public Boolean startParticipantsVideo;
    /**
     *
     */
    public String[] audioOptions;

    public MeetingResponseResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingResponseResource uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public MeetingResponseResource id(String id) {
        this.id = id;
        return this;
    }

    public MeetingResponseResource topic(String topic) {
        this.topic = topic;
        return this;
    }

    public MeetingResponseResource meetingType(String meetingType) {
        this.meetingType = meetingType;
        return this;
    }

    public MeetingResponseResource password(String password) {
        this.password = password;
        return this;
    }

    public MeetingResponseResource h323Password(String h323Password) {
        this.h323Password = h323Password;
        return this;
    }

    public MeetingResponseResource status(String status) {
        this.status = status;
        return this;
    }

    public MeetingResponseResource links(MeetingLinks links) {
        this.links = links;
        return this;
    }

    public MeetingResponseResource schedule(MeetingScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }

    public MeetingResponseResource host(HostInfoRequest host) {
        this.host = host;
        return this;
    }

    public MeetingResponseResource allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public MeetingResponseResource startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }

    public MeetingResponseResource startParticipantsVideo(Boolean startParticipantsVideo) {
        this.startParticipantsVideo = startParticipantsVideo;
        return this;
    }

    public MeetingResponseResource audioOptions(String[] audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }

}
