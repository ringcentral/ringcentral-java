package com.ringcentral.definitions;


public class ListExtensionPhoneNumbersParameters
{
    /**
         * Status of a phone number. Multiple values are supported
         * Enum: Normal, Pending, PortedIn, Temporary
         */
        public String status;
  public ListExtensionPhoneNumbersParameters status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Usage type of a phone number
         */
        public String[] usageType;
  public ListExtensionPhoneNumbersParameters usageType(String[] usageType)
  {
    this.usageType = usageType;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
         */
        public Long page;
  public ListExtensionPhoneNumbersParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items). If not specified, the value is '100' by default
         */
        public Long perPage;
  public ListExtensionPhoneNumbersParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
