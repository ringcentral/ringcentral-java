package com.ringcentral.definitions;


// Infommation on a message returned within the specified batch
public class MessageListMessageResponse {
    /**
     * Internal identifier of a message
     */
    public Long id;
    /**
     * Internal identifier of a batch the message was submitted in
     */
    public String batchId;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message is sent
     */
    public String from;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which a message is sent
     */
    public String[] to;
    /**
     * Time of message creation
     */
    public String createdAt;
    /**
     * Time of the message(s) last update
     */
    public String lastUpdatedAt;
    /**
     * Current status of a message
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

    public MessageListMessageResponse createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public MessageListMessageResponse lastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
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

    public MessageListMessageResponse cost(Double cost) {
        this.cost = cost;
        return this;
    }

}
