package com.ringcentral.definitions;


public class GlobalDialInCountryResponse
{
    /**
     */
    public String countryCode;
    public GlobalDialInCountryResponse countryCode(String countryCode)
    {
        this.countryCode = countryCode;
        return this;
    }

    /**
     */
    public String countryName;
    public GlobalDialInCountryResponse countryName(String countryName)
    {
        this.countryName = countryName;
        return this;
    }

    /**
     */
    public Boolean checked;
    public GlobalDialInCountryResponse checked(Boolean checked)
    {
        this.checked = checked;
        return this;
    }

    /**
     * Format: int32
     */
    public Long order;
    public GlobalDialInCountryResponse order(Long order)
    {
        this.order = order;
        return this;
    }
}