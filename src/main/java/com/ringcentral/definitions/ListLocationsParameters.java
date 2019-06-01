package com.ringcentral.definitions;


public class ListLocationsParameters {
    /**
     * Sorts results by the property specified
     * Default: City
     * Enum: Npa, City
     */
    public String orderBy;
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    /**
     * Internal identifier of a state
     */
    public String stateId;
    /**
     * Specifies if nxx codes are returned
     */
    public Boolean withNxx;

    public ListLocationsParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ListLocationsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListLocationsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListLocationsParameters stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public ListLocationsParameters withNxx(Boolean withNxx) {
        this.withNxx = withNxx;
        return this;
    }

}
