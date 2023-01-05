package com.ringcentral.definitions;


public class PresenceInfoResponse
{
    /**
     * Link to the presence resource
     * Format: uri
     */
    public String uri;
    public PresenceInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    public PresenceInfoResponse userStatus(String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;
    public PresenceInfoResponse dndStatus(String dndStatus)
    {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     */
    public String message;
    public PresenceInfoResponse message(String message)
    {
        this.message = message;
        return this;
    }

    /**
     */
    public Boolean allowSeeMyPresence;
    public PresenceInfoResponse allowSeeMyPresence(Boolean allowSeeMyPresence)
    {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     */
    public Boolean ringOnMonitoredCall;
    public PresenceInfoResponse ringOnMonitoredCall(Boolean ringOnMonitoredCall)
    {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     */
    public Boolean pickUpCallsOnHold;
    public PresenceInfoResponse pickUpCallsOnHold(Boolean pickUpCallsOnHold)
    {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     */
    public ActiveCallInfo[] activeCalls;
    public PresenceInfoResponse activeCalls(ActiveCallInfo[] activeCalls)
    {
        this.activeCalls = activeCalls;
        return this;
    }

    /**
     */
    public GetPresenceExtensionInfo extension;
    public PresenceInfoResponse extension(GetPresenceExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Meetings presence status
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
    public PresenceInfoResponse meetingStatus(String meetingStatus)
    {
        this.meetingStatus = meetingStatus;
        return this;
    }

    /**
     * Telephony presence status. Returned if telephony status is changed
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    public PresenceInfoResponse telephonyStatus(String telephonyStatus)
    {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
    public PresenceInfoResponse presenceStatus(String presenceStatus)
    {
        this.presenceStatus = presenceStatus;
        return this;
    }
}