package com.ringcentral.definitions;


/**
 * Result breakdown by company hours
 */
public class CallsByCompanyHoursBreakdown {
    /**
     * Value for BusinessHours company hours
     * Required
     * Format: double
     */
    public Double businessHours;
    /**
     * Value for AfterHours company hours
     * Required
     * Format: double
     */
    public Double afterHours;

    public CallsByCompanyHoursBreakdown businessHours(Double businessHours) {
        this.businessHours = businessHours;
        return this;
    }

    public CallsByCompanyHoursBreakdown afterHours(Double afterHours) {
        this.afterHours = afterHours;
        return this;
    }
}
