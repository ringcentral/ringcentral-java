package com.ringcentral.definitions;


public class ReadTimezoneParameters
{
    /**
         * Indicates the page number to retrieve. Only positive number values are accepted
         * Default: 1
         */
        public String page;
  public ReadTimezoneParameters page(String page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public String perPage;
  public ReadTimezoneParameters perPage(String perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
