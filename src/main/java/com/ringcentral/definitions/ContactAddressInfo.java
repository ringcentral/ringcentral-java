package com.ringcentral.definitions;


public class ContactAddressInfo
{
    /**
         * Street address
         */
        public String street;
  public ContactAddressInfo street(String street)
  {
    this.street = street;
    return this;
  }
  

        /**
         * City name
         */
        public String city;
  public ContactAddressInfo city(String city)
  {
    this.city = city;
    return this;
  }
  

        /**
         * Country name
         */
        public String country;
  public ContactAddressInfo country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * State/province name
         */
        public String state;
  public ContactAddressInfo state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * Zip/Postal code
         */
        public String zip;
  public ContactAddressInfo zip(String zip)
  {
    this.zip = zip;
    return this;
  }
  
}
