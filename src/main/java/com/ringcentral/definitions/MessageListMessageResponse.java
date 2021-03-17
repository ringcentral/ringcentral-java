package com.ringcentral.definitions;


    // Infomation on a message returned within the specified batch
public class MessageListMessageResponse
{
    /**
         * Internal identifier of a message
         */
        public Long id;
  public MessageListMessageResponse id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Internal identifier of a batch the message was submitted in
         */
        public String batchId;
  public MessageListMessageResponse batchId(String batchId)
  {
    this.batchId = batchId;
    return this;
  }
  

        /**
         * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message is sent
         */
        public String from;
  public MessageListMessageResponse from(String from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which a message is sent
         */
        public String[] to;
  public MessageListMessageResponse to(String[] to)
  {
    this.to = to;
    return this;
  }
  

        /**
         * The time at which the message was created
         */
        public String creationTime;
  public MessageListMessageResponse creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * The time at which the messages was last updated
         */
        public String lastModifiedTime;
  public MessageListMessageResponse lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * Current status of a message
         * Enum: Queued, Delivered, Sent, SendingFailed, DeliveryFailed
         */
        public String messageStatus;
  public MessageListMessageResponse messageStatus(String messageStatus)
  {
    this.messageStatus = messageStatus;
    return this;
  }
  

        /**
         * Number of segments of a message
         */
        public Long segmentCount;
  public MessageListMessageResponse segmentCount(Long segmentCount)
  {
    this.segmentCount = segmentCount;
    return this;
  }
  

        /**
         * Text of a message. Returned if the `view` parameter is set to 'Detailed'
         */
        public String text;
  public MessageListMessageResponse text(String text)
  {
    this.text = text;
    return this;
  }
  

        /**
         * Cost of a message
         */
        public Double cost;
  public MessageListMessageResponse cost(Double cost)
  {
    this.cost = cost;
    return this;
  }
  

        /**
         * Indicates whether the message was outbound or inbound
         * Enum: Inbound, Outbound
         */
        public String direction;
  public MessageListMessageResponse direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         * The RC error code of the message sending failure reason
         */
        public String errorCode;
  public MessageListMessageResponse errorCode(String errorCode)
  {
    this.errorCode = errorCode;
    return this;
  }
  
}
