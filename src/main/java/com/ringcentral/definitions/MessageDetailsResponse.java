package com.ringcentral.definitions;


// Detailed information on a message
public class MessageDetailsResponse {
    /**
     * Internal identifier of a message
     */
    public String id;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message was sent
     */
    public String from;
    /**
     * List of phone numbers in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which the message was sent
     */
    public String[] to;
    /**
     * Text of a message
     */
    public String text;
    /**
     * Time of message creation
     */
    public String createdAt;
    /**
     * Time а a message last update
     */
    public String lastUpdatedAt;
    /**
     * Current status of a message
     * Enum: Queued, Delivered, Sent, SendingFailed, DeliveryFailed
     */
    public String messageStatus;
    /**
     * Number of segments of a message
     */
    public Long segmentCount;
    /**
     * Cost of a message
     */
    public Double cost;

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

    public MessageDetailsResponse createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public MessageDetailsResponse lastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
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

}
