package com.ringcentral.definitions;


public class UpdateWirelessPoint
{
    /**
         * Internal identifier of a wireless point
         */
        public String id;
  public UpdateWirelessPoint id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique 48-bit identifier of wireless access point complying with MAC address conventions. Mask: XX:XX:XX:XX:XX:XX, where X can be a symbol in the range of 0-9 or A-F
         */
        public String bssid;
  public UpdateWirelessPoint bssid(String bssid)
  {
    this.bssid = bssid;
    return this;
  }
  

        /**
         * Wireless access point name
         */
        public String name;
  public UpdateWirelessPoint name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public UpdateWirelessPoint site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
  public UpdateWirelessPoint emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress)
  {
    this.emergencyAddress = emergencyAddress;
    return this;
  }
  

        /**
         * Deprecated. Internal identifier of the emergency response location (address). Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
         */
        public String emergencyLocationId;
  public UpdateWirelessPoint emergencyLocationId(String emergencyLocationId)
  {
    this.emergencyLocationId = emergencyLocationId;
    return this;
  }
  

        /**
         */
        public ERLLocationInfo emergencyLocation;
  public UpdateWirelessPoint emergencyLocation(ERLLocationInfo emergencyLocation)
  {
    this.emergencyLocation = emergencyLocation;
    return this;
  }
  
}
