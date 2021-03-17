package com.ringcentral.definitions;


public class AutomaticLocationUpdatesUserList
{
    /**
         * Link to the users list resource
         */
        public String uri;
  public AutomaticLocationUpdatesUserList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public AutomaticLocationUpdatesUserInfo[] records;
  public AutomaticLocationUpdatesUserList records(AutomaticLocationUpdatesUserInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public AutomaticLocationUpdatesUserList navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public AutomaticLocationUpdatesUserList paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
