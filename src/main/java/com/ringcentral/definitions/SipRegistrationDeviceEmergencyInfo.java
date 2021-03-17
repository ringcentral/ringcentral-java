package com.ringcentral.definitions;


    // Emergency response location settings of a device
public class SipRegistrationDeviceEmergencyInfo
{
    /**
         */
        public DeviceEmergencyServiceAddressResource address;
  public SipRegistrationDeviceEmergencyInfo address(DeviceEmergencyServiceAddressResource address)
  {
    this.address = address;
    return this;
  }
  

        /**
         */
        public SipRegistrationDeviceLocationInfo location;
  public SipRegistrationDeviceEmergencyInfo location(SipRegistrationDeviceLocationInfo location)
  {
    this.location = location;
    return this;
  }
  

        /**
         * Specifies if emergency address is out of country
         */
        public Boolean outOfCountry;
  public SipRegistrationDeviceEmergencyInfo outOfCountry(Boolean outOfCountry)
  {
    this.outOfCountry = outOfCountry;
    return this;
  }
  

        /**
         * Emergency address status
         * Enum: Valid, Invalid
         */
        public String addressStatus;
  public SipRegistrationDeviceEmergencyInfo addressStatus(String addressStatus)
  {
    this.addressStatus = addressStatus;
    return this;
  }
  

        /**
         * Resulting status of emergency address synchronization. Returned if `syncEmergencyAddress` parameter is set to 'True'
         * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
         */
        public String syncStatus;
  public SipRegistrationDeviceEmergencyInfo syncStatus(String syncStatus)
  {
    this.syncStatus = syncStatus;
    return this;
  }
  

        /**
         * Ability to register new emergency address for a phone line using devices sharing this line or only main device (line owner)
         * Enum: MainDevice, AnyDevice
         */
        public String addressEditableStatus;
  public SipRegistrationDeviceEmergencyInfo addressEditableStatus(String addressEditableStatus)
  {
    this.addressEditableStatus = addressEditableStatus;
    return this;
  }
  

        /**
         * 'True' if emergency address is required for the country of a phone line
         */
        public Boolean addressRequired;
  public SipRegistrationDeviceEmergencyInfo addressRequired(Boolean addressRequired)
  {
    this.addressRequired = addressRequired;
    return this;
  }
  

        /**
         * 'True' if out of country emergency address is not allowed for the country of a phone line
         */
        public Boolean addressLocationOnly;
  public SipRegistrationDeviceEmergencyInfo addressLocationOnly(Boolean addressLocationOnly)
  {
    this.addressLocationOnly = addressLocationOnly;
    return this;
  }
  
}
