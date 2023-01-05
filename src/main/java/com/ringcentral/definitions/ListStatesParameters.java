package com.ringcentral.definitions;


    /**
* Query parameters for operation listStates
*/
public class ListStatesParameters
{
    /**
     * If set to &#039;True&#039; then states of all countries are returned and
    * `countryId` is ignored, even if specified. If the value is empty
    * then the parameter is ignored
     */
    public Boolean allCountries;
    public ListStatesParameters allCountries(Boolean allCountries)
    {
        this.allCountries = allCountries;
        return this;
    }

    /**
     * Internal identifier of a country
     * Format: int64
     */
    public Long countryId;
    public ListStatesParameters countryId(Long countryId)
    {
        this.countryId = countryId;
        return this;
    }

    /**
     * Indicates a page number to retrieve. Only positive number values
    * are accepted
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListStatesParameters page(Long page)
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
    public ListStatesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * If &#039;True&#039; the list of states with phone numbers available for
    * buying is returned
     */
    public Boolean withPhoneNumbers;
    public ListStatesParameters withPhoneNumbers(Boolean withPhoneNumbers)
    {
        this.withPhoneNumbers = withPhoneNumbers;
        return this;
    }
}