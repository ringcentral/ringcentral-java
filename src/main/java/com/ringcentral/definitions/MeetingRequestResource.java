package com.ringcentral.definitions;


public class MeetingRequestResource {
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
    public MeetingScheduleResource schedule;
    /**
     *
     */
    public String password;
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
    public Boolean usePersonalMeetingId;
    /**
     *
     */
    public String[] audioOptions;

    public MeetingRequestResource topic(String topic) {
        this.topic = topic;
        return this;
    }

    public MeetingRequestResource meetingType(String meetingType) {
        this.meetingType = meetingType;
        return this;
    }

    public MeetingRequestResource schedule(MeetingScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }

    public MeetingRequestResource password(String password) {
        this.password = password;
        return this;
    }

    public MeetingRequestResource host(HostInfoRequest host) {
        this.host = host;
        return this;
    }

    public MeetingRequestResource allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }

    public MeetingRequestResource startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }

    public MeetingRequestResource startParticipantsVideo(Boolean startParticipantsVideo) {
        this.startParticipantsVideo = startParticipantsVideo;
        return this;
    }

    public MeetingRequestResource usePersonalMeetingId(Boolean usePersonalMeetingId) {
        this.usePersonalMeetingId = usePersonalMeetingId;
        return this;
    }

    public MeetingRequestResource audioOptions(String[] audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }

}
