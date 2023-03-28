package com.ringcentral.definitions;


/**
 * The count of the status
 */
public class MessageStatusCounts {
    /**
     * The count of the status
     * Format: int64
     * Example: 7
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
