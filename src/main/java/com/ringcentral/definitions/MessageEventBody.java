package com.ringcentral.definitions;


    // Notification payload body
public class MessageEventBody
{
    /**
         * Internal identifier of an extension
         */
        public String extensionId;
  public MessageEventBody extensionId(String extensionId)
  {
    this.extensionId = extensionId;
    return this;
  }
  

        /**
         * Datetime when the message was last modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
         */
        public String lastUpdated;
  public MessageEventBody lastUpdated(String lastUpdated)
  {
    this.lastUpdated = lastUpdated;
    return this;
  }
  

        /**
         * Message Changes
         */
        public MessageChanges[] changes;
  public MessageEventBody changes(MessageChanges[] changes)
  {
    this.changes = changes;
    return this;
  }
  

        /**
         * Internal identifier of a subscription owner extension
         */
        public String ownerId;
  public MessageEventBody ownerId(String ownerId)
  {
    this.ownerId = ownerId;
    return this;
  }
  
}
