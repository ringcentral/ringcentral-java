package com.ringcentral.definitions;


public class GetLocationListResponse
{
    /**
         * Link to the location list resource
         */
        public String uri;
  public GetLocationListResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of locations
         */
        public LocationInfo[] records;
  public GetLocationListResponse records(LocationInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningNavigationInfo navigation;
  public GetLocationListResponse navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningPagingInfo paging;
  public GetLocationListResponse paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
