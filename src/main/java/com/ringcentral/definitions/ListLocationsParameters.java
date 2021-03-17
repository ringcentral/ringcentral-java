package com.ringcentral.definitions;


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
         * Indicates the page number to retrieve. Only positive number values are accepted
         * Default: 1
         */
        public Long page;
  public ListLocationsParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
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
         * Specifies if nxx codes are returned
         */
        public Boolean withNxx;
  public ListLocationsParameters withNxx(Boolean withNxx)
  {
    this.withNxx = withNxx;
    return this;
  }
  
}
