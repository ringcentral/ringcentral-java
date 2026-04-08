package com.ringcentral.definitions;

public class PresenceInfoRequest {
    /**
     * User-defined presence status (as previously published by the user) Enum: Offline, Busy,
     * Available
     */
    public String userStatus;

    public PresenceInfoRequest userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Do Not Disturb status. Not applicable for User extensions if the new communication handling
     * service is activated on account Enum: TakeAllCalls, DoNotAcceptDepartmentCalls,
     * TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;

    public PresenceInfoRequest dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     * Do Not Disturb status of a User extension. Connected to the DND State type. Applicable for
     * User extensions if the new communication handling service is activated on account. Enum:
     * TakeAllCalls, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatusPersonal;

    public PresenceInfoRequest dndStatusPersonal(String dndStatusPersonal) {
        this.dndStatusPersonal = dndStatusPersonal;
        return this;
    }

    /** Custom status message (as previously published by user) */
    public String message;

    public PresenceInfoRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
     * If set to `true` enables other extensions to see the extension presence status Default: true
     */
    public Boolean allowSeeMyPresence;

    public PresenceInfoRequest allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     * If `true` enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;

    public PresenceInfoRequest ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /** If `true` enables the extension user to pick up a monitored line on hold */
    public Boolean pickUpCallsOnHold;

    public PresenceInfoRequest pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     * Configures the user presence visibility. When the `allowSeeMyPresence` parameter is set to
     * `true`, the following visibility options are supported via this parameter - All, None,
     * PermittedUsers Enum: All, None, PermittedUsers
     */
    public String callerIdVisibility;

    public PresenceInfoRequest callerIdVisibility(String callerIdVisibility) {
        this.callerIdVisibility = callerIdVisibility;
        return this;
    }

    /**
     * Specifies if a Call Queue member extension will be able to receive Call Queue calls. Used for
     * the Agent state type. Applicable for User extensions if the new communication handling
     * service is activated on account
     */
    public Boolean acceptCallQueueCalls;

    public PresenceInfoRequest acceptCallQueueCalls(Boolean acceptCallQueueCalls) {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
        return this;
    }
}
