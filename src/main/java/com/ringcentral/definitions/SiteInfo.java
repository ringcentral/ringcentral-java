package com.ringcentral.definitions;


public class SiteInfo
{
    /**
         * Internal idetifier of a site extension
         */
        public String id;
  public SiteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a site resource
         */
        public String uri;
  public SiteInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Extension user first name
         */
        public String name;
  public SiteInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Extension number
         */
        public String extensionNumber;
  public SiteInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Custom name of a caller. Max number of characters is 15 (only alphabetical symbols, numbers and commas are supported)
         */
        public String callerIdName;
  public SiteInfo callerIdName(String callerIdName)
  {
    this.callerIdName = callerIdName;
    return this;
  }
  

        /**
         * Exetnsion user email
         */
        public String email;
  public SiteInfo email(String email)
  {
    this.email = email;
    return this;
  }
  

        /**
         */
        public ContactBusinessAddressInfo businessAddress;
  public SiteInfo businessAddress(ContactBusinessAddressInfo businessAddress)
  {
    this.businessAddress = businessAddress;
    return this;
  }
  

        /**
         */
        public RegionalSettings regionalSettings;
  public SiteInfo regionalSettings(RegionalSettings regionalSettings)
  {
    this.regionalSettings = regionalSettings;
    return this;
  }
  

        /**
         */
        public OperatorInfo operator;
  public SiteInfo operator(OperatorInfo operator)
  {
    this.operator = operator;
    return this;
  }
  

        /**
         * Site code value. Returned only if specified
         */
        public String code;
  public SiteInfo code(String code)
  {
    this.code = code;
    return this;
  }
  
}
