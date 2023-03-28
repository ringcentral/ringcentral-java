package com.ringcentral.definitions;


/**
 * Complete details of the message
 */
public class MessageDetailsResponse {
    /**
     * Internal identifier of a message
     * Example: 1234
     */
    public String id;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message was sent
     * Example: 15551234567
     */
    public String from;
    /**
     * List of phone numbers in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which the message was sent
     * Example: 15551234567
     */
    public String[] to;
    /**
     * Text of a message, maximum number of characters is 1000
     * Example: Hello, World!
     */
    public String text;
    /**
     * The time when this is message was created.
     * Format: date-time
     */
    public String creationTime;
    /**
     * The time when this message was last updated.
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Current status of a message
     * Example: Queued
     * Enum: Queued, Delivered, Sent, SendingFailed, DeliveryFailed
     */
    public String messageStatus;
    /**
     * Number of segments of a message
     * Format: int32
     * Example: 1
     */
    public Long segmentCount;
    /**
     * Cost of a message
     * Format: double
     * Example: 0.007
     */
    public Double cost;
    /**
     * The batch in which the message was submitted
     * Example: batch12345
     */
    public String batchId;
    /**
     * Direction of the SMS message
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * The RC error code of the message sending failure reason
     * Example: SMS-RC-503
     */
    public String errorCode;

    public MessageDetailsResponse id(String id) {
        this.id = id;
        return this;
    }

    public MessageDetailsResponse from(String from) {
        this.from = from;
        return this;
    }

    public MessageDetailsResponse to(String[] to) {
        this.to = to;
        return this;
    }

    public MessageDetailsResponse text(String text) {
        this.text = text;
        return this;
    }

    public MessageDetailsResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public MessageDetailsResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public MessageDetailsResponse messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public MessageDetailsResponse segmentCount(Long segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }

    public MessageDetailsResponse cost(Double cost) {
        this.cost = cost;
        return this;
    }

    public MessageDetailsResponse batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public MessageDetailsResponse direction(String direction) {
        this.direction = direction;
        return this;
    }

    public MessageDetailsResponse errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
