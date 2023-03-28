package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByType {
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

    public AnalyticsLegacyCallsByType direct(Double direct) {
        this.direct = direct;
        return this;
    }

    public AnalyticsLegacyCallsByType fromQueue(Double fromQueue) {
        this.fromQueue = fromQueue;
        return this;
    }

    public AnalyticsLegacyCallsByType parkRetrieval(Double parkRetrieval) {
        this.parkRetrieval = parkRetrieval;
        return this;
    }

    public AnalyticsLegacyCallsByType transferred(Double transferred) {
        this.transferred = transferred;
        return this;
    }

    public AnalyticsLegacyCallsByType outbound(Double outbound) {
        this.outbound = outbound;
        return this;
    }
}
