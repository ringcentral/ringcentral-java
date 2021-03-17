package com.ringcentral.definitions;


public class DeviceEmergencyAddress
{
    /**
         * Name of a customer
         */
        public String customerName;
  public DeviceEmergencyAddress customerName(String customerName)
  {
    this.customerName = customerName;
    return this;
  }
  

        /**
         * Street address, line 1 - street address, P.O. box, company name, c/o
         */
        public String street;
  public DeviceEmergencyAddress street(String street)
  {
    this.street = street;
    return this;
  }
  

        /**
         * Street address, line 2 - apartment, suite, unit, building, floor, etc.
         */
        public String street2;
  public DeviceEmergencyAddress street2(String street2)
  {
    this.street2 = street2;
    return this;
  }
  

        /**
         * City name
         */
        public String city;
  public DeviceEmergencyAddress city(String city)
  {
    this.city = city;
    return this;
  }
  

        /**
         * Zip code
         */
        public String zip;
  public DeviceEmergencyAddress zip(String zip)
  {
    this.zip = zip;
    return this;
  }
  

        /**
         * State/province name
         */
        public String state;
  public DeviceEmergencyAddress state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * Internal identifier of a state
         */
        public String stateId;
  public DeviceEmergencyAddress stateId(String stateId)
  {
    this.stateId = stateId;
    return this;
  }
  

        /**
         * ISO code of a state
         */
        public String stateIsoCode;
  public DeviceEmergencyAddress stateIsoCode(String stateIsoCode)
  {
    this.stateIsoCode = stateIsoCode;
    return this;
  }
  

        /**
         * Full name of a state
         */
        public String stateName;
  public DeviceEmergencyAddress stateName(String stateName)
  {
    this.stateName = stateName;
    return this;
  }
  

        /**
         * Internal identifier of a country
         */
        public String countryId;
  public DeviceEmergencyAddress countryId(String countryId)
  {
    this.countryId = countryId;
    return this;
  }
  

        /**
         * ISO code of a country
         */
        public String countryIsoCode;
  public DeviceEmergencyAddress countryIsoCode(String countryIsoCode)
  {
    this.countryIsoCode = countryIsoCode;
    return this;
  }
  

        /**
         * Country name
         */
        public String country;
  public DeviceEmergencyAddress country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * Full name of a country
         */
        public String countryName;
  public DeviceEmergencyAddress countryName(String countryName)
  {
    this.countryName = countryName;
    return this;
  }
  
}
