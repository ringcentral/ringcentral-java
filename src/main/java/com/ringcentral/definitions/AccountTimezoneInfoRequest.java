package com.ringcentral.definitions;


public class AccountTimezoneInfoRequest
{
    /**
     * Internal identifier of a timezone
     * Required
     */
    public String id;
    public AccountTimezoneInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Short name of a timezone
     * Required
     */
    public String name;
    public AccountTimezoneInfoRequest name(String name)
    {
        this.name = name;
        return this;
    }
}