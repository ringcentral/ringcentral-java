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

    public DetailedPresencewithSIPEvent_ActiveCallInfo id(String id) {
        this.id = id;
        return this;
    }

    public DetailedPresencewithSIPEvent_ActiveCallInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public DetailedPresencewithSIPEvent_ActiveCallInfo from(String from) {
        this.from = from;
        return this;
    }

    public DetailedPresencewithSIPEvent_ActiveCallInfo to(String to) {
        this.to = to;
        return this;
    }

    public DetailedPresencewithSIPEvent_ActiveCallInfo telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public DetailedPresencewithSIPEvent_ActiveCallInfo sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public DetailedPresencewithSIPEvent_ActiveCallInfo sipData(SIPData sipData) {
        this.sipData = sipData;
        return this;
    }
}
