package com.ringcentral.definitions;


public class SyncUserCallLogParameters
{
    /**
         * Type of synchronization
         * Default: FSync
         * Enum: FSync, ISync
         */
        public String syncType;
  public SyncUserCallLogParameters syncType(String syncType)
  {
    this.syncType = syncType;
    return this;
  }
  

        /**
         * Value of syncToken property of last sync request response
         */
        public String syncToken;
  public SyncUserCallLogParameters syncToken(String syncToken)
  {
    this.syncToken = syncToken;
    return this;
  }
  

        /**
         * The start datetime for resulting records in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is the current moment
         */
        public String dateFrom;
  public SyncUserCallLogParameters dateFrom(String dateFrom)
  {
    this.dateFrom = dateFrom;
    return this;
  }
  

        /**
         * For 'FSync' the parameter is mandatory, it limits the number of records to be returned in response. For 'ISync' it specifies with how many records to extend sync Frame to the past, the maximum number of records is 250
         */
        public Long recordCount;
  public SyncUserCallLogParameters recordCount(Long recordCount)
  {
    this.recordCount = recordCount;
    return this;
  }
  

        /**
         * Type of calls to be returned. The default value is 'All'
         */
        public String[] statusGroup;
  public SyncUserCallLogParameters statusGroup(String[] statusGroup)
  {
    this.statusGroup = statusGroup;
    return this;
  }
  

        /**
         * View of call records. The same view parameter specified for FSync will be applied for ISync, the view cannot be changed for ISync
         * Default: Simple
         * Enum: Simple, Detailed
         */
        public String view;
  public SyncUserCallLogParameters view(String view)
  {
    this.view = view;
    return this;
  }
  

        /**
         * Supported for ISync. If 'True' then deleted call records are returned
         */
        public Boolean showDeleted;
  public SyncUserCallLogParameters showDeleted(Boolean showDeleted)
  {
    this.showDeleted = showDeleted;
    return this;
  }
  
}
