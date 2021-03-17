package com.ringcentral.definitions;


    // Information on a home country of a conference phone number
public class GetCountryInfoConferencing
{
    /**
         * Internal identifier of a country
         */
        public String id;
  public GetCountryInfoConferencing id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of a country
         */
        public String uri;
  public GetCountryInfoConferencing uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Country calling code defined by ITU-T recommendations [E.123](https://www.itu.int/rec/T-REC-E.123-200102-I/en) and [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
         */
        public String callingCode;
  public GetCountryInfoConferencing callingCode(String callingCode)
  {
    this.callingCode = callingCode;
    return this;
  }
  

        /**
         * Emergency calling feature availability/emergency address requirement indicator
         */
        public Boolean emergencyCalling;
  public GetCountryInfoConferencing emergencyCalling(Boolean emergencyCalling)
  {
    this.emergencyCalling = emergencyCalling;
    return this;
  }
  

        /**
         * Country code according to the ISO standard, see [ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
         */
        public String isoCode;
  public GetCountryInfoConferencing isoCode(String isoCode)
  {
    this.isoCode = isoCode;
    return this;
  }
  

        /**
         * Official name of a country
         */
        public String name;
  public GetCountryInfoConferencing name(String name)
  {
    this.name = name;
    return this;
  }
  
}
