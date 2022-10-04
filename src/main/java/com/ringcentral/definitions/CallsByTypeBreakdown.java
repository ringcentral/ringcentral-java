package com.ringcentral.definitions;


/**
 * Result breakdown by type
 */
public class CallsByTypeBreakdown {
    /**
     * Value for Direct type
     * Required
     * Format: double
     */
    public Double direct;
    /**
     * Value for FromQueue type
     * Required
     * Format: double
     */
    public Double fromQueue;
    /**
     * Value for ParkRetrieval type
     * Required
     * Format: double
     */
    public Double parkRetrieval;
    /**
     * Value for Transferred type
     * Required
     * Format: double
     */
    public Double transferred;
    /**
     * Value for Outbound type
     * Required
     * Format: double
     */
    public Double outbound;

    public CallsByTypeBreakdown direct(Double direct) {
        this.direct = direct;
        return this;
    }

    public CallsByTypeBreakdown fromQueue(Double fromQueue) {
        this.fromQueue = fromQueue;
        return this;
    }

    public CallsByTypeBreakdown parkRetrieval(Double parkRetrieval) {
        this.parkRetrieval = parkRetrieval;
        return this;
    }

    public CallsByTypeBreakdown transferred(Double transferred) {
        this.transferred = transferred;
        return this;
    }

    public CallsByTypeBreakdown outbound(Double outbound) {
        this.outbound = outbound;
        return this;
    }
}
