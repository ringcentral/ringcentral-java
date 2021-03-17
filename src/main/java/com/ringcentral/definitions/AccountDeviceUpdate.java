package com.ringcentral.definitions;


public class AccountDeviceUpdate
{
    /**
         */
        public EmergencyServiceAddressResourceRequest emergencyServiceAddress;
  public AccountDeviceUpdate emergencyServiceAddress(EmergencyServiceAddressResourceRequest emergencyServiceAddress)
  {
    this.emergencyServiceAddress = emergencyServiceAddress;
    return this;
  }
  

        /**
         */
        public DeviceEmergencyInfo emergency;
  public AccountDeviceUpdate emergency(DeviceEmergencyInfo emergency)
  {
    this.emergency = emergency;
    return this;
  }
  

        /**
         */
        public DeviceUpdateExtensionInfo extension;
  public AccountDeviceUpdate extension(DeviceUpdateExtensionInfo extension)
  {
    this.extension = extension;
    return this;
  }
  

        /**
         */
        public DeviceUpdatePhoneLinesInfo phoneLines;
  public AccountDeviceUpdate phoneLines(DeviceUpdatePhoneLinesInfo phoneLines)
  {
    this.phoneLines = phoneLines;
    return this;
  }
  

        /**
         * Supported only for devices assigned to Limited extensions. If true, enables users to log in to this phone as a common phone.
         */
        public Boolean useAsCommonPhone;
  public AccountDeviceUpdate useAsCommonPhone(Boolean useAsCommonPhone)
  {
    this.useAsCommonPhone = useAsCommonPhone;
    return this;
  }
  
}
