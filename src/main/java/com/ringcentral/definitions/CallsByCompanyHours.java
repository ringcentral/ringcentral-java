package com.ringcentral.definitions;


public class CallsByCompanyHours {
    /**
     * Required
     * Format: int64
     */
    public Long businessHours;
    /**
     * Required
     * Format: int64
     */
    public Long afterHours;

    public CallsByCompanyHours businessHours(Long businessHours) {
        this.businessHours = businessHours;
        return this;
    }

    public CallsByCompanyHours afterHours(Long afterHours) {
        this.afterHours = afterHours;
        return this;
    }
}
