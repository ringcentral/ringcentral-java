package com.ringcentral.definitions;


public class ListExtensionsParameters
{
    /**
         * Number of extension to be retrieved
         */
        public String extensionNumber;
  public ListExtensionsParameters extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Extension email address
         */
        public String email;
  public ListExtensionsParameters email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are allowed
         * Default: 1
         */
        public Long page;
  public ListExtensionsParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Indicates the page size (number of items)
         * Default: 100
         */
        public Long perPage;
  public ListExtensionsParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * Extension current state. Multiple values are supported. If 'Unassigned' is specified, then extensions without `extensionNumber` attribute are returned. If not specified, then all extensions are returned.
         */
        public String[] status;
  public ListExtensionsParameters status(String[] status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Extension type. Multiple values are supported. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         */
        public String[] type;
  public ListExtensionsParameters type(String[] type)
  {
    this.type = type;
    return this;
  }
  
}
