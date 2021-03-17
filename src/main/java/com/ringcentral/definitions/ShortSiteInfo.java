package com.ringcentral.definitions;


public class ShortSiteInfo
{
    /**
         * Internal idetifier of a site extension
         */
        public String id;
  public ShortSiteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Extension user first name
         */
        public String name;
  public ShortSiteInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
