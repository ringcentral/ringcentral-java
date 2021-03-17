package com.ringcentral.definitions;


    // Notification payload body
public class FaxMessageEventBody
{
    /**
         * Internal identifier of a message
         */
        public String id;
  public FaxMessageEventBody id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public NotificationRecipientInfo[] to;
  public FaxMessageEventBody to(NotificationRecipientInfo[] to)
  {
    this.to = to;
    return this;
  }
  

        /**
         */
        public SenderInfo from;
  public FaxMessageEventBody from(SenderInfo from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Type of a message
         * Enum: Fax
         */
        public String type;
  public FaxMessageEventBody type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Message creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
         */
        public String creationTime;
  public FaxMessageEventBody creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Datetime when the message was modified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
         */
        public String lastModifiedTime;
  public FaxMessageEventBody lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Status of a message
         * Default: Unread
         */
        public String readStatus;
  public FaxMessageEventBody readStatus(String readStatus)
  {
    this.readStatus = readStatus;
    return this;
  }
  

        /**
         * Default: Normal
         */
        public String priority;
  public FaxMessageEventBody priority(String priority)
  {
    this.priority = priority;
    return this;
  }
  

        /**
         * Message attachment data
         */
        public FaxMessageAttachment[] attachments;
  public FaxMessageEventBody attachments(FaxMessageAttachment[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  

        /**
         * Message direction
         * Default: Inbound
         */
        public String direction;
  public FaxMessageEventBody direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Message availability status
         * Default: Alive
         */
        public String availability;
  public FaxMessageEventBody availability(String availability)
  {
    this.availability = availability;
    return this;
  }
  

        /**
         * Message subject. It replicates message text which is also returned as an attachment
         */
        public String subject;
  public FaxMessageEventBody subject(String subject)
  {
    this.subject = subject;
    return this;
  }
  

        /**
         * Status of a message
         * Default: Received
         */
        public String messageStatus;
  public FaxMessageEventBody messageStatus(String messageStatus)
  {
    this.messageStatus = messageStatus;
    return this;
  }
  

        /**
         * Internal identifier of a conversation this message belongs to
         */
        public String conversationId;
  public FaxMessageEventBody conversationId(String conversationId)
  {
    this.conversationId = conversationId;
    return this;
  }
  

        /**
         * Resolution of a fax message. ('High' for black and white image scanned at 200 dpi, 'Low' for black and white image scanned at 100 dpi)
         */
        public String faxResolution;
  public FaxMessageEventBody faxResolution(String faxResolution)
  {
    this.faxResolution = faxResolution;
    return this;
  }
  

        /**
         * Page count of a fax message
         */
        public Long faxPageCount;
  public FaxMessageEventBody faxPageCount(Long faxPageCount)
  {
    this.faxPageCount = faxPageCount;
    return this;
  }
  
}
