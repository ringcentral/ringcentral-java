package com.ringcentral.definitions;


public class GetPresenceInfo
{
    /**
     * Canonical URI of a presence info resource
     * Format: uri
     */
    public String uri;
    public GetPresenceInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * If &#039;True&#039; enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    public GetPresenceInfo allowSeeMyPresence(Boolean allowSeeMyPresence)
    {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     * Extended DnD (Do not Disturb) status. Cannot be set for Department/Announcement/Voicemail (Take Messages Only)/Fax User/Shared Lines Group/Paging Only Group/IVR Menu/Application Extension/Park Location extensions. The &#039;DoNotAcceptDepartmentCalls&#039; and &#039;TakeDepartmentCallsOnly&#039; values are applicable only for extensions - members of a Department; if these values are set for department outsiders, the 400 Bad Request error code is returned. The &#039;TakeDepartmentCallsOnly&#039; status can be set through the old RingCentral user interface and is available for some migrated accounts only.
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
     */
    public String dndStatus;
    public GetPresenceInfo dndStatus(String dndStatus)
    {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     */
    public GetPresenceExtensionInfo extension;
    public GetPresenceInfo extension(GetPresenceExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Custom status message (as previously published by user)
     */
    public String message;
    public GetPresenceInfo message(String message)
    {
        this.message = message;
        return this;
    }

    /**
     * If &#039;True&#039; enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    public GetPresenceInfo pickUpCallsOnHold(Boolean pickUpCallsOnHold)
    {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
    public GetPresenceInfo presenceStatus(String presenceStatus)
    {
        this.presenceStatus = presenceStatus;
        return this;
    }

    /**
     * If &#039;True&#039; enables to ring extension phone, if any user monitored by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    public GetPresenceInfo ringOnMonitoredCall(Boolean ringOnMonitoredCall)
    {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     * Telephony presence status
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    public GetPresenceInfo telephonyStatus(String telephonyStatus)
    {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    public GetPresenceInfo userStatus(String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * RingCentral Meetings presence
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
    public GetPresenceInfo meetingStatus(String meetingStatus)
    {
        this.meetingStatus = meetingStatus;
        return this;
    }

    /**
     * Information on active calls
     */
    public ActiveCallInfo[] activeCalls;
    public GetPresenceInfo activeCalls(ActiveCallInfo[] activeCalls)
    {
        this.activeCalls = activeCalls;
        return this;
    }
}