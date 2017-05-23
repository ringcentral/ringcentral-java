package com.ringcentral.definitions;

public class RingOutStatusInfo {
    // Status of a call
    public String callStatus;
    // Status of a calling party
    public String callerStatus;
    // Status of a called party
    public String calleeStatus;

    public RingOutStatusInfo callStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }

    public RingOutStatusInfo callerStatus(String callerStatus) {
        this.callerStatus = callerStatus;
        return this;
    }

    public RingOutStatusInfo calleeStatus(String calleeStatus) {
        this.calleeStatus = calleeStatus;
        return this;
    }
}
