package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByCompanyHours {
    /**
     * Required
     * Format: double
     */
    public Double businessHours;
    /**
     * Required
     * Format: double
     */
    public Double afterHours;

    public AnalyticsLegacyCallsByCompanyHours businessHours(Double businessHours) {
        this.businessHours = businessHours;
        return this;
    }

    public AnalyticsLegacyCallsByCompanyHours afterHours(Double afterHours) {
        this.afterHours = afterHours;
        return this;
    }
}
