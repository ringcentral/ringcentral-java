package com.ringcentral.definitions;

public class DetailedPresenceEvent_ActiveCallInfo {
    // Internal identifier of a call
    public String id;
    // Call direction
    public String direction;
    // Phone number or extension number of a caller
    public String from;
    // Phone number or extension number of a callee
    public String to;
    // Telephony call status. See Telephony Status Values for detailed status description
    public String telephonyStatus;
    // Internal identifier of a call session
    public String sessionId;
    // Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'Intermediate' it means the call is not actually ended, the connection is established on one of the devices
    public String terminationType;
}
