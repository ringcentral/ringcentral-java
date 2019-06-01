package com.ringcentral.definitions;


public class DialInNumberResource {
    /**
     *
     */
    public String phoneNumber;
    /**
     *
     */
    public String formattedNumber;
    /**
     *
     */
    public String location;
    /**
     *
     */
    public CountryResource country;

    public DialInNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public DialInNumberResource formattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
        return this;
    }

    public DialInNumberResource location(String location) {
        this.location = location;
        return this;
    }

    public DialInNumberResource country(CountryResource country) {
        this.country = country;
        return this;
    }

}
