package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByQueueSla {
    /**
     * Required
     * Format: double
     */
    public Double inSla;
    /**
     * Required
     * Format: double
     */
    public Double outOfSla;

    public AnalyticsLegacyCallsByQueueSla inSla(Double inSla) {
        this.inSla = inSla;
        return this;
    }

    public AnalyticsLegacyCallsByQueueSla outOfSla(Double outOfSla) {
        this.outOfSla = outOfSla;
        return this;
    }
}
