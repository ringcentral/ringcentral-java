package com.ringcentral.definitions;


    // Business address of extension user company
public class ContactAddressInfoDevices
{
    /**
         * Country name of extension user company. Not returned for Address Book
         */
        public String country;
  public ContactAddressInfoDevices country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * State/province name of extension user company
         */
        public String state;
  public ContactAddressInfoDevices state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * City name of extension user company
         */
        public String city;
  public ContactAddressInfoDevices city(String city)
  {
    this.city = city;
    return this;
  }
  

        /**
         * Street address of extension user company
         */
        public String street;
  public ContactAddressInfoDevices street(String street)
  {
    this.street = street;
    return this;
  }
  

        /**
         * Zip code of extension user company
         */
        public String zip;
  public ContactAddressInfoDevices zip(String zip)
  {
    this.zip = zip;
    return this;
  }
  
}
