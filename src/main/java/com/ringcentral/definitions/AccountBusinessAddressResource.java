package com.ringcentral.definitions;


public class AccountBusinessAddressResource
{
    /**
         */
        public String uri;
  public AccountBusinessAddressResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public ContactBusinessAddressInfo businessAddress;
  public AccountBusinessAddressResource businessAddress(ContactBusinessAddressInfo businessAddress)
  {
    this.businessAddress = businessAddress;
    return this;
  }
  

        /**
         */
        public String company;
  public AccountBusinessAddressResource company(String company)
  {
    this.company = company;
    return this;
  }
  

        /**
         */
        public String email;
  public AccountBusinessAddressResource email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * Custom site name
         */
        public String mainSiteName;
  public AccountBusinessAddressResource mainSiteName(String mainSiteName)
  {
    this.mainSiteName = mainSiteName;
    return this;
  }
  
}
