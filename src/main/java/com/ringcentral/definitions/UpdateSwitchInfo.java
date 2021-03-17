package com.ringcentral.definitions;


public class UpdateSwitchInfo
{
    /**
         * internal identifier of a switch
         */
        public String id;
  public UpdateSwitchInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique identifier of a network switch. The supported formats are: XX:XX:XX:XX:XX:XX (symbols 0-9 and A-F) for MAC address and X.X.X.X for IP address (symbols 0-255)
         */
        public String chassisId;
  public UpdateSwitchInfo chassisId(String chassisId)
  {
    this.chassisId = chassisId;
    return this;
  }
  

        /**
         * Name of a network switch
         */
        public String name;
  public UpdateSwitchInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public SwitchSiteInfo site;
  public UpdateSwitchInfo site(SwitchSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         */
        public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
  public UpdateSwitchInfo emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress)
  {
    this.emergencyAddress = emergencyAddress;
    return this;
  }
  

        /**
         * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
         */
        public String emergencyLocationId;
  public UpdateSwitchInfo emergencyLocationId(String emergencyLocationId)
  {
    this.emergencyLocationId = emergencyLocationId;
    return this;
  }
  

        /**
         */
        public ERLLocationInfo emergencyLocation;
  public UpdateSwitchInfo emergencyLocation(ERLLocationInfo emergencyLocation)
  {
    this.emergencyLocation = emergencyLocation;
    return this;
  }
  
}
