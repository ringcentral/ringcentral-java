package com.ringcentral.definitions;


public class UserActiveCallsResponse
{
    /**
         * Link to the list of user active call records
         */
        public String uri;
  public UserActiveCallsResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of call log records
         * Required
         */
        public UserCallLogRecord[] records;
  public UserActiveCallsResponse records(UserCallLogRecord[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public CallLogNavigationInfo navigation;
  public UserActiveCallsResponse navigation(CallLogNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public CallLogPagingInfo paging;
  public UserActiveCallsResponse paging(CallLogPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
