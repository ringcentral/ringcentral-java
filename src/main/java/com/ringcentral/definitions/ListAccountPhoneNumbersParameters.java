package com.ringcentral.definitions;


public class ListAccountPhoneNumbersParameters
{
    /**
         * Indicates the page number to retrieve. Only positive number values are accepted
         * Default: 1
         */
        public Long page;
  public ListAccountPhoneNumbersParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public Long perPage;
  public ListAccountPhoneNumbersParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * Usage type of a phone number
         */
        public String[] usageType;
  public ListAccountPhoneNumbersParameters usageType(String[] usageType)
  {
    this.usageType = usageType;
    return this;
  }
  

        /**
         * Status of a phone number. Multiple values are supported
         * Enum: Normal, Pending, PortedIn, Temporary
         */
        public String status;
  public ListAccountPhoneNumbersParameters status(String status)
  {
    this.status = status;
    return this;
  }
  
}
