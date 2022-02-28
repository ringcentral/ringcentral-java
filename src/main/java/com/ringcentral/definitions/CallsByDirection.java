package com.ringcentral.definitions;


public class CallsByDirection {
    /**
     * Required
     * Format: double
     */
    public Double inbound;
    /**
     * Required
     * Format: double
     */
    public Double outbound;

    public CallsByDirection inbound(Double inbound) {
        this.inbound = inbound;
        return this;
    }

    public CallsByDirection outbound(Double outbound) {
        this.outbound = outbound;
        return this;
    }
}
