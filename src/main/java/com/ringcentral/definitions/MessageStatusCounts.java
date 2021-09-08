package com.ringcentral.definitions;


public class MessageStatusCounts {
    /**
     * Format: int64
     */
    public Long count;
    /**
     * Cost of a message
     * Format: double
     * Example: 0.007
     */
    public Double cost;
    /**
     * Format: int64
     */
    public Long errorCodeCounts;

    public MessageStatusCounts count(Long count) {
        this.count = count;
        return this;
    }

    public MessageStatusCounts cost(Double cost) {
        this.cost = cost;
        return this;
    }

    public MessageStatusCounts errorCodeCounts(Long errorCodeCounts) {
        this.errorCodeCounts = errorCodeCounts;
        return this;
    }
}
