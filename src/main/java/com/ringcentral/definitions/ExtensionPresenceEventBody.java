package com.ringcentral.definitions;


    // Notification payload body
public class ExtensionPresenceEventBody
{
    /**
         * Internal identifier of an extension. Optional parameter
         * Default: ~
         */
        public String extensionId;
  public ExtensionPresenceEventBody extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         * Telephony presence status. Returned if telephony status is changed.
         * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
         */
        public String telephonyStatus;
  public ExtensionPresenceEventBody telephonyStatus(String telephonyStatus)
  {
    this.telephonyStatus = telephonyStatus;
    return this;
  }
  

        /**
         * Order number of a notification to state the chronology
         */
        public Long sequence;
  public ExtensionPresenceEventBody sequence(Long sequence)
  {
    this.sequence = sequence;
    return this;
  }
  

        /**
         * Aggregated presence status, calculated from a number of sources
         * Enum: Offline, Busy, Available
         */
        public String presenceStatus;
  public ExtensionPresenceEventBody presenceStatus(String presenceStatus)
  {
    this.presenceStatus = presenceStatus;
    return this;
  }
  

        /**
         * User-defined presence status (as previously published by the user)
         * Enum: Offline, Busy, Available
         */
        public String userStatus;
  public ExtensionPresenceEventBody userStatus(String userStatus)
  {
    this.userStatus = userStatus;
    return this;
  }
  

        /**
         * Extended DnD (Do not Disturb) status
         * Enum: TakeAllCalls, DoNotAcceptAnyCalls, DoNotAcceptDepartmentCalls, TakeDepartmentCallsOnly
         */
        public String dndStatus;
  public ExtensionPresenceEventBody dndStatus(String dndStatus)
  {
    this.dndStatus = dndStatus;
    return this;
  }
  

        /**
         * If 'True' enables other extensions to see the extension presence status
         */
        public Boolean allowSeeMyPresence;
  public ExtensionPresenceEventBody allowSeeMyPresence(Boolean allowSeeMyPresence)
  {
    this.allowSeeMyPresence = allowSeeMyPresence;
    return this;
  }
  

        /**
         * If 'True' enables to ring extension phone, if any user monitored by this extension is ringing
         */
        public Boolean ringOnMonitoredCall;
  public ExtensionPresenceEventBody ringOnMonitoredCall(Boolean ringOnMonitoredCall)
  {
    this.ringOnMonitoredCall = ringOnMonitoredCall;
    return this;
  }
  

        /**
         * If 'True' enables the extension user to pick up a monitored line on hold
         */
        public Boolean pickUpCallsOnHold;
  public ExtensionPresenceEventBody pickUpCallsOnHold(Boolean pickUpCallsOnHold)
  {
    this.pickUpCallsOnHold = pickUpCallsOnHold;
    return this;
  }
  

        /**
         * Internal identifier of a subscription owner extension
         */
        public String ownerId;
  public ExtensionPresenceEventBody ownerId(String ownerId)
  {
    this.ownerId = ownerId;
    return this;
  }
  
}
