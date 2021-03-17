package com.ringcentral.definitions;


public class GetExtensionListResponse
{
    /**
         * Link to the extension list resource
         */
        public String uri;
  public GetExtensionListResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of extensions with extension information
         * Required
         */
        public GetExtensionListInfoResponse[] records;
  public GetExtensionListResponse records(GetExtensionListInfoResponse[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public GetExtensionListResponse navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public GetExtensionListResponse paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
