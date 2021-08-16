package com.ringcentral.definitions;


public class FaxResponse {
    /**
     * Internal identifier of a message
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of a message
     */
    public String uri;
    /**
     * Message type - &#039;Fax&#039;
     */
    public String type;
    /**
     *
     */
    public CallerInfoFrom from;
    /**
     * Recipient information
     */
    public CallerInfoTo[] to;
    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    /**
     * Message priority
     * Enum: Normal, High
     */
    public String priority;
    /**
     * The list of message attachments
     */
    public MessageAttachmentInfoIntId[] attachments;
    /**
     * Message direction
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Message availability status. Message in &#039;Deleted&#039; state is still preserved with all its attachments and can be restored. &#039;Purged&#039; means that all attachments are already deleted and the message itself is about to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * Message status. &#039;Queued&#039; - the message is queued for sending; &#039;Sent&#039; - a message is successfully sent; &#039;SendingFailed&#039; - a message sending attempt has failed; &#039;Received&#039; - a message is received (inbound messages have this status by default)
     * Enum: Queued, Sent, SendingFailed, Received
     */
    public String messageStatus;
    /**
     * Resolution of a fax message. (&#039;High&#039; for black and white image scanned at 200 dpi, &#039;Low&#039; for black and white image scanned at 100 dpi)
     * Enum: High, Low
     */
    public String faxResolution;
    /**
     * Page count in a fax message
     */
    public Long faxPageCount;
    /**
     * Datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Cover page identifier. If coverIndex is set to &#039;0&#039; (zero) cover page is not attached. For the list of available cover page identifiers (1-13) please call the Fax Cover Pages method. If not specified, the default cover page is attached (which is configured in &#039;Outbound Fax Settings&#039;)
     */
    public Long coverIndex;
    /**
     * Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
     */
    public String coverPageText;

    public FaxResponse id(Long id) {
        this.id = id;
        return this;
    }

    public FaxResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public FaxResponse type(String type) {
        this.type = type;
        return this;
    }

    public FaxResponse from(CallerInfoFrom from) {
        this.from = from;
        return this;
    }

    public FaxResponse to(CallerInfoTo[] to) {
        this.to = to;
        return this;
    }

    public FaxResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public FaxResponse readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public FaxResponse priority(String priority) {
        this.priority = priority;
        return this;
    }

    public FaxResponse attachments(MessageAttachmentInfoIntId[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public FaxResponse direction(String direction) {
        this.direction = direction;
        return this;
    }

    public FaxResponse availability(String availability) {
        this.availability = availability;
        return this;
    }

    public FaxResponse messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public FaxResponse faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }

    public FaxResponse faxPageCount(Long faxPageCount) {
        this.faxPageCount = faxPageCount;
        return this;
    }

    public FaxResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public FaxResponse coverIndex(Long coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }

    public FaxResponse coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }
}
