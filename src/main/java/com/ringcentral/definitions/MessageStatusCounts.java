package com.ringcentral.definitions;


public class MessageStatusCounts {
    /**
     * Format: int64
     */
    public Long count;
    /**
     * Format: int64
     */
    public Long errorCodeCounts;

    public MessageStatusCounts count(Long count) {
        this.count = count;
        return this;
    }

    public MessageStatusCounts errorCodeCounts(Long errorCodeCounts) {
        this.errorCodeCounts = errorCodeCounts;
        return this;
    }
}
