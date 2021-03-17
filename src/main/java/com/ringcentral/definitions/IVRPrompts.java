package com.ringcentral.definitions;


public class IVRPrompts
{
    /**
         * Link to prompts library resource
         */
        public String uri;
  public IVRPrompts uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of Prompts
         */
        public PromptInfo[] records;
  public IVRPrompts records(PromptInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfo navigation;
  public IVRPrompts navigation(CallHandlingNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public CallHandlingPagingInfo paging;
  public IVRPrompts paging(CallHandlingPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
