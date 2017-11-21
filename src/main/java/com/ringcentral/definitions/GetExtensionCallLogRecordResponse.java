package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetExtensionCallLogRecordResponse
{
    // Internal identifier of a cal log record
    public String id;
    public GetExtensionCallLogRecordResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a call log record
    public String uri;
    public GetExtensionCallLogRecordResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of a call session
    public String sessionId;
    public GetExtensionCallLogRecordResponse sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    // Caller information
    public CallLogCallerInfo from;
    public GetExtensionCallLogRecordResponse from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }
    // Callee information
    public CallLogCallerInfo to;
    public GetExtensionCallLogRecordResponse to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }
    // Call type
    public String type;
    public GetExtensionCallLogRecordResponse type(String type) {
        this.type = type;
        return this;
    }
    // Call direction
    public String direction;
    public GetExtensionCallLogRecordResponse direction(String direction) {
        this.direction = direction;
        return this;
    }
    // Action description of the call operation
    public String action;
    public GetExtensionCallLogRecordResponse action(String action) {
        this.action = action;
        return this;
    }
    // Status description of the call operation
    public String result;
    public GetExtensionCallLogRecordResponse result(String result) {
        this.result = result;
        return this;
    }
    // The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String startTime;
    public GetExtensionCallLogRecordResponse startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    // Call duration in seconds
    public Long duration;
    public GetExtensionCallLogRecordResponse duration(Long duration) {
        this.duration = duration;
        return this;
    }
    // Call recording data. Returned if the call is recorded
    public RecordingInfo recording;
    public GetExtensionCallLogRecordResponse recording(RecordingInfo recording) {
        this.recording = recording;
        return this;
    }
}
