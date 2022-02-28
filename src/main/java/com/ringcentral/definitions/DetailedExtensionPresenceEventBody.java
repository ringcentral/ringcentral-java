package com.ringcentral.definitions;


/**
 * Notification payload body
 */
public class DetailedExtensionPresenceEventBody {
    /**
     * Internal identifier of an extension
     * Default: ~
     */
    public String extensionId;

    public DetailedExtensionPresenceEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Telephony presence status. Returned if telephony status is changed.
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;

    public DetailedExtensionPresenceEventBody telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * List of the latest 7 active calls on extension
     */
    public ActiveCallInfoWithoutSIP[] activeCalls;

    public DetailedExtensionPresenceEventBody activeCalls(ActiveCallInfoWithoutSIP[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

    /**
     * Order number of a notification to state the chronology
     */
    public Long sequence;

    public DetailedExtensionPresenceEventBody sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;

    public DetailedExtensionPresenceEventBody presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;

    public DetailedExtensionPresenceEventBody userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Meetings presence status
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;

    public DetailedExtensionPresenceEventBody meetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
        return this;
    }

    /**
     * Extended DnD (Do not Disturb) status
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
     */
    public String dndStatus;

    public DetailedExtensionPresenceEventBody dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     * If &#039;True&#039; enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;

    public DetailedExtensionPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     * If &#039;True&#039; enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;

    public DetailedExtensionPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     * If &#039;True&#039; enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;

    public DetailedExtensionPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     * Total number of active calls on extension at the present moment
     */
    public Long totalActiveCalls;

    public DetailedExtensionPresenceEventBody totalActiveCalls(Long totalActiveCalls) {
        this.totalActiveCalls = totalActiveCalls;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public DetailedExtensionPresenceEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
}
