package com.ringcentral.definitions;


    /**
* The messages status object with details of each status
*/
public class MessageStatuses
{
    /**
     */
    public MessageStatusCounts Queued;
    public MessageStatuses Queued(MessageStatusCounts Queued)
    {
        this.Queued = Queued;
        return this;
    }

    /**
     */
    public MessageStatusCounts Delivered;
    public MessageStatuses Delivered(MessageStatusCounts Delivered)
    {
        this.Delivered = Delivered;
        return this;
    }

    /**
     */
    public MessageStatusCounts DeliveryFailed;
    public MessageStatuses DeliveryFailed(MessageStatusCounts DeliveryFailed)
    {
        this.DeliveryFailed = DeliveryFailed;
        return this;
    }

    /**
     */
    public MessageStatusCounts Sent;
    public MessageStatuses Sent(MessageStatusCounts Sent)
    {
        this.Sent = Sent;
        return this;
    }

    /**
     */
    public MessageStatusCounts SendingFailed;
    public MessageStatuses SendingFailed(MessageStatusCounts SendingFailed)
    {
        this.SendingFailed = SendingFailed;
        return this;
    }
}