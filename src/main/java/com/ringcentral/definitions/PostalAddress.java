package com.ringcentral.definitions;


    /**
* Postal address/location
*/
public class PostalAddress
{
    /**
     * Street address
     * Required
     * Example: 20 Davis Dr
     */
    public String street;
    public PostalAddress street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Street address (2nd line)
     */
    public String street2;
    public PostalAddress street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     * City name
     * Required
     * Example: Belmont
     */
    public String city;
    public PostalAddress city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * State or province information in the target country
     * Example: CA
     */
    public String state;
    public PostalAddress state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Postal code in the target country
     * Required
     * Example: 94002
     */
    public String zip;
    public PostalAddress zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     * ISO-3166-1 2-letter country code (alpha2). 
    * For available countries, see GET /dictionary/country
     * Required
     * Example: US
     */
    public String country;
    public PostalAddress country(String country)
    {
        this.country = country;
        return this;
    }
}