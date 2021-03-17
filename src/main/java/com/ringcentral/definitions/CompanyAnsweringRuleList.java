package com.ringcentral.definitions;


public class CompanyAnsweringRuleList
{
    /**
         * Link to an answering rule resource
         */
        public String uri;
  public CompanyAnsweringRuleList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of company answering rules
         */
        public ListCompanyAnsweringRuleInfo[] records;
  public CompanyAnsweringRuleList records(ListCompanyAnsweringRuleInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public CallHandlingPagingInfo paging;
  public CompanyAnsweringRuleList paging(CallHandlingPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  

        /**
         */
        public CallHandlingNavigationInfo navigation;
  public CompanyAnsweringRuleList navigation(CallHandlingNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  
}
