package com.ringcentral.definitions;


/**
 * Data for calls with breakdown by company hours (BusinessHours, AfterHours)
 */
public class CallsByCompanyHours {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByCompanyHoursBreakdown values;

    public CallsByCompanyHours valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsByCompanyHours values(CallsByCompanyHoursBreakdown values) {
        this.values = values;
        return this;
    }
}
