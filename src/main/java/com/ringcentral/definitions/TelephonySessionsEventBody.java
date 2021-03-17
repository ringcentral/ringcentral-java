package com.ringcentral.definitions;


    // Notification payload body
public class TelephonySessionsEventBody
{
    /**
         * Order number of a notification to state the chronology
         */
        public Long sequence;
  public TelephonySessionsEventBody sequence(Long sequence)
  {
    this.sequence = sequence;
    return this;
  }
  

        /**
         * Legacy identifier of a call session
         */
        public String sessionId;
  public TelephonySessionsEventBody sessionId(String sessionId)
  {
    this.sessionId = sessionId;
    return this;
  }
  

        /**
         * Call session identifier, required for Telephony API
         */
        public String telephonySessionId;
  public TelephonySessionsEventBody telephonySessionId(String telephonySessionId)
  {
    this.telephonySessionId = telephonySessionId;
    return this;
  }
  

        /**
         * Identifier of a server
         */
        public String serverId;
  public TelephonySessionsEventBody serverId(String serverId)
  {
    this.serverId = serverId;
    return this;
  }
  

        /**
         * The call start datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
         */
        public String eventTime;
  public TelephonySessionsEventBody eventTime(String eventTime)
  {
    this.eventTime = eventTime;
    return this;
  }
  

        /**
         */
        public OriginInfo origin;
  public TelephonySessionsEventBody origin(OriginInfo origin)
  {
    this.origin = origin;
    return this;
  }
  

        /**
         * Call participants details
         */
        public TelephonySessionsEventPartyInfo[] parties;
  public TelephonySessionsEventBody parties(TelephonySessionsEventPartyInfo[] parties)
  {
    this.parties = parties;
    return this;
  }
  
}
