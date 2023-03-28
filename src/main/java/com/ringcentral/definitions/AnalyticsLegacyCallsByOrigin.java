package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByOrigin {
    /**
     * Required
     * Format: double
     */
    public Double internal;
    /**
     * Required
     * Format: double
     */
    public Double external;

    public AnalyticsLegacyCallsByOrigin internal(Double internal) {
        this.internal = internal;
        return this;
    }

    public AnalyticsLegacyCallsByOrigin external(Double external) {
        this.external = external;
        return this;
    }
}
