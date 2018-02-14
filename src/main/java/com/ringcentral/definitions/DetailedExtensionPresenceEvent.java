package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DetailedExtensionPresenceEvent
{
    // Internal identifier of an extension. Optional parameter
    public String extensionId;
    public DetailedExtensionPresenceEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Telephony presence status. Returned if telephony status is changed.
    public String telephonyStatus;
    public DetailedExtensionPresenceEvent telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }
    // Collection of Active Call Info
    public ActiveCallInfoWithoutSIP[] activeCalls;
    public DetailedExtensionPresenceEvent activeCalls(ActiveCallInfoWithoutSIP[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }
    // Order number of a notification to state the chronology
    public Long sequence;
    public DetailedExtensionPresenceEvent sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }
    // Aggregated presence status, calculated from a number of sources
    public String presenceStatus;
    public DetailedExtensionPresenceEvent presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }
    // User-defined presence status (as previously published by the user)
    public String userStatus;
    public DetailedExtensionPresenceEvent userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    // Extended DnD (Do not Disturb) status
    public String dndStatus;
    public DetailedExtensionPresenceEvent dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }
    // If 'True' enables other extensions to see the extension presence status
    public Boolean allowSeeMyPresence;
    public DetailedExtensionPresenceEvent allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }
    // If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
    public Boolean ringOnMonitoredCall;
    public DetailedExtensionPresenceEvent ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }
    // If 'True' enables the extension user to pick up a monitored line on hold
    public Boolean pickUpCallsOnHold;
    public DetailedExtensionPresenceEvent pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
}
