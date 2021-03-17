package com.ringcentral.definitions;


    // Site data. If multi-site feature is turned on for the account, then ID of a site must be specified. In order to assign a wireless point to the main site (company) site ID should be set to `main-site`
public class AutomaticLocationUpdatesSiteInfo
{
    /**
         * Internal identifier of a site
         */
        public String id;
  public AutomaticLocationUpdatesSiteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a site resource
         */
        public String uri;
  public AutomaticLocationUpdatesSiteInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Name of a site
         */
        public String name;
  public AutomaticLocationUpdatesSiteInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Site code value. Returned only if specified
         */
        public String code;
  public AutomaticLocationUpdatesSiteInfo code(String code)
  {
    this.code = code;
    return this;
  }
  
}
