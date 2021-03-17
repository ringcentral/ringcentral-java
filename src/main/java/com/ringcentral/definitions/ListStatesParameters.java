package com.ringcentral.definitions;


public class ListStatesParameters
{
    /**
         * If set to 'True' then states for all countries are returned and `countryId` is ignored, even if specified. If the value is empty then the parameter is ignored
         */
        public Boolean allCountries;
  public ListStatesParameters allCountries(Boolean allCountries)
  {
    this.allCountries = allCountries;
    return this;
  }
  

        /**
         * Internal identifier of a country
         */
        public Long countryId;
  public ListStatesParameters countryId(Long countryId)
  {
    this.countryId = countryId;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are accepted
         * Default: 1
         */
        public Long page;
  public ListStatesParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public Long perPage;
  public ListStatesParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * If 'True', the list of states with phone numbers available for buying is returned
         */
        public Boolean withPhoneNumbers;
  public ListStatesParameters withPhoneNumbers(Boolean withPhoneNumbers)
  {
    this.withPhoneNumbers = withPhoneNumbers;
    return this;
  }
  
}
