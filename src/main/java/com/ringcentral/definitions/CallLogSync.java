package com.ringcentral.definitions;


public class CallLogSync
{
    /**
         * Link to the list of call log records with sync information
         */
        public String uri;
  public CallLogSync uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of call log records with synchronization information. For ISync the total number of returned records is limited to 250; this includes both new records and the old ones, specified by the recordCount parameter
         */
        public UserCallLogRecord[] records;
  public CallLogSync records(UserCallLogRecord[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public SyncInfoCallLog syncInfo;
  public CallLogSync syncInfo(SyncInfoCallLog syncInfo)
  {
    this.syncInfo = syncInfo;
    return this;
  }
  
}
