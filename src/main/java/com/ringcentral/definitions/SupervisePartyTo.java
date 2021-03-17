package com.ringcentral.definitions;


    // Information about a call party that is monitored
public class SupervisePartyTo
{
    /**
         * Phone number of a party
         */
        public String phoneNumber;
  public SupervisePartyTo phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Displayed name of a party
         */
        public String name;
  public SupervisePartyTo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Internal identifier of a device
         */
        public String deviceId;
  public SupervisePartyTo deviceId(String deviceId)
  {
    this.deviceId = deviceId;
    return this;
  }
  

        /**
         * Internal identifier of an extension
         */
        public String extensionId;
  public SupervisePartyTo extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  
}
