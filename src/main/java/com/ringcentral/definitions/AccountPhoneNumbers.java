package com.ringcentral.definitions;


public class AccountPhoneNumbers
{
    /**
         * Link to the list of account phone numbers
         */
        public String uri;
  public AccountPhoneNumbers uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of account phone numbers
         */
        public CompanyPhoneNumberInfo[] records;
  public AccountPhoneNumbers records(CompanyPhoneNumberInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public ProvisioningNavigationInfo navigation;
  public AccountPhoneNumbers navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public ProvisioningPagingInfo paging;
  public AccountPhoneNumbers paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
