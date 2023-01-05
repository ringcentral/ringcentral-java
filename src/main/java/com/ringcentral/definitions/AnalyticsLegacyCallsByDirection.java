package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByDirection
{
    /**
     * Required
     * Format: double
     */
    public Double inbound;
    public AnalyticsLegacyCallsByDirection inbound(Double inbound)
    {
        this.inbound = inbound;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double outbound;
    public AnalyticsLegacyCallsByDirection outbound(Double outbound)
    {
        this.outbound = outbound;
        return this;
    }
}