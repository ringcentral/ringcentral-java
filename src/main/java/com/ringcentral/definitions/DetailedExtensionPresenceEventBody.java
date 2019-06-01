package com.ringcentral.definitions;


public class DetailedExtensionPresenceEventBody {
    /**
     * Internal identifier of an extension
     * Default: ~
     */
    public String extensionId;
    /**
     * Telephony presence status. Returned if telephony status is changed.
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    /**
     * List of the latest 10 active calls on extension
     */
    public ActiveCallInfoWithoutSIP[] activeCalls;
    /**
     * Order number of a notification to state the chronology
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
     * Extended DnD (Do not Disturb) status
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
     */
    public String dndStatus;
    /**
     * If 'True' enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    /**
     * If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    /**
     * If 'True' enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    /**
     * Total number of active calls on extension at the present moment
     */
    public Long totalActiveCalls;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public DetailedExtensionPresenceEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public DetailedExtensionPresenceEventBody telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public DetailedExtensionPresenceEventBody activeCalls(ActiveCallInfoWithoutSIP[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

    public DetailedExtensionPresenceEventBody sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    public DetailedExtensionPresenceEventBody presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    public DetailedExtensionPresenceEventBody userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public DetailedExtensionPresenceEventBody dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public DetailedExtensionPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public DetailedExtensionPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public DetailedExtensionPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public DetailedExtensionPresenceEventBody totalActiveCalls(Long totalActiveCalls) {
        this.totalActiveCalls = totalActiveCalls;
        return this;
    }

    public DetailedExtensionPresenceEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
