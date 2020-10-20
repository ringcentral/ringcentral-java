package com.ringcentral.definitions;


// Batch of A2P SMS messages. This object provides a specification to send message(s) to many recipients. It contains top-level attributes, such as `text`, `expiresIn`, `scheduledAt` which apply to all `messages`. In addition to that, it is possible to override this attribute for each message. This way a single API call may be used to send individual messages to many recipients
public class MessageBatchResponse {
    /**
     * Unique identifier of the message batch
     */
    public String id;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the messages are going to be sent
     * Required
     */
    public String from;
    /**
     * Total number of messages in the accepted batch
     */
    public Long batchSize;
    /**
     * Total number of messages currently processed in the batch
     */
    public Long processedCount;
    /**
     * Time of message batch last processing
     */
    public String lastUpdatedAt;
    /**
     * Current status of a message batch
     * Enum: Processing, Completed
     */
    public String status;
    /**
     * Time of message batch creation
     */
    public String createdAt;

    public MessageBatchResponse id(String id) {
        this.id = id;
        return this;
    }

    public MessageBatchResponse from(String from) {
        this.from = from;
        return this;
    }

    public MessageBatchResponse batchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    public MessageBatchResponse processedCount(Long processedCount) {
        this.processedCount = processedCount;
        return this;
    }

    public MessageBatchResponse lastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    public MessageBatchResponse status(String status) {
        this.status = status;
        return this;
    }

    public MessageBatchResponse createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

}
