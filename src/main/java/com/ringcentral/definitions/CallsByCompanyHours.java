package com.ringcentral.definitions;


public class CallsByCompanyHours {
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

    public CallsByCompanyHours businessHours(Double businessHours) {
        this.businessHours = businessHours;
        return this;
    }

    public CallsByCompanyHours afterHours(Double afterHours) {
        this.afterHours = afterHours;
        return this;
    }
}
