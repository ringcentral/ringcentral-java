package com.ringcentral.definitions;


public class GetMessageForwardingInfo
{
    /**
     */
    public MessageStoreCallerInfoResponseTo originalSender;
    public GetMessageForwardingInfo originalSender(MessageStoreCallerInfoResponseTo originalSender)
    {
        this.originalSender = originalSender;
        return this;
    }

    /**
     * Original message creation date/time in ISO 8601 format including timezone,
    * for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String originalCreationTime;
    public GetMessageForwardingInfo originalCreationTime(String originalCreationTime)
    {
        this.originalCreationTime = originalCreationTime;
        return this;
    }
}