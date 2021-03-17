package com.ringcentral.definitions;


    // Call session information
public class CallSessionObject
{
    /**
         * Internal identifier of a call session
         */
        public String id;
  public CallSessionObject id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public OriginInfo origin;
  public CallSessionObject origin(OriginInfo origin)
  {
    this.origin = origin;
    return this;
  }
  

        /**
         * For calls of 'Conference' type only
         */
        public String voiceCallToken;
  public CallSessionObject voiceCallToken(String voiceCallToken)
  {
    this.voiceCallToken = voiceCallToken;
    return this;
  }
  

        /**
         */
        public CallParty[] parties;
  public CallSessionObject parties(CallParty[] parties)
  {
    this.parties = parties;
    return this;
  }
  

        /**
         * Date and time of the latest session update represented in Unix time format
         */
        public String creationTime;
  public CallSessionObject creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  
}
