package com.ringcentral.definitions;

public class LegInfo {
    // Action description of the call operation
    public String action;
    // Call direction
    public String direction;
    // Call duration in seconds
    public Long duration;
    // Information on extension
    public LegInfo_ExtensionInfo extension;
    // Leg type
    public String legType;
    // The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String startTime;
    // Call type
    public String type;
    // Status description of the call operation
    public String result;
    // Caller information
    public CallerInfo from;
    // Callee information
    public CallerInfo to;
    // Call transport
    public String transport;
    // Call recording data. Returned if the call is recorded
    public RecordingInfo recording;

    public LegInfo action(String action) {
        this.action = action;
        return this;
    }

    public LegInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public LegInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public LegInfo extension(LegInfo_ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public LegInfo legType(String legType) {
        this.legType = legType;
        return this;
    }

    public LegInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public LegInfo type(String type) {
        this.type = type;
        return this;
    }

    public LegInfo result(String result) {
        this.result = result;
        return this;
    }

    public LegInfo from(CallerInfo from) {
        this.from = from;
        return this;
    }

    public LegInfo to(CallerInfo to) {
        this.to = to;
        return this;
    }

    public LegInfo transport(String transport) {
        this.transport = transport;
        return this;
    }

    public LegInfo recording(RecordingInfo recording) {
        this.recording = recording;
        return this;
    }
}
