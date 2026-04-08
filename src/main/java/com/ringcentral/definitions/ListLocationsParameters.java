package com.ringcentral.definitions;


    /**
* Query parameters for operation listLocations
*/
public class ListLocationsParameters
{
    /**
     * Sorts results by the property specified
     * Default: City
     * Enum: Npa, City
     */
    public String orderBy;
    public ListLocationsParameters orderBy(String orderBy)
    {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Indicates a page number to retrieve. Only positive number values
    * are accepted
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListLocationsParameters page(Long page)
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
    public ListLocationsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Internal identifier of a state
     */
    public String stateId;
    public ListLocationsParameters stateId(String stateId)
    {
        this.stateId = stateId;
        return this;
    }

    /**
     * Specifies if `nxx` codes are returned
     */
    public Boolean withNxx;
    public ListLocationsParameters withNxx(Boolean withNxx)
    {
        this.withNxx = withNxx;
        return this;
    }
}