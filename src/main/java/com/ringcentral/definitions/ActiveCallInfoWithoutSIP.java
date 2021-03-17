package com.ringcentral.definitions;


public class ActiveCallInfoWithoutSIP
{
    /**
         * Internal identifier of a call
         */
        public String id;
  public ActiveCallInfoWithoutSIP id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Call direction
         * Enum: Inbound, Outbound
         */
        public String direction;
  public ActiveCallInfoWithoutSIP direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Identifies if a call belongs to the call queue
         */
        public Boolean queueCall;
  public ActiveCallInfoWithoutSIP queueCall(Boolean queueCall)
  {
    this.queueCall = queueCall;
    return this;
  }
  

        /**
         * Phone number or extension number of a caller. For GCM transport type '_from' property should be used
         */
        public String from;
  public ActiveCallInfoWithoutSIP from(String from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Name of a caller
         */
        public String fromName;
  public ActiveCallInfoWithoutSIP fromName(String fromName)
  {
    this.fromName = fromName;
    return this;
  }
  

        /**
         * Phone number or extension number of a callee
         */
        public String to;
  public ActiveCallInfoWithoutSIP to(String to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * Name of a callee
         */
        public String toName;
  public ActiveCallInfoWithoutSIP toName(String toName)
  {
    this.toName = toName;
    return this;
  }
  

        /**
         * Internal identifier of a call party
         */
        public String partyId;
  public ActiveCallInfoWithoutSIP partyId(String partyId)
  {
    this.partyId = partyId;
    return this;
  }
  

        /**
         * Time when the call is actually started
         */
        public String startTime;
  public ActiveCallInfoWithoutSIP startTime(String startTime)
  {
    this.startTime = startTime;
    return this;
  }
  

        /**
         * Internal identifier of a call session
         */
        public String sessionId;
  public ActiveCallInfoWithoutSIP sessionId(String sessionId)
  {
    this.sessionId = sessionId;
    return this;
  }
  

        /**
         * Telephony call status
         * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
         */
        public String telephonyStatus;
  public ActiveCallInfoWithoutSIP telephonyStatus(String telephonyStatus)
  {
    this.telephonyStatus = telephonyStatus;
    return this;
  }
  

        /**
         * Telephony identifier of a call session
         */
        public String telephonySessionId;
  public ActiveCallInfoWithoutSIP telephonySessionId(String telephonySessionId)
  {
    this.telephonySessionId = telephonySessionId;
    return this;
  }
  

        /**
         * Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'intermediate' it means the call is not actually ended, the connection is established on one of the devices
         * Enum: final, intermediate
         */
        public String terminationType;
  public ActiveCallInfoWithoutSIP terminationType(String terminationType)
  {
    this.terminationType = terminationType;
    return this;
  }
  

        /**
         */
        public CallInfoCQ callInfo;
  public ActiveCallInfoWithoutSIP callInfo(CallInfoCQ callInfo)
  {
    this.callInfo = callInfo;
    return this;
  }
  
}
