package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PutPresenceResource
{
    //
    public String userStatus;
    public PutPresenceResource userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    //
    public String message;
    public PutPresenceResource message(String message) {
        this.message = message;
        return this;
    }
    //
    public String dndStatus;
    public PutPresenceResource dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }
    //
    public Boolean allowSeeMyPresence;
    public PutPresenceResource allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }
    //
    public Boolean ringOnMonitoredCall;
    public PutPresenceResource ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }
    //
    public Boolean pickUpCallsOnHold;
    public PutPresenceResource pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
}
