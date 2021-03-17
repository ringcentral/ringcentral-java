package com.ringcentral.definitions;


public class ConferencingSettingsInfo
{
    /**
         * Delegated access code for a host user
         */
        public String hostCode;
  public ConferencingSettingsInfo hostCode(String hostCode)
  {
    this.hostCode = hostCode;
    return this;
  }
  

        /**
         * Delegated access code for a participant user
         */
        public String participantCode;
  public ConferencingSettingsInfo participantCode(String participantCode)
  {
    this.participantCode = participantCode;
    return this;
  }
  
}
