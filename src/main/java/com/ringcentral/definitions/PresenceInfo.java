package com.ringcentral.definitions;

public class PresenceInfo {
    // Canonical URI of a presence info resource
    public String uri;
    // If 'True' enables other extensions to see the extension presence status
    public Boolean allowSeeMyPresence;
    // Extended DnD (Do not Disturb) status. Cannot be set for Department/Announcement/Voicemail (Take Messages Only)/Fax User/Shared Lines Group/Paging Only Group/IVR Menu/Application Extension/Park Location extensions. The 'DoNotAcceptDepartmentCalls' and 'TakeDepartmentCallsOnly' values are applicable only for extensions - members of a Department; if these values are set for department outsiders, the 400 Bad Request error code is returned. The 'TakeDepartmentCallsOnly' status can be set through the old RingCentral user interface and is available for some migrated accounts only.
    public String dndStatus;
    // Information on extension, for which this presence data is returned
    public PresenceInfo_ExtensionInfo extension;
    // Custom status message (as previously published by user)
    public String message;
    // If 'True' enables the extension user to pick up a monitored line on hold
    public Boolean pickUpCallsOnHold;
    // Aggregated presence status, calculated from a number of sources
    public String presenceStatus;
    // If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
    public Boolean ringOnMonitoredCall;
    // Telephony presence status
    public String telephonyStatus;
    // User-defined presence status (as previously published by the user)
    public String userStatus;

    public PresenceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PresenceInfo allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public PresenceInfo dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public PresenceInfo extension(PresenceInfo_ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public PresenceInfo message(String message) {
        this.message = message;
        return this;
    }

    public PresenceInfo pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public PresenceInfo presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    public PresenceInfo ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public PresenceInfo telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public PresenceInfo userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
}
