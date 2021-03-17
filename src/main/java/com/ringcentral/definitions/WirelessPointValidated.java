package com.ringcentral.definitions;


public class WirelessPointValidated
{
    /**
         * Internal identifier of a wireless point
         */
        public String id;
  public WirelessPointValidated id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique 48-bit identifier of the wireless access point complying with MAC address conventions
         */
        public String bssid;
  public WirelessPointValidated bssid(String bssid)
  {
    this.bssid = bssid;
    return this;
  }
  

        /**
         * Validation result status
         * Enum: Valid, Invalid
         */
        public String status;
  public WirelessPointValidated status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public ValidationError[] errors;
  public WirelessPointValidated errors(ValidationError[] errors)
  {
    this.errors = errors;
    return this;
  }
  
}
