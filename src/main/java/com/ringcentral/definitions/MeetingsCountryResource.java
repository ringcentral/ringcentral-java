package com.ringcentral.definitions;


public class MeetingsCountryResource
{
    /**
     * Format: uri
     */
    public String uri;
    public MeetingsCountryResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public String id;
    public MeetingsCountryResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public MeetingsCountryResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String isoCode;
    public MeetingsCountryResource isoCode(String isoCode)
    {
        this.isoCode = isoCode;
        return this;
    }

    /**
     */
    public String callingCode;
    public MeetingsCountryResource callingCode(String callingCode)
    {
        this.callingCode = callingCode;
        return this;
    }

    /**
     */
    public Boolean emergencyCalling;
    public MeetingsCountryResource emergencyCalling(Boolean emergencyCalling)
    {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    /**
     */
    public Boolean numberSelling;
    public MeetingsCountryResource numberSelling(Boolean numberSelling)
    {
        this.numberSelling = numberSelling;
        return this;
    }

    /**
     */
    public Boolean loginAllowed;
    public MeetingsCountryResource loginAllowed(Boolean loginAllowed)
    {
        this.loginAllowed = loginAllowed;
        return this;
    }
}