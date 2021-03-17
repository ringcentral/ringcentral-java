package com.ringcentral.definitions;


public class ParsePhoneNumberResponse
{
    /**
         * Canonical URI of a resource
         */
        public String uri;
  public ParsePhoneNumberResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Required
         */
        public GetCountryInfoNumberParser homeCountry;
  public ParsePhoneNumberResponse homeCountry(GetCountryInfoNumberParser homeCountry)
  {
    this.homeCountry = homeCountry;
    return this;
  }
  

        /**
         * Parsed phone numbers data
         * Required
         */
        public PhoneNumberInfoNumberParser[] phoneNumbers;
  public ParsePhoneNumberResponse phoneNumbers(PhoneNumberInfoNumberParser[] phoneNumbers)
  {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  
}
