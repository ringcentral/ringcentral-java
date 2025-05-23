package com.ringcentral.definitions;


public class PresenceInfoRequest {
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
     * Do Not Disturb status of a User extension. Applicable for User extensions
     * if the new communication handling service is activated on account
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatusPersonal;
    /**
     * Custom status message (as previously published by user)
     */
    public String message;
    /**
     * If set to `true` enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
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
     * Configures the user presence visibility. When the `allowSeeMyPresence` parameter is set to `true`,
     * the following visibility options are supported via this parameter - All, None, PermittedUsers
     * Enum: All, None, PermittedUsers
     */
    public String callerIdVisibility;
    /**
     * Specifies if a Call Queue member extension will be able to receive Call Queue calls.
     * Applicable for User extensions if the new communication handling service is activated on account.
     * Used for Agent state type
     */
    public Boolean acceptCallQueueCalls;

    public PresenceInfoRequest userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public PresenceInfoRequest dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public PresenceInfoRequest dndStatusPersonal(String dndStatusPersonal) {
        this.dndStatusPersonal = dndStatusPersonal;
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

    public PresenceInfoRequest callerIdVisibility(String callerIdVisibility) {
        this.callerIdVisibility = callerIdVisibility;
        return this;
    }

    public PresenceInfoRequest acceptCallQueueCalls(Boolean acceptCallQueueCalls) {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
        return this;
    }
}
