package com.ringcentral.definitions;


public class SwitchInfo
{
    /**
         * Link to the network switch resource
         */
        public String uri;
  public SwitchInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a network switch
         */
        public String id;
  public SwitchInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique identifier of a network switch
         */
        public String chassisId;
  public SwitchInfo chassisId(String chassisId)
  {
    this.chassisId = chassisId;
    return this;
  }
  

        /**
         * Name of a network switch
         */
        public String name;
  public SwitchInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public SwitchSiteInfo site;
  public SwitchInfo site(SwitchSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public LocationUpdatesEmergencyAddressInfo emergencyAddress;
  public SwitchInfo emergencyAddress(LocationUpdatesEmergencyAddressInfo emergencyAddress)
  {
    this.emergencyAddress = emergencyAddress;
    return this;
  }
  

        /**
         * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
         */
        public String emergencyLocationId;
  public SwitchInfo emergencyLocationId(String emergencyLocationId)
  {
    this.emergencyLocationId = emergencyLocationId;
    return this;
  }
  

        /**
         */
        public ERLLocationInfo emergencyLocation;
  public SwitchInfo emergencyLocation(ERLLocationInfo emergencyLocation)
  {
    this.emergencyLocation = emergencyLocation;
    return this;
  }
  
}
