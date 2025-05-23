package com.ringcentral.definitions;


public class ExtensionPresenceEventBody {
    /**
     * Internal identifier of an extension. Optional parameter
     * Default: ~
     */
    public String extensionId;
    /**
     * Telephony presence status. Returned if telephony status is changed.
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    /**
     * Order number of a notification to state the chronology
     * Format: int32
     */
    public Long sequence;
    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
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
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public ExtensionPresenceEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionPresenceEventBody telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public ExtensionPresenceEventBody sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    public ExtensionPresenceEventBody presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    public ExtensionPresenceEventBody userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public ExtensionPresenceEventBody dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public ExtensionPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public ExtensionPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public ExtensionPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public ExtensionPresenceEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
}
