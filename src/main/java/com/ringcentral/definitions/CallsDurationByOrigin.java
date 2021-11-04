package com.ringcentral.definitions;


public class CallsDurationByOrigin {
    /**
     * Required
     * Format: int64
     */
    public Long internalCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long externalCallsSeconds;

    public CallsDurationByOrigin internalCallsSeconds(Long internalCallsSeconds) {
        this.internalCallsSeconds = internalCallsSeconds;
        return this;
    }

    public CallsDurationByOrigin externalCallsSeconds(Long externalCallsSeconds) {
        this.externalCallsSeconds = externalCallsSeconds;
        return this;
    }
}
