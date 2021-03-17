package com.ringcentral.definitions;


public class UserAddress
{
    /**
         */
        public String country;
  public UserAddress country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         */
        public String locality;
  public UserAddress locality(String locality)
  {
    this.locality = locality;
    return this;
  }
  

        /**
         */
        public String postalCode;
  public UserAddress postalCode(String postalCode)
  {
    this.postalCode = postalCode;
    return this;
  }
  

        /**
         */
        public String region;
  public UserAddress region(String region)
  {
    this.region = region;
    return this;
  }
  

        /**
         */
        public String streetAddress;
  public UserAddress streetAddress(String streetAddress)
  {
    this.streetAddress = streetAddress;
    return this;
  }
  

        /**
         * Required
         * Enum: work
         */
        public String type;
  public UserAddress type(String type)
  {
    this.type = type;
    return this;
  }
  
}
