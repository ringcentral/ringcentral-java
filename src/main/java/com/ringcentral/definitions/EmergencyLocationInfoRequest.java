package com.ringcentral.definitions;


public class EmergencyLocationInfoRequest
{
    /**
         * Internal identifier of the emergency response location
         */
        public String id;
  public EmergencyLocationInfoRequest id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public EmergencyLocationAddressInfo address;
  public EmergencyLocationInfoRequest address(EmergencyLocationAddressInfo address)
  {
    this.address = address;
    return this;
  }
  

        /**
         * Emergency response location name
         */
        public String name;
  public EmergencyLocationInfoRequest name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public ShortSiteInfo site;
  public EmergencyLocationInfoRequest site(ShortSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         * Emergency address status
         * Enum: Valid, Invalid
         */
        public String addressStatus;
  public EmergencyLocationInfoRequest addressStatus(String addressStatus)
  {
    this.addressStatus = addressStatus;
    return this;
  }
  

        /**
         * Status of emergency response location usage.
         * Enum: Active, Inactive
         */
        public String usageStatus;
  public EmergencyLocationInfoRequest usageStatus(String usageStatus)
  {
    this.usageStatus = usageStatus;
    return this;
  }
  

        /**
         * Visibility of an emergency response location. If `Private` is set, then location is visible only for restricted number of users, specified in `owners` array
         * Default: Public
         * Enum: Private, Public
         */
        public String visibility;
  public EmergencyLocationInfoRequest visibility(String visibility)
  {
    this.visibility = visibility;
    return this;
  }
  

        /**
         * List of private location owners
         */
        public LocationOwnerInfo[] owners;
  public EmergencyLocationInfoRequest owners(LocationOwnerInfo[] owners)
  {
    this.owners = owners;
    return this;
  }
  
}
