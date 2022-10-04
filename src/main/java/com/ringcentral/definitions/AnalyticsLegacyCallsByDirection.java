package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByDirection {
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

    public AnalyticsLegacyCallsByDirection inbound(Double inbound) {
        this.inbound = inbound;
        return this;
    }

    public AnalyticsLegacyCallsByDirection outbound(Double outbound) {
        this.outbound = outbound;
        return this;
    }
}
