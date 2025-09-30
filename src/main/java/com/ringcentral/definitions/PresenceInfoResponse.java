package com.ringcentral.definitions;


public class PresenceInfoResponse {
    /**
     * Link to the presence resource
     * Format: uri
     */
    public String uri;
    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    /**
     * Do Not Disturb status. Not applicable for User extensions
     * if the new communication handling service is activated on account
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;
    /**
     * Do Not Disturb status of a User extension. Connected to the DND State type.
     * Applicable for User extensions if the new communication handling service is
     * activated on account.
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatusPersonal;
    /**
     * Specifies if a Call Queue member extension will be able to receive Call Queue calls.
     * Used for the Agent state type. Applicable for User extensions if the new communication
     * handling service is activated on account
     */
    public Boolean acceptCallQueueCalls;
    /**
     * Custom status message (as previously published by user)
     */
    public String message;
    /**
     * If set to `true` enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    /**
     * Configures the user presence visibility. When the `allowSeeMyPresence` parameter is set to `true`,
     * the following visibility options are supported via this parameter - All, None, PermittedUsers
     * Enum: All, None, PermittedUsers
     */
    public String callerIdVisibility;
    /**
     * If `true` enables to ring extension phone, if any user monitored
     * by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    /**
     * If `true` enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    /**
     *
     */
    public ActiveCallInfo[] activeCalls;
    /**
     *
     */
    public GetPresenceExtensionInfo extension;
    /**
     * Meetings presence status
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
    /**
     * Telephony presence status. Returned if telephony status is changed
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;

    public PresenceInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PresenceInfoResponse userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public PresenceInfoResponse dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public PresenceInfoResponse dndStatusPersonal(String dndStatusPersonal) {
        this.dndStatusPersonal = dndStatusPersonal;
        return this;
    }

    public PresenceInfoResponse acceptCallQueueCalls(Boolean acceptCallQueueCalls) {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
        return this;
    }

    public PresenceInfoResponse message(String message) {
        this.message = message;
        return this;
    }

    public PresenceInfoResponse allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public PresenceInfoResponse callerIdVisibility(String callerIdVisibility) {
        this.callerIdVisibility = callerIdVisibility;
        return this;
    }

    public PresenceInfoResponse ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public PresenceInfoResponse pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public PresenceInfoResponse activeCalls(ActiveCallInfo[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

    public PresenceInfoResponse extension(GetPresenceExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public PresenceInfoResponse meetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
        return this;
    }

    public PresenceInfoResponse telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public PresenceInfoResponse presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }
}
