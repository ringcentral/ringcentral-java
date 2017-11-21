package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RingOutStatusInfo
{
    // Status of a call
    public String callStatus;
    public RingOutStatusInfo callStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }
    // Status of a calling party
    public String callerStatus;
    public RingOutStatusInfo callerStatus(String callerStatus) {
        this.callerStatus = callerStatus;
        return this;
    }
    // Status of a called party
    public String calleeStatus;
    public RingOutStatusInfo calleeStatus(String calleeStatus) {
        this.calleeStatus = calleeStatus;
        return this;
    }
}
