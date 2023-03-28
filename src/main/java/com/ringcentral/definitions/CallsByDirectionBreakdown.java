package com.ringcentral.definitions;


/**
 * Result breakdown by direction
 */
public class CallsByDirectionBreakdown {
    /**
     * Value for Inbound direction
     * Required
     * Format: double
     */
    public Double inbound;
    /**
     * Value for Outbound direction
     * Required
     * Format: double
     */
    public Double outbound;

    public CallsByDirectionBreakdown inbound(Double inbound) {
        this.inbound = inbound;
        return this;
    }

    public CallsByDirectionBreakdown outbound(Double outbound) {
        this.outbound = outbound;
        return this;
    }
}
