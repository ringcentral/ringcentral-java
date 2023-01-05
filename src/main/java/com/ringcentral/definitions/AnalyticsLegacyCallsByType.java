package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByType
{
    /**
     * Required
     * Format: double
     */
    public Double direct;
    public AnalyticsLegacyCallsByType direct(Double direct)
    {
        this.direct = direct;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double fromQueue;
    public AnalyticsLegacyCallsByType fromQueue(Double fromQueue)
    {
        this.fromQueue = fromQueue;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double parkRetrieval;
    public AnalyticsLegacyCallsByType parkRetrieval(Double parkRetrieval)
    {
        this.parkRetrieval = parkRetrieval;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double transferred;
    public AnalyticsLegacyCallsByType transferred(Double transferred)
    {
        this.transferred = transferred;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double outbound;
    public AnalyticsLegacyCallsByType outbound(Double outbound)
    {
        this.outbound = outbound;
        return this;
    }
}