package com.ringcentral.definitions;


    // Batch of A2P SMS messages. This object provides a specification to send message(s) to many recipients. It contains top-level attributes which apply to all messages. In addition to that, it is possible to override this attribute for each message. This way a single API call may be used to send individual messages to many recipients
public class CreateMessageBatchResponse
{
    /**
         * Unique identifier of the message batch
         */
        public String id;
  public CreateMessageBatchResponse id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the messages are going to be sent
         * Required
         */
        public String from;
  public CreateMessageBatchResponse from(String from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Total number of messages in the accepted batch
         */
        public Long batchSize;
  public CreateMessageBatchResponse batchSize(Long batchSize)
  {
    this.batchSize = batchSize;
    return this;
  }
  

        /**
         * Total number of messages currently processed in the batch
         */
        public Long processedCount;
  public CreateMessageBatchResponse processedCount(Long processedCount)
  {
    this.processedCount = processedCount;
    return this;
  }
  

        /**
         * The last time the batch was processed.
         */
        public String lastModifiedTime;
  public CreateMessageBatchResponse lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Current status of a message batch
         * Enum: Processing, Sent, Completed
         */
        public String status;
  public CreateMessageBatchResponse status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * The time at which the batch was created
         */
        public String creationTime;
  public CreateMessageBatchResponse creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         */
        public RejectedMessageInfo[] rejected;
  public CreateMessageBatchResponse rejected(RejectedMessageInfo[] rejected)
  {
    this.rejected = rejected;
    return this;
  }
  
}
