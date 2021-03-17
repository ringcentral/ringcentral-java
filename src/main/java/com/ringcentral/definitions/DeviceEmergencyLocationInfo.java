package com.ringcentral.definitions;


    // Company emergency response location details
public class DeviceEmergencyLocationInfo
{
    /**
         * Internal identifier of the emergency response location
         */
        public String id;
  public DeviceEmergencyLocationInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Location name
         */
        public String name;
  public DeviceEmergencyLocationInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
