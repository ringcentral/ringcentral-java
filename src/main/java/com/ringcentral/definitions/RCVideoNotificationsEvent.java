package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RCVideoNotificationsEvent
{
    // Identifier of a meeting
    public String id;
    public RCVideoNotificationsEvent id(String id) {
        this.id = id;
        return this;
    }
    // Meeting Name
    public String name;
    public RCVideoNotificationsEvent name(String name) {
        this.name = name;
        return this;
    }
    // Datetime of meeting start in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String start;
    public RCVideoNotificationsEvent start(String start) {
        this.start = start;
        return this;
    }
    // Meeting duration
    public Long duration;
    public RCVideoNotificationsEvent duration(Long duration) {
        this.duration = duration;
        return this;
    }
    // Meeting participants information
    public RCVParticipantsInfo participants;
    public RCVideoNotificationsEvent participants(RCVParticipantsInfo participants) {
        this.participants = participants;
        return this;
    }
    // Specifies whether a meeting is recorded or not
    public Boolean recorded;
    public RCVideoNotificationsEvent recorded(Boolean recorded) {
        this.recorded = recorded;
        return this;
    }
    // Meeting recording information, if recorded value is 'True'
    public RCVRecordingInfo recording;
    public RCVideoNotificationsEvent recording(RCVRecordingInfo recording) {
        this.recording = recording;
        return this;
    }
}
