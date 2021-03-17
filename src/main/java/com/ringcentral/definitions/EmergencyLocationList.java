package com.ringcentral.definitions;


public class EmergencyLocationList
{
    /**
         */
        public EmergencyLocationInfo[] records;
  public EmergencyLocationList records(EmergencyLocationInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public EmergencyLocationList navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public EmergencyLocationList paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
