package com.ringcentral.definitions;


    /**
* Company business address
*/
public class BusinessAddressInfo
{
    /**
     * Name of a country
     */
    public String country;
    public BusinessAddressInfo country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * Name of a state/province
     */
    public String state;
    public BusinessAddressInfo state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Name of a city
     */
    public String city;
    public BusinessAddressInfo city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * Street address
     */
    public String street;
    public BusinessAddressInfo street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Zip code
     */
    public String zip;
    public BusinessAddressInfo zip(String zip)
    {
        this.zip = zip;
        return this;
    }
}