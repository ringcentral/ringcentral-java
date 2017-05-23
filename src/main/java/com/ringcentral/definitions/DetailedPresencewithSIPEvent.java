package com.ringcentral.definitions;

public class DetailedPresencewithSIPEvent {
    // Internal identifier of an extension. Optional parameter
    public String extensionId;
    // Telephony presence status. Returned if telephony status is changed. See Telephony Status Values
    public String telephonyStatus;
    // Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'Intermediate' it means the call is not actually ended, the connection is established on one of the devices
    public String terminationType;
    // Information on active calls
    public DetailedPresencewithSIPEvent_ActiveCallInfo[] activeCalls;
    // Order number of a notification to state the chronology
    public Long sequence;
    // Aggregated presence status, calculated from a number of sources
    public String presenceStatus;
    // User-defined presence status (as previously published by the user)
    public String userStatus;
    // Extended DnD (Do not Disturb) status
    public String dndStatus;
    // If 'True' enables other extensions to see the extension presence status
    public Boolean allowSeeMyPresence;
    // If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
    public Boolean ringOnMonitoredCall;
    // If 'True' enables the extension user to pick up a monitored line on hold
    public Boolean pickUpCallsOnHold;

    public DetailedPresencewithSIPEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public DetailedPresencewithSIPEvent telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public DetailedPresencewithSIPEvent terminationType(String terminationType) {
        this.terminationType = terminationType;
        return this;
    }

    public DetailedPresencewithSIPEvent activeCalls(DetailedPresencewithSIPEvent_ActiveCallInfo[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

    public DetailedPresencewithSIPEvent sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }

    public DetailedPresencewithSIPEvent presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    public DetailedPresencewithSIPEvent userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public DetailedPresencewithSIPEvent dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public DetailedPresencewithSIPEvent allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public DetailedPresencewithSIPEvent ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public DetailedPresencewithSIPEvent pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
}
