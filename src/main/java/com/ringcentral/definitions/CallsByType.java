package com.ringcentral.definitions;


public class CallsByType {
    /**
     * Required
     * Format: double
     */
    public Double direct;
    /**
     * Required
     * Format: double
     */
    public Double fromQueue;
    /**
     * Required
     * Format: double
     */
    public Double parkRetrieval;
    /**
     * Required
     * Format: double
     */
    public Double transferred;
    /**
     * Required
     * Format: double
     */
    public Double outbound;

    public CallsByType direct(Double direct) {
        this.direct = direct;
        return this;
    }

    public CallsByType fromQueue(Double fromQueue) {
        this.fromQueue = fromQueue;
        return this;
    }

    public CallsByType parkRetrieval(Double parkRetrieval) {
        this.parkRetrieval = parkRetrieval;
        return this;
    }

    public CallsByType transferred(Double transferred) {
        this.transferred = transferred;
        return this;
    }

    public CallsByType outbound(Double outbound) {
        this.outbound = outbound;
        return this;
    }
}
