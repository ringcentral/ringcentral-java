package com.ringcentral.definitions;


public class GetPresenceInfo {
    /**
     * Canonical URI of a presence info resource
     */
    public String uri;
    /**
     * If 'True' enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    /**
     * Extended DnD (Do not Disturb) status. Cannot be set for Department/Announcement/Voicemail (Take Messages Only)/Fax User/Shared Lines Group/Paging Only Group/IVR Menu/Application Extension/Park Location extensions. The 'DoNotAcceptDepartmentCalls' and 'TakeDepartmentCallsOnly' values are applicable only for extensions - members of a Department; if these values are set for department outsiders, the 400 Bad Request error code is returned. The 'TakeDepartmentCallsOnly' status can be set through the old RingCentral user interface and is available for some migrated accounts only.
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
     */
    public String dndStatus;
    /**
     * Information on extension, for which this presence data is returned
     */
    public GetPresenceExtensionInfo extension;
    /**
     * Custom status message (as previously published by user)
     */
    public String message;
    /**
     * If 'True' enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
    /**
     * If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    /**
     * Telephony presence status
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    /**
     * RingCentral Meetings presence
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
    /**
     * Information on active calls
     */
    public ActiveCallInfo[] activeCalls;

    public GetPresenceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetPresenceInfo allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    public GetPresenceInfo dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }

    public GetPresenceInfo extension(GetPresenceExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public GetPresenceInfo message(String message) {
        this.message = message;
        return this;
    }

    public GetPresenceInfo pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    public GetPresenceInfo presenceStatus(String presenceStatus) {
        this.presenceStatus = presenceStatus;
        return this;
    }

    public GetPresenceInfo ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    public GetPresenceInfo telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public GetPresenceInfo userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public GetPresenceInfo meetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus;
        return this;
    }

    public GetPresenceInfo activeCalls(ActiveCallInfo[] activeCalls) {
        this.activeCalls = activeCalls;
        return this;
    }

}
