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
}
