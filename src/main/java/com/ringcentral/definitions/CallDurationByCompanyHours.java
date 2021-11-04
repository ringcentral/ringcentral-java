package com.ringcentral.definitions;


public class CallDurationByCompanyHours {
    /**
     * Required
     * Format: int64
     */
    public Long businessHoursSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long afterHoursSeconds;

    public CallDurationByCompanyHours businessHoursSeconds(Long businessHoursSeconds) {
        this.businessHoursSeconds = businessHoursSeconds;
        return this;
    }

    public CallDurationByCompanyHours afterHoursSeconds(Long afterHoursSeconds) {
        this.afterHoursSeconds = afterHoursSeconds;
        return this;
    }
}
