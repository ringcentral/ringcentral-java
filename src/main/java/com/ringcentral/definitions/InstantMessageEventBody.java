package com.ringcentral.definitions;


    // Notification payload body
public class InstantMessageEventBody
{
    /**
         * Internal identifier of a message
         */
        public String id;
  public InstantMessageEventBody id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Message receiver(s) information
         */
        public NotificationRecipientInfo[] to;
  public InstantMessageEventBody to(NotificationRecipientInfo[] to)
  {
    this.to = to;
    return this;
  }
  

        /**
         */
        public SenderInfo from;
  public InstantMessageEventBody from(SenderInfo from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Type of a message. The default value is 'SMS'
         */
        public String type;
  public InstantMessageEventBody type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
         */
        public String creationTime;
  public InstantMessageEventBody creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Datetime when the message was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
         */
        public String lastModifiedTime;
  public InstantMessageEventBody lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Status of a message
         * Default: Unread
         */
        public String readStatus;
  public InstantMessageEventBody readStatus(String readStatus)
  {
    this.readStatus = readStatus;
    return this;
  }
  

        /**
         * Default: Normal
         */
        public String priority;
  public InstantMessageEventBody priority(String priority)
  {
    this.priority = priority;
    return this;
  }
  

        /**
         * Message attachment data
         */
        public MessageAttachmentInfo[] attachments;
  public InstantMessageEventBody attachments(MessageAttachmentInfo[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  

        /**
         * Message direction
         * Default: Inbound
         */
        public String direction;
  public InstantMessageEventBody direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Message availability status
         * Default: Alive
         */
        public String availability;
  public InstantMessageEventBody availability(String availability)
  {
    this.availability = availability;
    return this;
  }
  

        /**
         * Message subject. It replicates message text which is also returned as an attachment
         */
        public String subject;
  public InstantMessageEventBody subject(String subject)
  {
    this.subject = subject;
    return this;
  }
  

        /**
         * Status of a message
         * Default: Received
         */
        public String messageStatus;
  public InstantMessageEventBody messageStatus(String messageStatus)
  {
    this.messageStatus = messageStatus;
    return this;
  }
  

        /**
         * Deprecated. Identifier of a conversation the message belongs to
         */
        public String conversationId;
  public InstantMessageEventBody conversationId(String conversationId)
  {
    this.conversationId = conversationId;
    return this;
  }
  

        /**
         */
        public ConversationInfo conversation;
  public InstantMessageEventBody conversation(ConversationInfo conversation)
  {
    this.conversation = conversation;
    return this;
  }
  

        /**
         * Internal identifier of a subscription owner extension
         */
        public String ownerId;
  public InstantMessageEventBody ownerId(String ownerId)
  {
    this.ownerId = ownerId;
    return this;
  }
  
}
