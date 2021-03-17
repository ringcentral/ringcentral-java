package com.ringcentral.definitions;


public class GetExtensionGrantListResponse
{
    /**
         * Link to the list of extension grants
         */
        public String uri;
  public GetExtensionGrantListResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of extension grants with details
         * Required
         */
        public GrantInfo[] records;
  public GetExtensionGrantListResponse records(GrantInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningNavigationInfo navigation;
  public GetExtensionGrantListResponse navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningPagingInfo paging;
  public GetExtensionGrantListResponse paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
