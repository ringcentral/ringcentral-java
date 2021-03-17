package com.ringcentral.definitions;


    // Company emergency response location details
public class EmergencyLocationInfo
{
    /**
         * Internal identifier of the emergency response location
         */
        public String id;
  public EmergencyLocationInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public EmergencyLocationAddressInfo address;
  public EmergencyLocationInfo address(EmergencyLocationAddressInfo address)
  {
    this.address = address;
    return this;
  }
  

        /**
         * Emergency response location name
         */
        public String name;
  public EmergencyLocationInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public ShortSiteInfo site;
  public EmergencyLocationInfo site(ShortSiteInfo site)
  {
    this.site = site;
    return this;
  }
  

        /**
         * Emergency address status
         * Enum: Valid, Invalid
         */
        public String addressStatus;
  public EmergencyLocationInfo addressStatus(String addressStatus)
  {
    this.addressStatus = addressStatus;
    return this;
  }
  

        /**
         * Status of emergency response location usage.
         * Enum: Active, Inactive
         */
        public String usageStatus;
  public EmergencyLocationInfo usageStatus(String usageStatus)
  {
    this.usageStatus = usageStatus;
    return this;
  }
  

        /**
         * Resulting status of emergency address synchronization. Returned if `syncEmergencyAddress` parameter is set to 'True'
         * Enum: Verified, Updated, Deleted, ActivationProcess, Unsupported, Failed
         */
        public String syncStatus;
  public EmergencyLocationInfo syncStatus(String syncStatus)
  {
    this.syncStatus = syncStatus;
    return this;
  }
  

        /**
         * Visibility of an emergency response location. If `Private` is set, then location is visible only for restricted number of users, specified in `owners` array
         * Default: Public
         * Enum: Private, Public
         */
        public String visibility;
  public EmergencyLocationInfo visibility(String visibility)
  {
    this.visibility = visibility;
    return this;
  }
  

        /**
         * List of private location owners
         */
        public LocationOwnerInfo[] owners;
  public EmergencyLocationInfo owners(LocationOwnerInfo[] owners)
  {
    this.owners = owners;
    return this;
  }
  
}
