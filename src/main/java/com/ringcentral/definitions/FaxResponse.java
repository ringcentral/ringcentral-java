package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FaxResponse
{
    // Internal identifier of a message
    public String id;
    public FaxResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a message
    public String uri;
    public FaxResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Message type - 'Fax'
    public String type;
    public FaxResponse type(String type) {
        this.type = type;
        return this;
    }
    // Sender information
    public CallerInfoFrom from;
    public FaxResponse from(CallerInfoFrom from) {
        this.from = from;
        return this;
    }
    // Recipient information
    public CallerInfoTo[] to;
    public FaxResponse to(CallerInfoTo[] to) {
        this.to = to;
        return this;
    }
    // Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    public FaxResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Message read status
    public String readStatus;
    public FaxResponse readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }
    // Message priority
    public String priority;
    public FaxResponse priority(String priority) {
        this.priority = priority;
        return this;
    }
    // The list of message attachments
    public MessageAttachmentInfo[] attachments;
    public FaxResponse attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
    // Message direction
    public String direction;
    public FaxResponse direction(String direction) {
        this.direction = direction;
        return this;
    }
    // Message availability status. Message in 'Deleted' state is still preserved with all its attachments and can be restored. 'Purged' means that all attachments are already deleted and the message itself is about to be physically deleted shortly
    public String availability;
    public FaxResponse availability(String availability) {
        this.availability = availability;
        return this;
    }
    // Message status. 'Queued' - the message is queued for sending; 'Sent' - a message is successfully sent; 'SendingFailed' - a message sending attempt has failed; 'Received' - a message is received (inbound messages have this status by default)
    public String messageStatus;
    public FaxResponse messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
    // Resolution of a fax message. ('High' for black and white image scanned at 200 dpi, 'Low' for black and white image scanned at 100 dpi)
    public String faxResolution;
    public FaxResponse faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }
    // Page count in a fax message
    public Long faxPageCount;
    public FaxResponse faxPageCount(Long faxPageCount) {
        this.faxPageCount = faxPageCount;
        return this;
    }
    // Datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    public FaxResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    // Cover page identifier. For the list of available cover page identifiers please call the method Fax Cover Pages
    public Long coverIndex;
    public FaxResponse coverIndex(Long coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }
    // Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
    public String coverPageText;
    public FaxResponse coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }
}
