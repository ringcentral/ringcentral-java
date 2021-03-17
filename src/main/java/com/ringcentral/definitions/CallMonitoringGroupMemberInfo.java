package com.ringcentral.definitions;


public class CallMonitoringGroupMemberInfo
{
    /**
         * Link to a call monitoring group member
         */
        public String uri;
  public CallMonitoringGroupMemberInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a call monitoring group member
         */
        public String id;
  public CallMonitoringGroupMemberInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Extension number of a call monitoring group member
         */
        public String extensionNumber;
  public CallMonitoringGroupMemberInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public String[] permissions;
  public CallMonitoringGroupMemberInfo permissions(String[] permissions)
  {
    this.permissions = permissions;
    return this;
  }
  
}
