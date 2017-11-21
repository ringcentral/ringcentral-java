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
    // Caller information
    public String from;
    public UserCallLogRecord from(String from) {
        this.from = from;
        return this;
    }
    // Callee information
    public String to;
    public UserCallLogRecord to(String to) {
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
    // Call recording data. Returned if the call is recorded. Each call recording is stored in the system for 90 days. But if the number of recordings exceeds the admissible limit (100,000 recordings per account) then the older recordings are replaced with the new ones. Thus a link to an older recording in a certain call log record becomes unavailable
    public String recording;
    public UserCallLogRecord recording(String recording) {
        this.recording = recording;
        return this;
    }
}
