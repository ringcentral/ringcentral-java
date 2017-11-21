package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MeetingRequestResource
{
    //
    public String topic;
    public MeetingRequestResource topic(String topic) {
        this.topic = topic;
        return this;
    }
    //
    public String meetingType;
    public MeetingRequestResource meetingType(String meetingType) {
        this.meetingType = meetingType;
        return this;
    }
    //
    public MeetingScheduleResource schedule;
    public MeetingRequestResource schedule(MeetingScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
    //
    public String password;
    public MeetingRequestResource password(String password) {
        this.password = password;
        return this;
    }
    //
    public HostInfoRequest host;
    public MeetingRequestResource host(HostInfoRequest host) {
        this.host = host;
        return this;
    }
    //
    public Boolean allowJoinBeforeHost;
    public MeetingRequestResource allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }
    //
    public Boolean startHostVideo;
    public MeetingRequestResource startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }
    //
    public Boolean startParticipantsVideo;
    public MeetingRequestResource startParticipantsVideo(Boolean startParticipantsVideo) {
        this.startParticipantsVideo = startParticipantsVideo;
        return this;
    }
    //
    public String[] audioOptions;
    public MeetingRequestResource audioOptions(String[] audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }
}
