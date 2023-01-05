package com.ringcentral.definitions;


    /**
* Complete details of the message
*/
public class MessageDetailsResponse
{
    /**
     * Internal identifier of a message
     * Example: 1234
     */
    public String id;
    public MessageDetailsResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format from which the message was sent
     * Example: 15551234567
     */
    public String from;
    public MessageDetailsResponse from(String from)
    {
        this.from = from;
        return this;
    }

    /**
     * List of phone numbers in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format to which the message was sent
     * Example: 15551234567
     */
    public String[] to;
    public MessageDetailsResponse to(String[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * Text of a message, maximum number of characters is 1000
     * Example: Hello, World!
     */
    public String text;
    public MessageDetailsResponse text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * The time when this is message was created.
     * Format: date-time
     */
    public String creationTime;
    public MessageDetailsResponse creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * The time when this message was last updated.
     * Format: date-time
     */
    public String lastModifiedTime;
    public MessageDetailsResponse lastModifiedTime(String lastModifiedTime)
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
    public MessageDetailsResponse messageStatus(String messageStatus)
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
    public MessageDetailsResponse segmentCount(Long segmentCount)
    {
        this.segmentCount = segmentCount;
        return this;
    }

    /**
     * Cost of a message
     * Format: double
     * Example: 0.007
     */
    public Double cost;
    public MessageDetailsResponse cost(Double cost)
    {
        this.cost = cost;
        return this;
    }

    /**
     * The batch in which the message was submitted
     * Example: batch12345
     */
    public String batchId;
    public MessageDetailsResponse batchId(String batchId)
    {
        this.batchId = batchId;
        return this;
    }

    /**
     * Direction of the SMS message
     * Enum: Inbound, Outbound
     */
    public String direction;
    public MessageDetailsResponse direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * The RC error code of the message sending failure reason
     * Example: SMS-RC-503
     */
    public String errorCode;
    public MessageDetailsResponse errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }
}