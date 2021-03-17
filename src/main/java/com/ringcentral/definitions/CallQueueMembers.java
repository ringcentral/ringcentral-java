package com.ringcentral.definitions;


public class CallQueueMembers
{
    /**
         * Link to a call queue members resource
         * Required
         */
        public String uri;
  public CallQueueMembers uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of call queue members
         * Required
         */
        public CallQueueMemberInfo[] records;
  public CallQueueMembers records(CallQueueMemberInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningNavigationInfo navigation;
  public CallQueueMembers navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningPagingInfo paging;
  public CallQueueMembers paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
