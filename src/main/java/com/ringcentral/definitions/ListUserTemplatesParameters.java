package com.ringcentral.definitions;


public class ListUserTemplatesParameters
{
    /**
         * Enum: UserSettings, CallHandling
         */
        public String type;
  public ListUserTemplatesParameters type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         */
        public String page;
  public ListUserTemplatesParameters page(String page)
  {
    this.page = page;
    return this;
  }
  

        /**
         */
        public String perPage;
  public ListUserTemplatesParameters perPage(String perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
