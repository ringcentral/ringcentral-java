package com.ringcentral.definitions;


public class ExtensionContactInfo
{
    /**
         * For User extension type only. Extension user first name
         */
        public String firstName;
  public ExtensionContactInfo firstName(String firstName)
  {
    this.firstName = firstName;
    return this;
  }
  

        /**
         * For User extension type only. Extension user last name
         */
        public String lastName;
  public ExtensionContactInfo lastName(String lastName)
  {
    this.lastName = lastName;
    return this;
  }
  

        /**
         * Extension user company name
         */
        public String company;
  public ExtensionContactInfo company(String company)
  {
    this.company = company;
    return this;
  }
  

        /**
         * Email of extension user
         */
        public String email;
  public ExtensionContactInfo email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * Extension user contact phone number
         */
        public String businessPhone;
  public ExtensionContactInfo businessPhone(String businessPhone)
  {
    this.businessPhone = businessPhone;
    return this;
  }
  

        /**
         */
        public ContactAddressInfoDevices businessAddress;
  public ExtensionContactInfo businessAddress(ContactAddressInfoDevices businessAddress)
  {
    this.businessAddress = businessAddress;
    return this;
  }
  
}
