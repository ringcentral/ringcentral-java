package com.ringcentral.definitions;


public class PresenceInfoResponse
{
    /**
     * Link to the presence resource
     * Format: uri
     */
    public String uri;
    public PresenceInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    public PresenceInfoResponse userStatus(String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Do Not Disturb status. Not applicable for User extensions
    * if the new communication handling service is activated on account.
    * 
    * Please note: Cannot be set for Department/Announcement/Voicemail
    * (Take Messages Only)/Fax User/Shared Lines Group/Paging Only Group/IVR
    * Menu/Application Extension/Park Location extensions.
    * 
    * The &#039;DoNotAcceptDepartmentCalls&#039; and &#039;TakeDepartmentCallsOnly&#039; values
    * are applicable only for extensions - members of a Department; if these values
    * are set for department outsiders, the 400 Bad Request error code is returned.
    * 
    * The &#039;TakeDepartmentCallsOnly&#039; status can be set through the old RingCentral
    * user interface and is available for some migrated accounts only.
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;
    public PresenceInfoResponse dndStatus(String dndStatus)
    {
        this.dndStatus = dndStatus;
        return this;
    }

    /**
     * Do Not Disturb status of a User extension. Connected to the DND State type.
    * Applicable for User extensions if the new communication handling service is
    * activated on account.
     * Enum: TakeAllCalls, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatusPersonal;
    public PresenceInfoResponse dndStatusPersonal(String dndStatusPersonal)
    {
        this.dndStatusPersonal = dndStatusPersonal;
        return this;
    }

    /**
     * Specifies if a Call Queue member extension will be able to receive Call Queue calls.
    * Used for the Agent state type. Applicable for User extensions if the new communication
    * handling service is activated on account
     */
    public Boolean acceptCallQueueCalls;
    public PresenceInfoResponse acceptCallQueueCalls(Boolean acceptCallQueueCalls)
    {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
        return this;
    }

    /**
     * Custom status message (as previously published by user)
     */
    public String message;
    public PresenceInfoResponse message(String message)
    {
        this.message = message;
        return this;
    }

    /**
     * If set to `true` enables other extensions to see the extension presence status
     * Default: true
     */
    public Boolean allowSeeMyPresence;
    public PresenceInfoResponse allowSeeMyPresence(Boolean allowSeeMyPresence)
    {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     * Configures the user presence visibility. When the `allowSeeMyPresence` parameter is set to `true`,
    * the following visibility options are supported via this parameter - All, None, PermittedUsers
     * Enum: All, None, PermittedUsers
     */
    public String callerIdVisibility;
    public PresenceInfoResponse callerIdVisibility(String callerIdVisibility)
    {
        this.callerIdVisibility = callerIdVisibility;
        return this;
    }

    /**
     * If `true` enables to ring extension phone, if any user monitored
    * by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    public PresenceInfoResponse ringOnMonitoredCall(Boolean ringOnMonitoredCall)
    {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     * If `true` enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    public PresenceInfoResponse pickUpCallsOnHold(Boolean pickUpCallsOnHold)
    {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     */
    public ActiveCallInfo[] activeCalls;
    public PresenceInfoResponse activeCalls(ActiveCallInfo[] activeCalls)
    {
        this.activeCalls = activeCalls;
        return this;
    }

    /**
     */
    public GetPresenceExtensionInfo extension;
    public PresenceInfoResponse extension(GetPresenceExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Meetings presence status
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
    public PresenceInfoResponse meetingStatus(String meetingStatus)
    {
        this.meetingStatus = meetingStatus;
        return this;
    }

    /**
     * Telephony presence status. Returned if telephony status is changed
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    public PresenceInfoResponse telephonyStatus(String telephonyStatus)
    {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
    public PresenceInfoResponse presenceStatus(String presenceStatus)
    {
        this.presenceStatus = presenceStatus;
        return this;
    }

    /**
     * CX telephony status
     * Enum: NoCall, CallConnected
     */
    public String cxTelephonyStatus;
    public PresenceInfoResponse cxTelephonyStatus(String cxTelephonyStatus)
    {
        this.cxTelephonyStatus = cxTelephonyStatus;
        return this;
    }

    /**
     * Telephony status of the extension aggregated across all telephony status sources.
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String aggregatedTelephonyStatus;
    public PresenceInfoResponse aggregatedTelephonyStatus(String aggregatedTelephonyStatus)
    {
        this.aggregatedTelephonyStatus = aggregatedTelephonyStatus;
        return this;
    }
}