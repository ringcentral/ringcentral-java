package com.ringcentral.definitions;


public class ListCallQueueMembersParameters
{
    /**
         * Indicates the page number to retrieve. Only positive number values are allowed
         * Default: 1
         */
        public Long page;
  public ListCallQueueMembersParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public Long perPage;
  public ListCallQueueMembersParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
