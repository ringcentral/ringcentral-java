package com.ringcentral.definitions;


/**
 * Notification payload body
 */
public class AccountPresenceEventBody {
    /**
     * Internal identifier of an extension. Optional parameter
     * Default: ~
     */
    public String extensionId;
    /**
     * Telephony presence status. Returned if telephony status is changed
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
     * Meetings presence status. Specifies if a user is on a meeting
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
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

    public AccountPresenceEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public AccountPresenceEventBody telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public AccountPresenceEventBody sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    public AccountPresenceEventBody presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    public AccountPresenceEventBody userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public AccountPresenceEventBody dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public AccountPresenceEventBody meetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
        return this;
    }

    public AccountPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public AccountPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public AccountPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public AccountPresenceEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
}
