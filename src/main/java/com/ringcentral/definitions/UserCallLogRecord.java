package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserCallLogRecord
{
    // Internal identifier of a cal log record
    public String id;
    public UserCallLogRecord id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a call log record
    public String uri;
    public UserCallLogRecord uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of a call session
    public String sessionId;
    public UserCallLogRecord sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    //
    public CallLogCallerInfo from;
    public UserCallLogRecord from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }
    //
    public CallLogCallerInfo to;
    public UserCallLogRecord to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }
    // Call type = ['Voice', 'Fax']
    public String type;
    public UserCallLogRecord type(String type) {
        this.type = type;
        return this;
    }
    // Call direction = ['Inbound', 'Outbound']
    public String direction;
    public UserCallLogRecord direction(String direction) {
        this.direction = direction;
        return this;
    }
    // The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String startTime;
    public UserCallLogRecord startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    // Call duration in seconds
    public Long duration;
    public UserCallLogRecord duration(Long duration) {
        this.duration = duration;
        return this;
    }
    //
    public RecordingInfo recording;
    public UserCallLogRecord recording(RecordingInfo recording) {
        this.recording = recording;
        return this;
    }
}
