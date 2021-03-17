package com.ringcentral.definitions;


public class SwitchesList
{
    /**
         * Link to the switches list resource
         */
        public String uri;
  public SwitchesList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Switches map
         */
        public SwitchInfo[] records;
  public SwitchesList records(SwitchInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public SwitchesList navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public SwitchesList paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
