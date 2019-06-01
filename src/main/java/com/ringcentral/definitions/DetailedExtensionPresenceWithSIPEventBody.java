package com.ringcentral.definitions;


public class DetailedExtensionPresenceWithSIPEventBody {
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
    public ActiveCallInfo[] activeCalls;
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

    public DetailedExtensionPresenceWithSIPEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody activeCalls(ActiveCallInfo[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody totalActiveCalls(Long totalActiveCalls) {
        this.totalActiveCalls = totalActiveCalls;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
