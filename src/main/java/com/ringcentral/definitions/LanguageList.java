package com.ringcentral.definitions;


public class LanguageList
{
    /**
         * Canonical URI of the language list resource
         */
        public String uri;
  public LanguageList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Language data
         */
        public LanguageInfo[] records;
  public LanguageList records(LanguageInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public LanguageList navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public LanguageList paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
