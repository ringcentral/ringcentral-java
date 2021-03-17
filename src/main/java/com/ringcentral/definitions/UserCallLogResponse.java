package com.ringcentral.definitions;


public class UserCallLogResponse
{
    /**
         * List of call log records
         * Required
         */
        public UserCallLogRecord[] records;
  public UserCallLogResponse records(UserCallLogRecord[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         * Required
         */
        public CallLogNavigationInfo navigation;
  public UserCallLogResponse navigation(CallLogNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         * Required
         */
        public CallLogPagingInfo paging;
  public UserCallLogResponse paging(CallLogPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
