package com.ringcentral.definitions;


public class PresenceInfoRequest {
    /**
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    /**
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;
    /**
     *
     */
    public String message;
    /**
     *
     */
    public Boolean allowSeeMyPresence;
    /**
     *
     */
    public Boolean ringOnMonitoredCall;
    /**
     *
     */
    public Boolean pickUpCallsOnHold;

    public PresenceInfoRequest userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public PresenceInfoRequest dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public PresenceInfoRequest message(String message) {
        this.message = message;
        return this;
    }

    public PresenceInfoRequest allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public PresenceInfoRequest ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public PresenceInfoRequest pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
}
