package com.ringcentral.definitions;


/**
 * Result breakdown by queue hours
 */
public class CallsByQueueHoursBreakdown {
    /**
     * Value for BusinessHours queue hours
     * Required
     * Format: double
     */
    public Double businessHours;
    /**
     * Value for AfterHours queue hours
     * Required
     * Format: double
     */
    public Double afterHours;

    public CallsByQueueHoursBreakdown businessHours(Double businessHours) {
        this.businessHours = businessHours;
        return this;
    }

    public CallsByQueueHoursBreakdown afterHours(Double afterHours) {
        this.afterHours = afterHours;
        return this;
    }
}
