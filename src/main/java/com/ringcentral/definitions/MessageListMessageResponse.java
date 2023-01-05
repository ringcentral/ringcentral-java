package com.ringcentral.definitions;


    /**
* The short detail of the message in the get batch response
*/
public class MessageListMessageResponse
{
    /**
     * The Id of the message
     * Format: int64
     * Example: 1234
     */
    public Long id;
    public MessageListMessageResponse id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Internal identifier of a batch the message was submitted in
     * Example: 12345
     */
    public String batchId;
    public MessageListMessageResponse batchId(String batchId)
    {
        this.batchId = batchId;
        return this;
    }

    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message is sent
     * Example: 15551234567
     */
    public String from;
    public MessageListMessageResponse from(String from)
    {
        this.from = from;
        return this;
    }

    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which a message is sent
     * Example: 15551234567
     */
    public String[] to;
    public MessageListMessageResponse to(String[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * The time at which the message was created
     * Format: date-time
     */
    public String creationTime;
    public MessageListMessageResponse creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * The time at which the messages was last updated
     * Format: date-time
     */
    public String lastModifiedTime;
    public MessageListMessageResponse lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Current status of a message
     * Example: Queued
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
     * Format: int32
     * Example: 1
     */
    public Long segmentCount;
    public MessageListMessageResponse segmentCount(Long segmentCount)
    {
        this.segmentCount = segmentCount;
        return this;
    }

    /**
     * Text of a message. Returned if the `view` parameter is set to &#039;Detailed&#039;
     */
    public String text;
    public MessageListMessageResponse text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * Cost of a message
     * Format: double
     * Example: 0.007
     */
    public Double cost;
    public MessageListMessageResponse cost(Double cost)
    {
        this.cost = cost;
        return this;
    }

    /**
     * Direction of the SMS message
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
     * Example: SMS-RC-503
     */
    public String errorCode;
    public MessageListMessageResponse errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }
}