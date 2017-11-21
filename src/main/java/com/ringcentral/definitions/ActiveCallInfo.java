package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ActiveCallInfo
{
    //
    public String id;
    public ActiveCallInfo id(String id) {
        this.id = id;
        return this;
    }
    //
    public String direction;
    public ActiveCallInfo direction(String direction) {
        this.direction = direction;
        return this;
    }
    //
    public String from;
    public ActiveCallInfo from(String from) {
        this.from = from;
        return this;
    }
    //
    public String to;
    public ActiveCallInfo to(String to) {
        this.to = to;
        return this;
    }
    //
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
    //
    public String sessionId;
    public ActiveCallInfo sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    //
    public String terminationType;
    public ActiveCallInfo terminationType(String terminationType) {
        this.terminationType = terminationType;
        return this;
    }
}
