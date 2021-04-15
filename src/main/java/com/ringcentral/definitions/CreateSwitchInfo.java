package com.ringcentral.definitions;


public class CreateSwitchInfo
{
    /**
         * Unique identifier of a network switch. The supported formats are: XX:XX:XX:XX:XX:XX (symbols 0-9 and A-F) for MAC address and X.X.X.X for IP address (symbols 0-255)
         * Required
         */
        public String chassisId;
  public CreateSwitchInfo chassisId(String chassisId)
  {
    this.chassisId = chassisId;
    return this;
  }
  

        /**
         * Name of a network switch
         */
        public String name;
  public CreateSwitchInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public SwitchSiteInfo site;
  public CreateSwitchInfo site(SwitchSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
  public CreateSwitchInfo emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress)
  {
    this.emergencyAddress = emergencyAddress;
    return this;
  }
  

        /**
         * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
         */
        public String emergencyLocationId;
  public CreateSwitchInfo emergencyLocationId(String emergencyLocationId)
  {
    this.emergencyLocationId = emergencyLocationId;
    return this;
  }
  

        /**
         */
        public ERLLocationInfo emergencyLocation;
  public CreateSwitchInfo emergencyLocation(ERLLocationInfo emergencyLocation)
  {
    this.emergencyLocation = emergencyLocation;
    return this;
  }
  
}