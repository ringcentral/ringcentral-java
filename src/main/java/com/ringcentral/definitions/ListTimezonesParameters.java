package com.ringcentral.definitions;


public class ListTimezonesParameters
{
    /**
         * Indicates the page number to retrieve. Only positive number values are accepted
         * Default: 1
         */
        public String page;
  public ListTimezonesParameters page(String page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public String perPage;
  public ListTimezonesParameters perPage(String perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
