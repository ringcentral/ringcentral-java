package com.ringcentral.definitions;


    // Brief information on a phone number country
public class DevicePhoneNumberCountryInfo
{
    /**
         * Internal identifier of a home country
         */
        public String id;
  public DevicePhoneNumberCountryInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of a home country
         */
        public String uri;
  public DevicePhoneNumberCountryInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Official name of a home country
         */
        public String name;
  public DevicePhoneNumberCountryInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
