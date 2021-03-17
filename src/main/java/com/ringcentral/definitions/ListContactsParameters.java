package com.ringcentral.definitions;


public class ListContactsParameters
{
    /**
         * If specified, only contacts whose First name or Last name start with the mentioned substring are returned. Case-insensitive
         */
        public String startsWith;
  public ListContactsParameters startsWith(String startsWith)
  {
    this.startsWith = startsWith;
    return this;
  }
  

        /**
         * Sorts results by the specified property
         */
        public String[] sortBy;
  public ListContactsParameters sortBy(String[] sortBy)
  {
    this.sortBy = sortBy;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are accepted
         * Default: 1
         */
        public Long page;
  public ListContactsParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public Long perPage;
  public ListContactsParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         */
        public String[] phoneNumber;
  public ListContactsParameters phoneNumber(String[] phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
}
