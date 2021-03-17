package com.ringcentral.definitions;


public class MessageStoreReport
{
    /**
         * Internal identifier of a message store report task
         */
        public String id;
  public MessageStoreReport id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a task
         */
        public String uri;
  public MessageStoreReport uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Status of a message store report task
         * Enum: Accepted, Pending, InProgress, AttemptFailed, Failed, Completed, Cancelled
         */
        public String status;
  public MessageStoreReport status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Internal identifier of an account
         */
        public String accountId;
  public MessageStoreReport accountId(String accountId)
  {
    this.accountId = accountId;
    return this;
  }
  

        /**
         * Internal identifier of an extension
         */
        public String extensionId;
  public MessageStoreReport extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         * Task creation time
         */
        public String creationTime;
  public MessageStoreReport creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Time of the last task modification
         */
        public String lastModifiedTime;
  public MessageStoreReport lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Ending time for collecting messages
         */
        public String dateTo;
  public MessageStoreReport dateTo(String dateTo)
  {
    this.dateTo = dateTo;
    return this;
  }
  

        /**
         * Starting time for collecting messages
         */
        public String dateFrom;
  public MessageStoreReport dateFrom(String dateFrom)
  {
    this.dateFrom = dateFrom;
    return this;
  }
  
}
