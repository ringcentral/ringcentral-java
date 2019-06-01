package com.ringcentral.definitions;


public class PresenceInfoResource {
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
    /**
     *
     */
    public ActiveCallInfo[] activeCalls;

    public PresenceInfoResource userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public PresenceInfoResource dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public PresenceInfoResource message(String message) {
        this.message = message;
        return this;
    }

    public PresenceInfoResource allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public PresenceInfoResource ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public PresenceInfoResource pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public PresenceInfoResource activeCalls(ActiveCallInfo[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

}
