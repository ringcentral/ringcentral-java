package com.ringcentral.definitions;


public class AccountCallLogSyncResponse
{
    /**
         * Link to account call log sync resource
         */
        public String uri;
  public AccountCallLogSyncResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of call log records with synchronization information. For 'ISync' the total number of returned records is limited to 250; this includes both new records and the old ones, specified by the recordCount parameter
         */
        public CompanyCallLogRecord[] records;
  public AccountCallLogSyncResponse records(CompanyCallLogRecord[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public CompanyCallLogSyncInfo syncInfo;
  public AccountCallLogSyncResponse syncInfo(CompanyCallLogSyncInfo syncInfo)
  {
    this.syncInfo = syncInfo;
    return this;
  }
  
}
