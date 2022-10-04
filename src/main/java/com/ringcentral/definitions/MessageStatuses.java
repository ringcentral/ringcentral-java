package com.ringcentral.definitions;


/**
 * The messages status object with details of each status
 */
public class MessageStatuses {
    /**
     *
     */
    public MessageStatusCounts Queued;
    /**
     *
     */
    public MessageStatusCounts Delivered;
    /**
     *
     */
    public MessageStatusCounts DeliveryFailed;
    /**
     *
     */
    public MessageStatusCounts Sent;
    /**
     *
     */
    public MessageStatusCounts SendingFailed;

    public MessageStatuses Queued(MessageStatusCounts Queued) {
        this.Queued = Queued;
        return this;
    }

    public MessageStatuses Delivered(MessageStatusCounts Delivered) {
        this.Delivered = Delivered;
        return this;
    }

    public MessageStatuses DeliveryFailed(MessageStatusCounts DeliveryFailed) {
        this.DeliveryFailed = DeliveryFailed;
        return this;
    }

    public MessageStatuses Sent(MessageStatusCounts Sent) {
        this.Sent = Sent;
        return this;
    }

    public MessageStatuses SendingFailed(MessageStatusCounts SendingFailed) {
        this.SendingFailed = SendingFailed;
        return this;
    }
}
