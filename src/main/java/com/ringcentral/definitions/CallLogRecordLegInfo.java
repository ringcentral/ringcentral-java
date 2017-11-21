package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallLogRecordLegInfo
{
    // Action description of the call operation
    public String action;
    public CallLogRecordLegInfo action(String action) {
        this.action = action;
        return this;
    }
    // Call direction
    public String direction;
    public CallLogRecordLegInfo direction(String direction) {
        this.direction = direction;
        return this;
    }
    // Call duration in seconds
    public Long duration;
    public CallLogRecordLegInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }
    // Information on extension
    public ExtensionInfoCallLog extension;
    public CallLogRecordLegInfo extension(ExtensionInfoCallLog extension) {
        this.extension = extension;
        return this;
    }
    // Leg type
    public String legType;
    public CallLogRecordLegInfo legType(String legType) {
        this.legType = legType;
        return this;
    }
    // The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String startTime;
    public CallLogRecordLegInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    // Call type
    public String type;
    public CallLogRecordLegInfo type(String type) {
        this.type = type;
        return this;
    }
    // Status description of the call operation
    public String result;
    public CallLogRecordLegInfo result(String result) {
        this.result = result;
        return this;
    }
    // Caller information
    public CallLogCallerInfo from;
    public CallLogRecordLegInfo from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }
    // Callee information
    public CallLogCallerInfo to;
    public CallLogRecordLegInfo to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }
    // Call transport
    public String transport;
    public CallLogRecordLegInfo transport(String transport) {
        this.transport = transport;
        return this;
    }
    // Call recording data. Returned if the call is recorded
    public RecordingInfo recording;
    public CallLogRecordLegInfo recording(RecordingInfo recording) {
        this.recording = recording;
        return this;
    }
}
