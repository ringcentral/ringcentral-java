package com.ringcentral.definitions;


public class DialInNumberResource
{
    /**
     */
    public String phoneNumber;
    public DialInNumberResource phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     */
    public String formattedNumber;
    public DialInNumberResource formattedNumber(String formattedNumber)
    {
        this.formattedNumber = formattedNumber;
        return this;
    }

    /**
     */
    public String location;
    public DialInNumberResource location(String location)
    {
        this.location = location;
        return this;
    }

    /**
     */
    public MeetingsCountryResource country;
    public DialInNumberResource country(MeetingsCountryResource country)
    {
        this.country = country;
        return this;
    }
}