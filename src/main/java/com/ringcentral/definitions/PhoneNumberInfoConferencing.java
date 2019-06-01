package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class PhoneNumberInfoConferencing {
    /**
     * Information on a home country of a conference phone number
     */
    public GetCountryInfoConferencing country;
    /**
     * 'True' if the number is default for the conference. Default conference number is a domestic number that can be set by user (otherwise it is set by the system). Only one default number per country is allowed
     */
    @JSONField(name = "default")
    public Boolean _default;
    /**
     * 'True' if the greeting message is played on this number
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

    public PhoneNumberInfoConferencing country(GetCountryInfoConferencing country) {
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

}
