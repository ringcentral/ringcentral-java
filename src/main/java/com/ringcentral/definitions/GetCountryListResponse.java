package com.ringcentral.definitions;


public class GetCountryListResponse
{
    /**
         * Link to the list of countries supported
         */
        public String uri;
  public GetCountryListResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of countries with the country data
         * Required
         */
        public GetCountryInfoDictionaryResponse[] records;
  public GetCountryListResponse records(GetCountryInfoDictionaryResponse[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningNavigationInfo navigation;
  public GetCountryListResponse navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningPagingInfo paging;
  public GetCountryListResponse paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
