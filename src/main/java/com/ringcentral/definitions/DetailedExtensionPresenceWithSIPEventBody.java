package com.ringcentral.definitions;


/**
 * Notification payload body
 */
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
     * List of the latest 7 active calls on extension
     */
    public ActiveCallInfo[] activeCalls;
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
     * Meetings presence status
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
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
     * If `true` enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    /**
     * Specifies if a Call Queue member extension will be able to receive Call Queue calls.
     * Used for the Agent state type. Applicable for User extensions if the new communication
     * handling service is activated on account
     */
    public Boolean acceptCallQueueCalls;
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
     * Total number of active calls on extension at the present moment
     * Format: int32
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

    public DetailedExtensionPresenceWithSIPEventBody meetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody dndStatusPersonal(String dndStatusPersonal) {
        this.dndStatusPersonal = dndStatusPersonal;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public DetailedExtensionPresenceWithSIPEventBody acceptCallQueueCalls(Boolean acceptCallQueueCalls) {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
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
