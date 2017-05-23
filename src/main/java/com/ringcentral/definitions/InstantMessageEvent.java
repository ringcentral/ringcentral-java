package com.ringcentral.definitions;

public class InstantMessageEvent {
    // Internal identifier of a message
    public String id;
    // Message receiver(s) information
    public InstantMessageEvent_CallerInfo[] to;
    // Message sender information
    public InstantMessageEvent_CallerInfo from;
    // Type of a message. The default value is 'SMS'
    public String type;
    // Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    // The datetime when the message was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    // Status of a message. The default value is 'Unread'
    public String readStatus;
    // The default value is 'Normal'
    public String priority;
    // Message attachment data
    public InstantMessageAttachmentInfo[] attachments;
    // Message direction. The default value is 'Inbound'
    public String direction;
    // Message availability status. The default value is 'Alive'
    public String availability;
    // Message subject. It replicates message text which is also returned as an attachment
    public String subject;
    // Status of a message. The default value is 'Received'
    public String messageStatus;
    // Identifier of the conversation the message belongs to
    public String conversationId;
}
