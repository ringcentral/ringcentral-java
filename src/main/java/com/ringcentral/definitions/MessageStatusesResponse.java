package com.ringcentral.definitions;


    /**
* The messages status object with details of each status
*/
public class MessageStatusesResponse
{
    /**
     */
    public MessageStatusCounts queued;
    public MessageStatusesResponse queued(MessageStatusCounts queued)
    {
        this.queued = queued;
        return this;
    }

    /**
     */
    public MessageStatusCounts delivered;
    public MessageStatusesResponse delivered(MessageStatusCounts delivered)
    {
        this.delivered = delivered;
        return this;
    }

    /**
     */
    public MessageStatusCounts deliveryFailed;
    public MessageStatusesResponse deliveryFailed(MessageStatusCounts deliveryFailed)
    {
        this.deliveryFailed = deliveryFailed;
        return this;
    }

    /**
     */
    public MessageStatusCounts sent;
    public MessageStatusesResponse sent(MessageStatusCounts sent)
    {
        this.sent = sent;
        return this;
    }

    /**
     */
    public MessageStatusCounts sendingFailed;
    public MessageStatusesResponse sendingFailed(MessageStatusCounts sendingFailed)
    {
        this.sendingFailed = sendingFailed;
        return this;
    }
}