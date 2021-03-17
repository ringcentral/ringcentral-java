package com.ringcentral.definitions;


public class UserAnsweringRuleList
{
    /**
         * Canonical URI of an answering rule list resource
         */
        public String uri;
  public UserAnsweringRuleList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of answering rules
         */
        public UserAnsweringRuleListRecord[] records;
  public UserAnsweringRuleList records(UserAnsweringRuleListRecord[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public UserAnsweringRuleListPaging paging;
  public UserAnsweringRuleList paging(UserAnsweringRuleListPaging paging)
  {
    this.paging = paging;
    return this;
  }
  

        /**
         */
        public UserAnsweringRuleListNavigation navigation;
  public UserAnsweringRuleList navigation(UserAnsweringRuleListNavigation navigation)
  {
    this.navigation = navigation;
    return this;
  }
  
}
