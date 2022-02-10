package com.ringcentral.definitions;


/**
 * Infomation on a message returned within the specified batch
 */
public class MessageListMessageResponse {
    /**
     * Internal identifier of a message
     * Format: int32
     * Example: 1234
     */
    public Long id;
    /**
     * Internal identifier of a batch the message was submitted in
     * Example: 12345
     */
    public String batchId;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message is sent
     * Example: 15551234567
     */
    public String from;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which a message is sent
     * Example: 15551234567
     */
    public String[] to;
    /**
     * The time at which the message was created
     * Format: date-time
     */
    public String creationTime;
    /**
     * The time at which the messages was last updated
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
     * Text of a message. Returned if the `view` parameter is set to &#039;Detailed&#039;
     */
    public String text;
    /**
     * Cost of a message
     * Format: double
     * Example: 0.007
     */
    public Double cost;
    /**
     * Indicates whether the message was outbound or inbound
     * Example: out
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * The RC error code of the message sending failure reason
     * Example: SMS-RC-503
     */
    public String errorCode;

    public MessageListMessageResponse id(Long id) {
        this.id = id;
        return this;
    }

    public MessageListMessageResponse batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public MessageListMessageResponse from(String from) {
        this.from = from;
        return this;
    }

    public MessageListMessageResponse to(String[] to) {
        this.to = to;
        return this;
    }

    public MessageListMessageResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public MessageListMessageResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public MessageListMessageResponse messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public MessageListMessageResponse segmentCount(Long segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }

    public MessageListMessageResponse text(String text) {
        this.text = text;
        return this;
    }

    public MessageListMessageResponse cost(Double cost) {
        this.cost = cost;
        return this;
    }

    public MessageListMessageResponse direction(String direction) {
        this.direction = direction;
        return this;
    }

    public MessageListMessageResponse errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
