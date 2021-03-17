package com.ringcentral.definitions;


public class DictionaryGreetingList
{
    /**
         * Canonical URI of greetings list resource
         */
        public String uri;
  public DictionaryGreetingList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of greetings
         */
        public DictionaryGreetingInfo[] records;
  public DictionaryGreetingList records(DictionaryGreetingInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfo navigation;
  public DictionaryGreetingList navigation(CallHandlingNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public CallHandlingPagingInfo paging;
  public DictionaryGreetingList paging(CallHandlingPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
