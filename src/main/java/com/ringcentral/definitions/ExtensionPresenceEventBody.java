package com.ringcentral.definitions;

public class ExtensionPresenceEventBody {
    /** Internal identifier of an extension. Optional parameter Default: ~ */
    public String extensionId;

    public ExtensionPresenceEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Telephony presence status. Returned if telephony status is changed. Enum: NoCall,
     * CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;

    public ExtensionPresenceEventBody telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * Telephony status of the extension aggregated across all telephony status sources. Enum:
     * NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String aggregatedTelephonyStatus;

    public ExtensionPresenceEventBody aggregatedTelephonyStatus(String aggregatedTelephonyStatus) {
        this.aggregatedTelephonyStatus = aggregatedTelephonyStatus;
        return this;
    }

    /** Order number of a notification to state the chronology Format: int32 */
    public Long sequence;

    public ExtensionPresenceEventBody sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources Enum: Offline, Busy,
     * Available
     */
    public String presenceStatus;

    public ExtensionPresenceEventBody presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    /**
     * User-defined presence status (as previously published by the user) Enum: Offline, Busy,
     * Available
     */
    public String userStatus;

    public ExtensionPresenceEventBody userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Do Not Disturb status. Not applicable for User extensions if the new communication handling
     * service is activated on account Enum: TakeAllCalls, DoNotAcceptDepartmentCalls,
     * TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;

    public ExtensionPresenceEventBody dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     * Do Not Disturb status of a User extension. Connected to the DND State type. Applicable for
     * User extensions if the new communication handling service is activated on account. Enum:
     * TakeAllCalls, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatusPersonal;

    public ExtensionPresenceEventBody dndStatusPersonal(String dndStatusPersonal) {
        this.dndStatusPersonal = dndStatusPersonal;
        return this;
    }

    /** If set to `true` enables other extensions to see the extension presence status */
    public Boolean allowSeeMyPresence;

    public ExtensionPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     * Specifies if a Call Queue member extension will be able to receive Call Queue calls. Used for
     * the Agent state type. Applicable for User extensions if the new communication handling
     * service is activated on account
     */
    public Boolean acceptCallQueueCalls;

    public ExtensionPresenceEventBody acceptCallQueueCalls(Boolean acceptCallQueueCalls) {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
        return this;
    }

    /**
     * If `true` enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;

    public ExtensionPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /** If `true` enables the extension user to pick up a monitored line on hold */
    public Boolean pickUpCallsOnHold;

    public ExtensionPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /** Internal identifier of a subscription owner extension */
    public String ownerId;

    public ExtensionPresenceEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /** CX telephony status Enum: NoCall, CallConnected */
    public String cxTelephonyStatus;

    public ExtensionPresenceEventBody cxTelephonyStatus(String cxTelephonyStatus) {
        this.cxTelephonyStatus = cxTelephonyStatus;
        return this;
    }
}
