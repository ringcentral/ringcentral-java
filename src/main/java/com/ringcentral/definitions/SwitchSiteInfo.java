package com.ringcentral.definitions;


    // Site data
public class SwitchSiteInfo
{
    /**
         * Internal identifier of a site. The company identifier value is 'main-site'
         */
        public String id;
  public SwitchSiteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Name of a site
         */
        public String name;
  public SwitchSiteInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
