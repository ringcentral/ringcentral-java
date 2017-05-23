package com.ringcentral.definitions;

public class DetailedPresencewithSIPEvent_ActiveCallInfo {
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
    // SIP connection settings
    public SIPData sipData;
}
