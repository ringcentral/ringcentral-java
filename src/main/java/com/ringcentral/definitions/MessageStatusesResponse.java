package com.ringcentral.definitions;


/**
 * The messages status object with details of each status
 */
public class MessageStatusesResponse {
    /**
     *
     */
    public MessageStatusCounts queued;
    /**
     *
     */
    public MessageStatusCounts delivered;
    /**
     *
     */
    public MessageStatusCounts deliveryFailed;
    /**
     *
     */
    public MessageStatusCounts sent;
    /**
     *
     */
    public MessageStatusCounts sendingFailed;

    public MessageStatusesResponse queued(MessageStatusCounts queued) {
        this.queued = queued;
        return this;
    }

    public MessageStatusesResponse delivered(MessageStatusCounts delivered) {
        this.delivered = delivered;
        return this;
    }

    public MessageStatusesResponse deliveryFailed(MessageStatusCounts deliveryFailed) {
        this.deliveryFailed = deliveryFailed;
        return this;
    }

    public MessageStatusesResponse sent(MessageStatusCounts sent) {
        this.sent = sent;
        return this;
    }

    public MessageStatusesResponse sendingFailed(MessageStatusCounts sendingFailed) {
        this.sendingFailed = sendingFailed;
        return this;
    }
}
