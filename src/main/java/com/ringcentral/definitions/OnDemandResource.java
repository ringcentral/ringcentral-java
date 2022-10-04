package com.ringcentral.definitions;


public class OnDemandResource {
    /**
     * Flag for controlling OnDemand Call Recording settings
     */
    public Boolean enabled;
    /**
     * Retention period of a call recording, the default value is 90 days
     * Format: int32
     */
    public Long retentionPeriod;

    public OnDemandResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public OnDemandResource retentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }
}
