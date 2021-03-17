package com.ringcentral.definitions;


public class ListAnsweringRulesParameters
{
    /**
         * Filters custom call handling rules of the extension
         * Enum: Custom
         */
        public String type;
  public ListAnsweringRulesParameters type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Default: Simple
         * Enum: Detailed, Simple
         */
        public String view;
  public ListAnsweringRulesParameters view(String view)
  {
    this.view = view;
    return this;
  }
  

        /**
         * If true, then only active call handling rules are returned
         */
        public Boolean enabledOnly;
  public ListAnsweringRulesParameters enabledOnly(Boolean enabledOnly)
  {
    this.enabledOnly = enabledOnly;
    return this;
  }
  

        /**
         * Default: 1
         */
        public String page;
  public ListAnsweringRulesParameters page(String page)
  {
    this.page = page;
    return this;
  }
  

        /**
         * Default: 100
         */
        public String perPage;
  public ListAnsweringRulesParameters perPage(String perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
