package com.ringcentral.definitions;


public class UserTemplates
{
    /**
         * Link to user templates resource
         */
        public String uri;
  public UserTemplates uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of user templates
         * Required
         */
        public TemplateInfo[] records;
  public UserTemplates records(TemplateInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningNavigationInfo navigation;
  public UserTemplates navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningPagingInfo paging;
  public UserTemplates paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
