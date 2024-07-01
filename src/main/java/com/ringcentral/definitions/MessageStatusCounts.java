package com.ringcentral.definitions;


/**
 * Message status parameters
 */
public class MessageStatusCounts {
    /**
     * Total cost of all messages with this status code
     * Format: float
     */
    public Double cost;
    /**
     * Count of messages with this status code
     * Format: int32
     * Example: 7
     */
    public Long count;
    /**
     * Message sending/delivery errors. Returned in `deliveryFailed` and `sendingFailed` resources
     */
    public Object errorCodeCounts;

    public MessageStatusCounts cost(Double cost) {
        this.cost = cost;
        return this;
    }

    public MessageStatusCounts count(Long count) {
        this.count = count;
        return this;
    }

    public MessageStatusCounts errorCodeCounts(Object errorCodeCounts) {
        this.errorCodeCounts = errorCodeCounts;
        return this;
    }
}
