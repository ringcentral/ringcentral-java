package com.ringcentral.definitions;


public class MessageStoreConfiguration {
    /**
     * Retention policy setting, specifying how long to keep messages; the supported value range is 7-90 days
     * Maximum: 90
     * Minimum: 7
     */
    public Long retentionPeriod;

    public MessageStoreConfiguration retentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

}
