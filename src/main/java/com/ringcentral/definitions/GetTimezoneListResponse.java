package com.ringcentral.definitions;


public class GetTimezoneListResponse
{
    /**
         * Link to the timezone list resource
         */
        public String uri;
  public GetTimezoneListResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of timezones
         * Required
         */
        public GetTimezoneInfoResponse[] records;
  public GetTimezoneListResponse records(GetTimezoneInfoResponse[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningNavigationInfo navigation;
  public GetTimezoneListResponse navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningPagingInfo paging;
  public GetTimezoneListResponse paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
