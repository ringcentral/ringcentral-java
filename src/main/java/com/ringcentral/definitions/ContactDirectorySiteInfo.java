package com.ringcentral.definitions;


    // Site Data
public class ContactDirectorySiteInfo
{
    /**
         * Internal Identifier of a site
         */
        public String id;
  public ContactDirectorySiteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Custom name of a site
         */
        public String name;
  public ContactDirectorySiteInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
