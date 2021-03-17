package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class PhoneNumberInfoConferencing
{
    /**
         */
        public GetCountryInfoConferencing country;
  public PhoneNumberInfoConferencing country(GetCountryInfoConferencing country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * 'True' if the number is default for the conference. Default conference number is a domestic number that can be set by user (otherwise it is set by the system). Only one default number per country is allowed
         */
        @SerializedName("default")
        public Boolean _default;
  public PhoneNumberInfoConferencing _default(Boolean _default)
  {
    this._default = _default;
    return this;
  }
  

        /**
         * 'True' if the greeting message is played on this number
         */
        public Boolean hasGreeting;
  public PhoneNumberInfoConferencing hasGreeting(Boolean hasGreeting)
  {
    this.hasGreeting = hasGreeting;
    return this;
  }
  

        /**
         * Location (city, region, state) of a conference phone number
         */
        public String location;
  public PhoneNumberInfoConferencing location(String location)
  {
    this.location = location;
    return this;
  }
  

        /**
         * Dial-in phone number to connect to a conference
         */
        public String phoneNumber;
  public PhoneNumberInfoConferencing phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Indicates if the number is 'premium' (account phone number with the `ConferencingNumber` usageType)
         */
        public Boolean premium;
  public PhoneNumberInfoConferencing premium(Boolean premium)
  {
    this.premium = premium;
    return this;
  }
  
}
