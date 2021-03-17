package com.ringcentral.definitions;


public class WirelessPointsList
{
    /**
         * Link to the wireless point list resource
         */
        public String uri;
  public WirelessPointsList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of wireless points with assigned emergency addresses
         */
        public WirelessPointInfo[] records;
  public WirelessPointsList records(WirelessPointInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public WirelessPointsList navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public WirelessPointsList paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
