package com.ringcentral.definitions;


public class WirelessPointInfo
{
    /**
         * Link to the wireless point resource
         */
        public String uri;
  public WirelessPointInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a wireless point
         */
        public String id;
  public WirelessPointInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique 48-bit identifier of the wireless access point complying with MAC address conventions
         */
        public String bssid;
  public WirelessPointInfo bssid(String bssid)
  {
    this.bssid = bssid;
    return this;
  }
  

        /**
         * Wireless access point name
         */
        public String name;
  public WirelessPointInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesSiteInfo site;
  public WirelessPointInfo site(AutomaticLocationUpdatesSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public LocationUpdatesEmergencyAddressInfo emergencyAddress;
  public WirelessPointInfo emergencyAddress(LocationUpdatesEmergencyAddressInfo emergencyAddress)
  {
    this.emergencyAddress = emergencyAddress;
    return this;
  }
  

        /**
         */
        public ERLLocationInfo emergencyLocation;
  public WirelessPointInfo emergencyLocation(ERLLocationInfo emergencyLocation)
  {
    this.emergencyLocation = emergencyLocation;
    return this;
  }
  

        /**
         * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
         */
        public String emergencyLocationId;
  public WirelessPointInfo emergencyLocationId(String emergencyLocationId)
  {
    this.emergencyLocationId = emergencyLocationId;
    return this;
  }
  
}
