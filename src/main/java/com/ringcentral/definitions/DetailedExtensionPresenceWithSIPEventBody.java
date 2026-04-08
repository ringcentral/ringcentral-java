package com.ringcentral.definitions;


    /**
* Notification payload body
*/
public class DetailedExtensionPresenceWithSIPEventBody
{
    /**
     * Internal identifier of an extension
     * Default: ~
     */
    public String extensionId;
    public DetailedExtensionPresenceWithSIPEventBody extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Telephony presence status. Returned if telephony status is changed.
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    public DetailedExtensionPresenceWithSIPEventBody telephonyStatus(String telephonyStatus)
    {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * List of the latest 7 active calls on extension
     */
    public ActiveCallInfo[] activeCalls;
    public DetailedExtensionPresenceWithSIPEventBody activeCalls(ActiveCallInfo[] activeCalls)
    {
        this.activeCalls = activeCalls;
        return this;
    }

    /**
     * Order number of a notification to state the chronology
     * Format: int32
     */
    public Long sequence;
    public DetailedExtensionPresenceWithSIPEventBody sequence(Long sequence)
    {
        this.sequence = sequence;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
    public DetailedExtensionPresenceWithSIPEventBody presenceStatus(String presenceStatus)
    {
        this.presenceStatus = presenceStatus;
        return this;
    }

    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    public DetailedExtensionPresenceWithSIPEventBody userStatus(String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Meetings presence status
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
    public DetailedExtensionPresenceWithSIPEventBody meetingStatus(String meetingStatus)
    {
        this.meetingStatus = meetingStatus;
        return this;
    }

    /**
     * Do Not Disturb status. Not applicable for User extensions
    * if the new communication handling service is activated on account
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;
    public DetailedExtensionPresenceWithSIPEventBody dndStatus(String dndStatus)
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
    public DetailedExtensionPresenceWithSIPEventBody dndStatusPersonal(String dndStatusPersonal)
    {
        this.dndStatusPersonal = dndStatusPersonal;
        return this;
    }

    /**
     * If `true` enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    public DetailedExtensionPresenceWithSIPEventBody allowSeeMyPresence(Boolean allowSeeMyPresence)
    {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }

    /**
     * Specifies if a Call Queue member extension will be able to receive Call Queue calls.
    * Used for the Agent state type. Applicable for User extensions if the new communication
    * handling service is activated on account
     */
    public Boolean acceptCallQueueCalls;
    public DetailedExtensionPresenceWithSIPEventBody acceptCallQueueCalls(Boolean acceptCallQueueCalls)
    {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
        return this;
    }

    /**
     * If `true` enables to ring extension phone, if any user monitored
    * by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    public DetailedExtensionPresenceWithSIPEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall)
    {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     * If `true` enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    public DetailedExtensionPresenceWithSIPEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold)
    {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     * Total number of active calls on extension at the present moment
     * Format: int32
     */
    public Long totalActiveCalls;
    public DetailedExtensionPresenceWithSIPEventBody totalActiveCalls(Long totalActiveCalls)
    {
        this.totalActiveCalls = totalActiveCalls;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public DetailedExtensionPresenceWithSIPEventBody ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }

    /**
     */
    public AppearancesInfo appearances;
    public DetailedExtensionPresenceWithSIPEventBody appearances(AppearancesInfo appearances)
    {
        this.appearances = appearances;
        return this;
    }
}