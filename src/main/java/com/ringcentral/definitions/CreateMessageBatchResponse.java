package com.ringcentral.definitions;


// Batch of A2P SMS messages. This object provides a specification to send message(s) to many recipients. It contains top-level attributes which apply to all messages. In addition to that, it is possible to override this attribute for each message. This way a single API call may be used to send individual messages to many recipients
public class CreateMessageBatchResponse {
    /**
     * Unique identifier of the message batch
     * Example: 12345
     */
    public String id;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the messages are going to be sent
     * Required
     * Example: 15551234567
     */
    public String from;
    /**
     * Total number of messages in the accepted batch
     * Example: 5
     */
    public Long batchSize;
    /**
     * Total number of messages currently processed in the batch
     * Example: 1
     */
    public Long processedCount;
    /**
     * The last time the batch was processed.
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Current status of a message batch
     * Example: Processing
     * Enum: Processing, Sent, Completed
     */
    public String status;
    /**
     * The time at which the batch was created
     * Format: date-time
     */
    public String creationTime;
    /**
     *
     */
    public RejectedMessageInfo[] rejected;

    public CreateMessageBatchResponse id(String id) {
        this.id = id;
        return this;
    }

    public CreateMessageBatchResponse from(String from) {
        this.from = from;
        return this;
    }

    public CreateMessageBatchResponse batchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    public CreateMessageBatchResponse processedCount(Long processedCount) {
        this.processedCount = processedCount;
        return this;
    }

    public CreateMessageBatchResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public CreateMessageBatchResponse status(String status) {
        this.status = status;
        return this;
    }

    public CreateMessageBatchResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public CreateMessageBatchResponse rejected(RejectedMessageInfo[] rejected) {
        this.rejected = rejected;
        return this;
    }
}
