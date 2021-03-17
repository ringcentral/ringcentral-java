package com.ringcentral.definitions;


    // Emergency address assigned to the switch. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
public class LocationUpdatesEmergencyAddressInfoRequest
{
    /**
         * Country name
         */
        public String country;
  public LocationUpdatesEmergencyAddressInfoRequest country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * Internal identifier of a country
         */
        public String countryId;
  public LocationUpdatesEmergencyAddressInfoRequest countryId(String countryId)
  {
    this.countryId = countryId;
    return this;
  }
  

        /**
         * ISO code of a country
         */
        public String countryIsoCode;
  public LocationUpdatesEmergencyAddressInfoRequest countryIsoCode(String countryIsoCode)
  {
    this.countryIsoCode = countryIsoCode;
    return this;
  }
  

        /**
         * Full name of a country
         */
        public String countryName;
  public LocationUpdatesEmergencyAddressInfoRequest countryName(String countryName)
  {
    this.countryName = countryName;
    return this;
  }
  

        /**
         * Customer name
         */
        public String customerName;
  public LocationUpdatesEmergencyAddressInfoRequest customerName(String customerName)
  {
    this.customerName = customerName;
    return this;
  }
  

        /**
         * State/Province name. Mandatory for the USA, the UK and Canada
         */
        public String state;
  public LocationUpdatesEmergencyAddressInfoRequest state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * Internal identifier of a state
         */
        public String stateId;
  public LocationUpdatesEmergencyAddressInfoRequest stateId(String stateId)
  {
    this.stateId = stateId;
    return this;
  }
  

        /**
         * ISO code of a state
         */
        public String stateIsoCode;
  public LocationUpdatesEmergencyAddressInfoRequest stateIsoCode(String stateIsoCode)
  {
    this.stateIsoCode = stateIsoCode;
    return this;
  }
  

        /**
         * Full name of a state
         */
        public String stateName;
  public LocationUpdatesEmergencyAddressInfoRequest stateName(String stateName)
  {
    this.stateName = stateName;
    return this;
  }
  

        /**
         * City name
         */
        public String city;
  public LocationUpdatesEmergencyAddressInfoRequest city(String city)
  {
    this.city = city;
    return this;
  }
  

        /**
         * First line address
         */
        public String street;
  public LocationUpdatesEmergencyAddressInfoRequest street(String street)
  {
    this.street = street;
    return this;
  }
  

        /**
         * Second line address (apartment, suite, unit, building, floor, etc.)
         */
        public String street2;
  public LocationUpdatesEmergencyAddressInfoRequest street2(String street2)
  {
    this.street2 = street2;
    return this;
  }
  

        /**
         * Postal (Zip) code
         */
        public String zip;
  public LocationUpdatesEmergencyAddressInfoRequest zip(String zip)
  {
    this.zip = zip;
    return this;
  }
  
}
