package com.ringcentral.definitions;


public class InboundMessageEvent
{
    /**
         */
        public NotificationInfo aps;
  public InboundMessageEvent aps(NotificationInfo aps)
  {
    this.aps = aps;
    return this;
  }
  

        /**
         * Internal identifier of a message
         */
        public String messageId;
  public InboundMessageEvent messageId(String messageId)
  {
    this.messageId = messageId;
    return this;
  }
  

        /**
         * Internal identifier of a conversation
         */
        public String conversationId;
  public InboundMessageEvent conversationId(String conversationId)
  {
    this.conversationId = conversationId;
    return this;
  }
  

        /**
         * Sender phone number. For GCM transport type '_from' property should be used
         */
        public String from;
  public InboundMessageEvent from(String from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Receiver phone number
         */
        public String to;
  public InboundMessageEvent to(String to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * Internal identifier of a subscription owner extension
         */
        public String ownerId;
  public InboundMessageEvent ownerId(String ownerId)
  {
    this.ownerId = ownerId;
    return this;
  }
  
}
