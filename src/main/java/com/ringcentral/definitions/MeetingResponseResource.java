package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MeetingResponseResource
{
    //
    public String uri;
    public MeetingResponseResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String uuid;
    public MeetingResponseResource uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    //
    public String id;
    public MeetingResponseResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String topic;
    public MeetingResponseResource topic(String topic) {
        this.topic = topic;
        return this;
    }
    //
    public String meetingType;
    public MeetingResponseResource meetingType(String meetingType) {
        this.meetingType = meetingType;
        return this;
    }
    //
    public String password;
    public MeetingResponseResource password(String password) {
        this.password = password;
        return this;
    }
    //
    public String status;
    public MeetingResponseResource status(String status) {
        this.status = status;
        return this;
    }
    //
    public MeetingLinks links;
    public MeetingResponseResource links(MeetingLinks links) {
        this.links = links;
        return this;
    }
    //
    public MeetingScheduleResource schedule;
    public MeetingResponseResource schedule(MeetingScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
    //
    public Boolean allowJoinBeforeHost;
    public MeetingResponseResource allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }
    //
    public Boolean startHostVideo;
    public MeetingResponseResource startHostVideo(Boolean startHostVideo) {
        this.startHostVideo = startHostVideo;
        return this;
    }
    //
    public Boolean startParticipantsVideo;
    public MeetingResponseResource startParticipantsVideo(Boolean startParticipantsVideo) {
        this.startParticipantsVideo = startParticipantsVideo;
        return this;
    }
    //
    public String[] audioOptions;
    public MeetingResponseResource audioOptions(String[] audioOptions) {
        this.audioOptions = audioOptions;
        return this;
    }
}
