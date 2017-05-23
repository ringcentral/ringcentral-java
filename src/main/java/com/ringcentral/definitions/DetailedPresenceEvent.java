package com.ringcentral.definitions;

public class DetailedPresenceEvent {
    // Internal identifier of an extension. Optional parameter
    public String extensionId;
    // Telephony presence status. Returned if telephony status is changed. See Telephony Status Values
    public String telephonyStatus;
    // Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'Intermediate' it means the call is not actually ended, the connection is established on one of the devices
    public String terminationType;
    // Collection of Active Call Info
    public DetailedPresenceEvent_ActiveCallInfo[] activeCalls;
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
}
