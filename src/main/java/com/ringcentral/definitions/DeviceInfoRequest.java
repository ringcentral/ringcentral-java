package com.ringcentral.definitions;


    // Device information
public class DeviceInfoRequest
{
    /**
         * Device unique identifier, retrieved at previous session (if any)
         */
        public String id;
  public DeviceInfoRequest id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Supported for iOS devices only. Certificate name (used by iOS applications for APNS subscription)
         */
        public String appExternalId;
  public DeviceInfoRequest appExternalId(String appExternalId)
  {
    this.appExternalId = appExternalId;
    return this;
  }
  

        /**
         * Supported for SoftPhone only. Computer name
         */
        public String computerName;
  public DeviceInfoRequest computerName(String computerName)
  {
    this.computerName = computerName;
    return this;
  }
  

        /**
         * Serial number for HardPhone; `endpoint_id` for softphone and mobile applications. Returned only when the phone is shipped and provisioned
         */
        public String serial;
  public DeviceInfoRequest serial(String serial)
  {
    this.serial = serial;
    return this;
  }
  
}
