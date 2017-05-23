package com.ringcentral.definitions;

public class CallLogRecord {
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
    // Call recording data. Returned if the call is recorded, the withRecording parameter is set to 'True' in this case
    public RecordingInfo recording;
    // For 'Detailed' view only. The datetime when the call log record was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    // For 'Detailed' view only. Call transport
    public String transport;
    // For 'Detailed' view only. Leg description
    public LegInfo[] legs;

    public CallLogRecord id(String id) {
        this.id = id;
        return this;
    }

    public CallLogRecord uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallLogRecord sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public CallLogRecord from(CallerInfo from) {
        this.from = from;
        return this;
    }

    public CallLogRecord to(CallerInfo to) {
        this.to = to;
        return this;
    }

    public CallLogRecord type(String type) {
        this.type = type;
        return this;
    }

    public CallLogRecord direction(String direction) {
        this.direction = direction;
        return this;
    }

    public CallLogRecord action(String action) {
        this.action = action;
        return this;
    }

    public CallLogRecord result(String result) {
        this.result = result;
        return this;
    }

    public CallLogRecord startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CallLogRecord duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CallLogRecord recording(RecordingInfo recording) {
        this.recording = recording;
        return this;
    }

    public CallLogRecord lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public CallLogRecord transport(String transport) {
        this.transport = transport;
        return this;
    }

    public CallLogRecord legs(LegInfo[] legs) {
        this.legs = legs;
        return this;
    }
}
