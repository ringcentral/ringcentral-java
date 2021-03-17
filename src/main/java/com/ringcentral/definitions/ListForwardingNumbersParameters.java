package com.ringcentral.definitions;


public class ListForwardingNumbersParameters
{
    /**
         * Indicates the page number to retrieve. Only positive number values are accepted.
         * Default: 1
         */
        public Long page;
  public ListForwardingNumbersParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items).
         * Default: 100
         */
        public Long perPage;
  public ListForwardingNumbersParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
