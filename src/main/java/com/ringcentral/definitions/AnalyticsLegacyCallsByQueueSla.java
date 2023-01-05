package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByQueueSla
{
    /**
     * Required
     * Format: double
     */
    public Double inSla;
    public AnalyticsLegacyCallsByQueueSla inSla(Double inSla)
    {
        this.inSla = inSla;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double outOfSla;
    public AnalyticsLegacyCallsByQueueSla outOfSla(Double outOfSla)
    {
        this.outOfSla = outOfSla;
        return this;
    }
}