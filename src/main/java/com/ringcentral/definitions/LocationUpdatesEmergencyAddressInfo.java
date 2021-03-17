package com.ringcentral.definitions;


    // Emergency address information (or information assigned to the switch or wireless point - in case of using them). Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
public class LocationUpdatesEmergencyAddressInfo
{
    /**
         * Country name
         */
        public String country;
  public LocationUpdatesEmergencyAddressInfo country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * Internal identifier of a country
         */
        public String countryId;
  public LocationUpdatesEmergencyAddressInfo countryId(String countryId)
  {
    this.countryId = countryId;
    return this;
  }
  

        /**
         * ISO code of a country
         */
        public String countryIsoCode;
  public LocationUpdatesEmergencyAddressInfo countryIsoCode(String countryIsoCode)
  {
    this.countryIsoCode = countryIsoCode;
    return this;
  }
  

        /**
         * Full name of a country
         */
        public String countryName;
  public LocationUpdatesEmergencyAddressInfo countryName(String countryName)
  {
    this.countryName = countryName;
    return this;
  }
  

        /**
         * Customer name
         */
        public String customerName;
  public LocationUpdatesEmergencyAddressInfo customerName(String customerName)
  {
    this.customerName = customerName;
    return this;
  }
  

        /**
         * State/Province name. Mandatory for the USA, the UK and Canada
         */
        public String state;
  public LocationUpdatesEmergencyAddressInfo state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * Internal identifier of a state
         */
        public String stateId;
  public LocationUpdatesEmergencyAddressInfo stateId(String stateId)
  {
    this.stateId = stateId;
    return this;
  }
  

        /**
         * ISO code of a state
         */
        public String stateIsoCode;
  public LocationUpdatesEmergencyAddressInfo stateIsoCode(String stateIsoCode)
  {
    this.stateIsoCode = stateIsoCode;
    return this;
  }
  

        /**
         * Full name of a state
         */
        public String stateName;
  public LocationUpdatesEmergencyAddressInfo stateName(String stateName)
  {
    this.stateName = stateName;
    return this;
  }
  

        /**
         * City name
         */
        public String city;
  public LocationUpdatesEmergencyAddressInfo city(String city)
  {
    this.city = city;
    return this;
  }
  

        /**
         * First line address
         */
        public String street;
  public LocationUpdatesEmergencyAddressInfo street(String street)
  {
    this.street = street;
    return this;
  }
  

        /**
         * Second line address (apartment, suite, unit, building, floor, etc.)
         */
        public String street2;
  public LocationUpdatesEmergencyAddressInfo street2(String street2)
  {
    this.street2 = street2;
    return this;
  }
  

        /**
         * Postal (Zip) code
         */
        public String zip;
  public LocationUpdatesEmergencyAddressInfo zip(String zip)
  {
    this.zip = zip;
    return this;
  }
  
}
