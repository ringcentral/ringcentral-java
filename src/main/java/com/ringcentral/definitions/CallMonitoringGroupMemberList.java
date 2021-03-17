package com.ringcentral.definitions;


public class CallMonitoringGroupMemberList
{
    /**
         * Link to a call monitoring group members resource
         * Required
         */
        public String uri;
  public CallMonitoringGroupMemberList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of a call monitoring group members
         * Required
         */
        public CallMonitoringGroupMemberInfo[] records;
  public CallMonitoringGroupMemberList records(CallMonitoringGroupMemberInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningNavigationInfo navigation;
  public CallMonitoringGroupMemberList navigation(ProvisioningNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public ProvisioningPagingInfo paging;
  public CallMonitoringGroupMemberList paging(ProvisioningPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
