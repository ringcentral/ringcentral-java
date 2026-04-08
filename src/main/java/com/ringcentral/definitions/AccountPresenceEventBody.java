package com.ringcentral.definitions;


    /**
* Notification payload body
*/
public class AccountPresenceEventBody
{
    /**
     * Internal identifier of an extension. Optional parameter
     * Default: ~
     */
    public String extensionId;
    public AccountPresenceEventBody extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Telephony presence status. Returned if telephony status is changed
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    public AccountPresenceEventBody telephonyStatus(String telephonyStatus)
    {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     * Order number of a notification to state the chronology
     * Format: int32
     */
    public Long sequence;
    public AccountPresenceEventBody sequence(Long sequence)
    {
        this.sequence = sequence;
        return this;
    }

    /**
     * Aggregated presence status, calculated from a number of sources
     * Enum: Offline, Busy, Available
     */
    public String presenceStatus;
    public AccountPresenceEventBody presenceStatus(String presenceStatus)
    {
        this.presenceStatus = presenceStatus;
        return this;
    }

    /**
     * User-defined presence status (as previously published by the user)
     * Enum: Offline, Busy, Available
     */
    public String userStatus;
    public AccountPresenceEventBody userStatus(String userStatus)
    {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * Do Not Disturb status. Not applicable for User extensions
    * if the new communication handling service is activated on account
     * Enum: TakeAllCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly, DoNotAcceptAnyCalls, Unknown
     */
    public String dndStatus;
    public AccountPresenceEventBody dndStatus(String dndStatus)
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
    public AccountPresenceEventBody dndStatusPersonal(String dndStatusPersonal)
    {
        this.dndStatusPersonal = dndStatusPersonal;
        return this;
    }

    /**
     * Meetings presence status. Specifies if a user is on a meeting
     * Enum: Connected, Disconnected
     */
    public String meetingStatus;
    public AccountPresenceEventBody meetingStatus(String meetingStatus)
    {
        this.meetingStatus = meetingStatus;
        return this;
    }

    /**
     * If set to `true` enables other extensions to see the extension presence status
     */
    public Boolean allowSeeMyPresence;
    public AccountPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence)
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
    public AccountPresenceEventBody acceptCallQueueCalls(Boolean acceptCallQueueCalls)
    {
        this.acceptCallQueueCalls = acceptCallQueueCalls;
        return this;
    }

    /**
     * If `true` enables to ring extension phone, if any user monitored
    * by this extension is ringing
     */
    public Boolean ringOnMonitoredCall;
    public AccountPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall)
    {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }

    /**
     * If `true` enables the extension user to pick up a monitored line on hold
     */
    public Boolean pickUpCallsOnHold;
    public AccountPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold)
    {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public AccountPresenceEventBody ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }
}