package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionPresenceEvent
{
    // Internal identifier of an extension. Optional parameter
    public String extensionId;
    public ExtensionPresenceEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    // Telephony presence status. Returned if telephony status is changed.
    public String telephonyStatus;
    public ExtensionPresenceEvent telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }
    // Order number of a notification to state the chronology
    public Long sequence;
    public ExtensionPresenceEvent sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }
    // Aggregated presence status, calculated from a number of sources
    public String presenceStatus;
    public ExtensionPresenceEvent presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }
    // User-defined presence status (as previously published by the user)
    public String userStatus;
    public ExtensionPresenceEvent userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    // Extended DnD (Do not Disturb) status
    public String dndStatus;
    public ExtensionPresenceEvent dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }
    // If 'True' enables other extensions to see the extension presence status
    public Boolean allowSeeMyPresence;
    public ExtensionPresenceEvent allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }
    // If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
    public Boolean ringOnMonitoredCall;
    public ExtensionPresenceEvent ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }
    // If 'True' enables the extension user to pick up a monitored line on hold
    public Boolean pickUpCallsOnHold;
    public ExtensionPresenceEvent pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
}
