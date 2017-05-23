package com.ringcentral.definitions;

public class CallLogInfo {
    // Internal identifier of a cal log record
    public String id;
    // Canonical URI of a call log record
    public String uri;
    // Internal identifier of a call session
    public String sessionId;
    // Caller information
    public CallerInfo from;
    // Callee information
    public CallerInfo to;
    // Call type
    public String type;
    // Call direction
    public String direction;
    // Action description of the call operation
    public String action;
    // Status description of the call operation
    public String result;
    // The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String startTime;
    // Call duration in seconds
    public Long duration;
    // Call recording data. Returned if the call is recorded
    public RecordingInfo recording;

    public CallLogInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallLogInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallLogInfo sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public CallLogInfo from(CallerInfo from) {
        this.from = from;
        return this;
    }

    public CallLogInfo to(CallerInfo to) {
        this.to = to;
        return this;
    }

    public CallLogInfo type(String type) {
        this.type = type;
        return this;
    }

    public CallLogInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public CallLogInfo action(String action) {
        this.action = action;
        return this;
    }

    public CallLogInfo result(String result) {
        this.result = result;
        return this;
    }

    public CallLogInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CallLogInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CallLogInfo recording(RecordingInfo recording) {
        this.recording = recording;
        return this;
    }
}
