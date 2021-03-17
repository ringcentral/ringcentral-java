package com.ringcentral.definitions;


    // Notification payload body
public class VoicemailMessageEventBody
{
    /**
         * Internal identifier of a message
         */
        public String id;
  public VoicemailMessageEventBody id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Message receiver(s) information
         */
        public NotificationRecipientInfo[] to;
  public VoicemailMessageEventBody to(NotificationRecipientInfo[] to)
  {
    this.to = to;
    return this;
  }
  

        /**
         */
        public SenderInfo from;
  public VoicemailMessageEventBody from(SenderInfo from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Type of a message
         * Enum: Voicemail
         */
        public String type;
  public VoicemailMessageEventBody type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Message creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2019-03-10T18:07:52.534Z*
         */
        public String creationTime;
  public VoicemailMessageEventBody creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Datetime when the message was modified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2019-03-10T18:07:52.534Z*
         */
        public String lastModifiedTime;
  public VoicemailMessageEventBody lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Status of a message
         * Default: Unread
         */
        public String readStatus;
  public VoicemailMessageEventBody readStatus(String readStatus)
  {
    this.readStatus = readStatus;
    return this;
  }
  

        /**
         * Message priority
         * Default: Normal
         */
        public String priority;
  public VoicemailMessageEventBody priority(String priority)
  {
    this.priority = priority;
    return this;
  }
  

        /**
         * Message attachment data
         */
        public MessageAttachmentInfo[] attachments;
  public VoicemailMessageEventBody attachments(MessageAttachmentInfo[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  

        /**
         * Message direction
         * Default: Inbound
         * Enum: Inbound, Outbound
         */
        public String direction;
  public VoicemailMessageEventBody direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * Message availability status
         * Default: Alive
         */
        public String availability;
  public VoicemailMessageEventBody availability(String availability)
  {
    this.availability = availability;
    return this;
  }
  

        /**
         * Message subject. It replicates message text which is also returned as an attachment
         */
        public String subject;
  public VoicemailMessageEventBody subject(String subject)
  {
    this.subject = subject;
    return this;
  }
  

        /**
         * Status of a message
         * Default: Received
         */
        public String messageStatus;
  public VoicemailMessageEventBody messageStatus(String messageStatus)
  {
    this.messageStatus = messageStatus;
    return this;
  }
  

        /**
         * Internal identifier of a conversation this message belongs to
         */
        public String conversationId;
  public VoicemailMessageEventBody conversationId(String conversationId)
  {
    this.conversationId = conversationId;
    return this;
  }
  

        /**
         * Specifies if a voicemail message transcription is already completed or not
         */
        public String vmTranscriptionStatus;
  public VoicemailMessageEventBody vmTranscriptionStatus(String vmTranscriptionStatus)
  {
    this.vmTranscriptionStatus = vmTranscriptionStatus;
    return this;
  }
  
}
