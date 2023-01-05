package com.ringcentral.definitions;


public class PresenceInfoRequest
{
    /**
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    public PresenceInfoRequest userStatus(String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;
    public PresenceInfoRequest dndStatus(String dndStatus)
    {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     */
    public String message;
    public PresenceInfoRequest message(String message)
    {
        this.message = message;
        return this;
    }

    /**
     */
    public Boolean allowSeeMyPresence;
    public PresenceInfoRequest allowSeeMyPresence(Boolean allowSeeMyPresence)
    {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     */
    public Boolean ringOnMonitoredCall;
    public PresenceInfoRequest ringOnMonitoredCall(Boolean ringOnMonitoredCall)
    {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     */
    public Boolean pickUpCallsOnHold;
    public PresenceInfoRequest pickUpCallsOnHold(Boolean pickUpCallsOnHold)
    {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
}