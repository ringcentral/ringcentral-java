package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ActiveCallInfo
{
    // Internal identifier of a call
    public String id;
    public ActiveCallInfo id(String id) {
        this.id = id;
        return this;
    }
    // Call direction
    public String direction;
    public ActiveCallInfo direction(String direction) {
        this.direction = direction;
        return this;
    }
    // Phone number or extension number of a caller
    public String from;
    public ActiveCallInfo from(String from) {
        this.from = from;
        return this;
    }
    // Phone number or extension number of a callee
    public String to;
    public ActiveCallInfo to(String to) {
        this.to = to;
        return this;
    }
    // Telephony call status
    public String telephonyStatus;
    public ActiveCallInfo telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }
    //
    public DetailedCallInfo sipData;
    public ActiveCallInfo sipData(DetailedCallInfo sipData) {
        this.sipData = sipData;
        return this;
    }
    // Internal identifier of a call session
    public String sessionId;
    public ActiveCallInfo sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    // Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'intermediate' it means the call is not actually ended, the connection is established on one of the devices
    public String terminationType;
    public ActiveCallInfo terminationType(String terminationType) {
        this.terminationType = terminationType;
        return this;
    }
}
