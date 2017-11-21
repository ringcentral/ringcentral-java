package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PresenceInfoResource
{
    //
    public String userStatus;
    public PresenceInfoResource userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    //
    public String dndStatus;
    public PresenceInfoResource dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }
    //
    public String message;
    public PresenceInfoResource message(String message) {
        this.message = message;
        return this;
    }
    //
    public Boolean allowSeeMyPresence;
    public PresenceInfoResource allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }
    //
    public Boolean ringOnMonitoredCall;
    public PresenceInfoResource ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }
    //
    public Boolean pickUpCallsOnHold;
    public PresenceInfoResource pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
    //
    public ActiveCallInfo[] activeCalls;
    public PresenceInfoResource activeCalls(ActiveCallInfo[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }
}
