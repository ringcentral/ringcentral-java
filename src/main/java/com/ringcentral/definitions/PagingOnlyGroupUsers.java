package com.ringcentral.definitions;


public class PagingOnlyGroupUsers
{
    /**
         * Link to the list of users allowed to page the Paging Only group
         */
        public String uri;
  public PagingOnlyGroupUsers uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of users allowed to page the Paging Only group
         */
        public PagingGroupExtensionInfo[] records;
  public PagingOnlyGroupUsers records(PagingGroupExtensionInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public PagingOnlyGroupUsers navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public PagingOnlyGroupUsers paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
