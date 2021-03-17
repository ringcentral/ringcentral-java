package com.ringcentral.definitions;


public class AccountCallLogResponse
{
    /**
         * Link to the list of company call log records
         */
        public String uri;
  public AccountCallLogResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of call log records
         */
        public CompanyCallLogRecord[] records;
  public AccountCallLogResponse records(CompanyCallLogRecord[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public CallLogNavigationInfo navigation;
  public AccountCallLogResponse navigation(CallLogNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public CallLogPagingInfo paging;
  public AccountCallLogResponse paging(CallLogPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  
}
