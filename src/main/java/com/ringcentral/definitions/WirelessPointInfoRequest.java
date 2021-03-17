package com.ringcentral.definitions;


public class WirelessPointInfoRequest
{
    /**
         * Internal identifier of a wireless point
         */
        public String id;
  public WirelessPointInfoRequest id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique 48-bit identifier of the wireless access point complying with MAC address conventions
         */
        public String bssid;
  public WirelessPointInfoRequest bssid(String bssid)
  {
    this.bssid = bssid;
    return this;
  }
  

        /**
         * Wireless access point name
         */
        public String name;
  public WirelessPointInfoRequest name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public WirelessPointInfoRequest site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
  public WirelessPointInfoRequest emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress)
  {
    this.emergencyAddress = emergencyAddress;
    return this;
  }
  

        /**
         * Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
         */
        public String emergencyLocationId;
  public WirelessPointInfoRequest emergencyLocationId(String emergencyLocationId)
  {
    this.emergencyLocationId = emergencyLocationId;
    return this;
  }
  
}
