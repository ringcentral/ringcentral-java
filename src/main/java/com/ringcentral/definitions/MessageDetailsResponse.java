package com.ringcentral.definitions;


    // Detailed information on a message
public class MessageDetailsResponse
{
    /**
         * Internal identifier of a message
         */
        public String id;
  public MessageDetailsResponse id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message was sent
         */
        public String from;
  public MessageDetailsResponse from(String from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * List of phone numbers in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which the message was sent
         */
        public String[] to;
  public MessageDetailsResponse to(String[] to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * Text of a message, maximum number of characters is 1000
         */
        public String text;
  public MessageDetailsResponse text(String text)
  {
    this.text = text;
    return this;
  }
  

        /**
         * The time when this is message was created.
         */
        public String creationTime;
  public MessageDetailsResponse creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * The time when this message was last updated.
         */
        public String lastModifiedTime;
  public MessageDetailsResponse lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Current status of a message
         * Enum: Queued, Delivered, Sent, SendingFailed, DeliveryFailed
         */
        public String messageStatus;
  public MessageDetailsResponse messageStatus(String messageStatus)
  {
    this.messageStatus = messageStatus;
    return this;
  }
  

        /**
         * Number of segments of a message
         */
        public Long segmentCount;
  public MessageDetailsResponse segmentCount(Long segmentCount)
  {
    this.segmentCount = segmentCount;
    return this;
  }
  

        /**
         * Cost of a message
         */
        public Double cost;
  public MessageDetailsResponse cost(Double cost)
  {
    this.cost = cost;
    return this;
  }
  

        /**
         * The batch in which the message was submitted
         */
        public String batchId;
  public MessageDetailsResponse batchId(String batchId)
  {
    this.batchId = batchId;
    return this;
  }
  

        /**
         * Indicates whether the message is outbound or inbound
         * Enum: Inbound, Outbound
         */
        public String direction;
  public MessageDetailsResponse direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * RC error code of the message sending failure reason
         */
        public String errorCode;
  public MessageDetailsResponse errorCode(String errorCode)
  {
    this.errorCode = errorCode;
    return this;
  }
  
}
