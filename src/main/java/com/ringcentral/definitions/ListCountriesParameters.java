package com.ringcentral.definitions;


    /**
* Query parameters for operation listCountries
*/
public class ListCountriesParameters
{
    /**
     * Specifies whether the logging-in with the phone numbers of this country
    * is enabled or not
     */
    public Boolean loginAllowed;
    public ListCountriesParameters loginAllowed(Boolean loginAllowed)
    {
        this.loginAllowed = loginAllowed;
        return this;
    }

    /**
     * Indicates whether a signup/billing is allowed for a country. If
    * not specified all countries are returned (according to other
    * specified filters if any)
     */
    public Boolean signupAllowed;
    public ListCountriesParameters signupAllowed(Boolean signupAllowed)
    {
        this.signupAllowed = signupAllowed;
        return this;
    }

    /**
     * Specifies if RingCentral sells phone numbers of this country
     */
    public Boolean numberSelling;
    public ListCountriesParameters numberSelling(Boolean numberSelling)
    {
        this.numberSelling = numberSelling;
        return this;
    }

    /**
     * Indicates a page number to retrieve. Only positive number values
    * are accepted
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListCountriesParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    public ListCountriesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Specifies if free phone line for softphone is available for a
    * country or not
     */
    public Boolean freeSoftphoneLine;
    public ListCountriesParameters freeSoftphoneLine(Boolean freeSoftphoneLine)
    {
        this.freeSoftphoneLine = freeSoftphoneLine;
        return this;
    }
}