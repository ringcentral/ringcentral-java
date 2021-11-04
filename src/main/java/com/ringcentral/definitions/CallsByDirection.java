package com.ringcentral.definitions;


public class CallsByDirection {
    /**
     * Required
     * Format: int64
     */
    public Long inbound;
    /**
     * Required
     * Format: int64
     */
    public Long outbound;

    public CallsByDirection inbound(Long inbound) {
        this.inbound = inbound;
        return this;
    }

    public CallsByDirection outbound(Long outbound) {
        this.outbound = outbound;
        return this;
    }
}
