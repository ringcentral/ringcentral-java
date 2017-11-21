package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogRecord
{
    // Internal identifier of a cal log record
    public String id;
    public CallLogRecord id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a call log record
    public String uri;
    public CallLogRecord uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of a call session
    public String sessionId;
    public CallLogRecord sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    // Caller information
    public CallLogCallerInfo from;
    public CallLogRecord from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }
    // Callee information
    public CallLogCallerInfo to;
    public CallLogRecord to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }
    // Call type
    public String type;
    public CallLogRecord type(String type) {
        this.type = type;
        return this;
    }
    // Call direction
    public String direction;
    public CallLogRecord direction(String direction) {
        this.direction = direction;
        return this;
    }
    // Action description of the call operation
    public String action;
    public CallLogRecord action(String action) {
        this.action = action;
        return this;
    }
    // Status description of the call operation
    public String result;
    public CallLogRecord result(String result) {
        this.result = result;
        return this;
    }
    // The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String startTime;
    public CallLogRecord startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    // Call duration in seconds
    public Long duration;
    public CallLogRecord duration(Long duration) {
        this.duration = duration;
        return this;
    }
    // Call recording data. Returned if the call is recorded, the withRecording parameter is set to 'True' in this case
    public RecordingInfo recording;
    public CallLogRecord recording(RecordingInfo recording) {
        this.recording = recording;
        return this;
    }
    // For 'Detailed' view only. The datetime when the call log record was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    public CallLogRecord lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    // For 'Detailed' view only. Call transport
    public String transport;
    public CallLogRecord transport(String transport) {
        this.transport = transport;
        return this;
    }
    // For 'Detailed' view only. Leg description
    public CallLogRecordLegInfo[] legs;
    public CallLogRecord legs(CallLogRecordLegInfo[] legs) {
        this.legs = legs;
        return this;
    }
}
