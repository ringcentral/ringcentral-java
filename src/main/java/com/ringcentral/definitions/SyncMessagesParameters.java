package com.ringcentral.definitions;


public class SyncMessagesParameters
{
    /**
         * Conversation identifier for the resulting messages. Meaningful for SMS and Pager messages only.
         */
        public Long conversationId;
  public SyncMessagesParameters conversationId(Long conversationId)
  {
    this.conversationId = conversationId;
    return this;
  }
  

        /**
         * The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
         */
        public String dateFrom;
  public SyncMessagesParameters dateFrom(String dateFrom)
  {
    this.dateFrom = dateFrom;
    return this;
  }
  

        /**
         * The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
         */
        public String dateTo;
  public SyncMessagesParameters dateTo(String dateTo)
  {
    this.dateTo = dateTo;
    return this;
  }
  

        /**
         * Direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
         */
        public String[] direction;
  public SyncMessagesParameters direction(String[] direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * If 'True', then the latest messages per every conversation ID are returned
         */
        public Boolean distinctConversations;
  public SyncMessagesParameters distinctConversations(Boolean distinctConversations)
  {
    this.distinctConversations = distinctConversations;
    return this;
  }
  

        /**
         * Type for the resulting messages. If not specified, all types of messages are returned. Multiple values are accepted
         */
        public String[] messageType;
  public SyncMessagesParameters messageType(String[] messageType)
  {
    this.messageType = messageType;
    return this;
  }
  

        /**
         * Limits the number of records to be returned (works in combination with dateFrom and dateTo if specified)
         */
        public Long recordCount;
  public SyncMessagesParameters recordCount(Long recordCount)
  {
    this.recordCount = recordCount;
    return this;
  }
  

        /**
         * Value of syncToken property of last sync request response
         */
        public String syncToken;
  public SyncMessagesParameters syncToken(String syncToken)
  {
    this.syncToken = syncToken;
    return this;
  }
  

        /**
         * Type of message synchronization
         * Enum: FSync, ISync
         */
        public String syncType;
  public SyncMessagesParameters syncType(String syncType)
  {
    this.syncType = syncType;
    return this;
  }
  
}
