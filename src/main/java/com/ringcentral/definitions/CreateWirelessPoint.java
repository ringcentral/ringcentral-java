package com.ringcentral.definitions;


public class CreateWirelessPoint
{
    /**
         * Unique 48-bit identifier of wireless access point complying with MAC address conventions. The Mask is XX:XX:XX:XX:XX:XX, where X can be a symbol in the range of 0-9 or A-F
         * Required
         */
        public String bssid;
  public CreateWirelessPoint bssid(String bssid)
  {
    this.bssid = bssid;
    return this;
  }
  

        /**
         * Wireless access point name
         * Required
         */
        public String name;
  public CreateWirelessPoint name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public CreateWirelessPoint site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         * Required
         */
        public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
  public CreateWirelessPoint emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress)
  {
    this.emergencyAddress = emergencyAddress;
    return this;
  }
  

        /**
         * Deprecated. Internal identifier of the emergency response location (address). Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
         */
        public String emergencyLocationId;
  public CreateWirelessPoint emergencyLocationId(String emergencyLocationId)
  {
    this.emergencyLocationId = emergencyLocationId;
    return this;
  }
  

        /**
         */
        public ERLLocationInfo emergencyLocation;
  public CreateWirelessPoint emergencyLocation(ERLLocationInfo emergencyLocation)
  {
    this.emergencyLocation = emergencyLocation;
    return this;
  }
  
}
