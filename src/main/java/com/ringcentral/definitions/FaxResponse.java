package com.ringcentral.definitions;


public class FaxResponse {
    /**
     * Internal identifier of a message
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of a message
     * Format: uri
     */
    public String uri;
    /**
     * Message type - &#039;Fax&#039;
     * Enum: Fax
     */
    public String type;
    /**
     *
     */
    public MessageStoreCallerInfoResponseFrom from;
    /**
     * Recipient information
     */
    public FaxResponseTo[] to;
    /**
     * Message creation date/time in ISO 8601 format including timezone,
     * for example 2016-03-10T18:07:52.534Z
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
     * List of message attachments
     */
    public MessageAttachmentInfoIntId[] attachments;
    /**
     * Message direction (inbound or outbound)
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Message availability status. Message in `Deleted` state is still
     * preserved with all its attachments and can be restored. `Purged` means
     * that all attachments are already deleted and the message itself is about
     * to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * Message status. Different message types may have different
     * allowed status values. For outbound faxes the aggregated message status
     * is returned. If, for multi-recipient outbound message, a status for
     * at least one recipient is `Queued`, then the `Queued` value is returned.
     * If a status for at least one recipient is `SendingFailed`,
     * then the &#039;SendingFailed&#039; value is returned. In other cases,
     * the `Sent` status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    /**
     * Fax only. Resolution of a fax message. &#039;High&#039; for black and
     * white image scanned at 200 dpi, &#039;Low&#039; for black and white image scanned
     * at 100 dpi
     * Enum: High, Low
     */
    public String faxResolution;
    /**
     * Page count in a fax message
     * Format: int32
     */
    public Long faxPageCount;
    /**
     * Date/time when the message was modified on server in ISO 8601
     * format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Cover page identifier. If `coverIndex` is set to &#039;0&#039; (zero), a cover
     * page is not attached. For a list of available cover page identifiers
     * (1-13) please call the Fax Cover Pages method. If not specified,
     * the default cover page is attached (which is configured in
     * &#039;Outbound Fax Settings&#039;)
     * Format: int32
     */
    public Long coverIndex;
    /**
     * Cover page text, entered by a fax sender and printed on a
     * cover page. Maximum length is limited to 1024 symbols
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

    public FaxResponse from(MessageStoreCallerInfoResponseFrom from) {
        this.from = from;
        return this;
    }

    public FaxResponse to(FaxResponseTo[] to) {
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
