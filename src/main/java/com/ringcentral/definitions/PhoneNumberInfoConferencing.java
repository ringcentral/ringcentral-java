package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class PhoneNumberInfoConferencing {
    /**
     *
     */
    public CountryInfoShortModel country;
    /**
     * The value should be `true` if the number is default for the conference. Default
     * conference number is a domestic number that can be set by user (otherwise
     * it is set by the system). Only one default number per country is allowed
     */
    @SerializedName("default")
    public Boolean _default;
    /**
     * The value should be `true` if any greeting message is played on this number
     */
    public Boolean hasGreeting;
    /**
     * Location (city, region, state) of a conference phone number
     */
    public String location;
    /**
     * Dial-in phone number to connect to a conference
     */
    public String phoneNumber;
    /**
     * Indicates if the number is &#039;premium&#039; (account phone number
     * with the `ConferencingNumber` usageType)
     */
    public Boolean premium;

    public PhoneNumberInfoConferencing country(CountryInfoShortModel country) {
        this.country = country;
        return this;
    }

    public PhoneNumberInfoConferencing _default(Boolean _default) {
        this._default = _default;
        return this;
    }

    public PhoneNumberInfoConferencing hasGreeting(Boolean hasGreeting) {
        this.hasGreeting = hasGreeting;
        return this;
    }

    public PhoneNumberInfoConferencing location(String location) {
        this.location = location;
        return this;
    }

    public PhoneNumberInfoConferencing phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumberInfoConferencing premium(Boolean premium) {
        this.premium = premium;
        return this;
    }
}
