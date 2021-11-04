package com.ringcentral.definitions;


public class CallsDurationByDirection {
    /**
     * Required
     * Format: int64
     */
    public Long inboundCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long outboundCallsSeconds;

    public CallsDurationByDirection inboundCallsSeconds(Long inboundCallsSeconds) {
        this.inboundCallsSeconds = inboundCallsSeconds;
        return this;
    }

    public CallsDurationByDirection outboundCallsSeconds(Long outboundCallsSeconds) {
        this.outboundCallsSeconds = outboundCallsSeconds;
        return this;
    }
}
