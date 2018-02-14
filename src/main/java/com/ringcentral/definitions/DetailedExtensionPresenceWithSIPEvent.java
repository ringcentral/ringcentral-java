package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DetailedExtensionPresenceWithSIPEvent
{
    // Internal identifier of an extension. Optional parameter
    public String extensionId;
    public DetailedExtensionPresenceWithSIPEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Telephony presence status. Returned if telephony status is changed.
    public String telephonyStatus;
    public DetailedExtensionPresenceWithSIPEvent telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }
    // Collection of Active Call Info
    public ActiveCallInfo[] activeCalls;
    public DetailedExtensionPresenceWithSIPEvent activeCalls(ActiveCallInfo[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }
    // Order number of a notification to state the chronology
    public Long sequence;
    public DetailedExtensionPresenceWithSIPEvent sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }
    // Aggregated presence status, calculated from a number of sources
    public String presenceStatus;
    public DetailedExtensionPresenceWithSIPEvent presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }
    // User-defined presence status (as previously published by the user)
    public String userStatus;
    public DetailedExtensionPresenceWithSIPEvent userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    // Extended DnD (Do not Disturb) status
    public String dndStatus;
    public DetailedExtensionPresenceWithSIPEvent dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }
    // If 'True' enables other extensions to see the extension presence status
    public Boolean allowSeeMyPresence;
    public DetailedExtensionPresenceWithSIPEvent allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }
    // If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
    public Boolean ringOnMonitoredCall;
    public DetailedExtensionPresenceWithSIPEvent ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }
    // If 'True' enables the extension user to pick up a monitored line on hold
    public Boolean pickUpCallsOnHold;
    public DetailedExtensionPresenceWithSIPEvent pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
}
