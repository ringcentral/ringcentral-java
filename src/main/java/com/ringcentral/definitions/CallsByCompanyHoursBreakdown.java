package com.ringcentral.definitions;


    /**
* Result breakdown by company hours
*/
public class CallsByCompanyHoursBreakdown
{
    /**
     * Value for BusinessHours company hours
     * Required
     * Format: double
     */
    public Double businessHours;
    public CallsByCompanyHoursBreakdown businessHours(Double businessHours)
    {
        this.businessHours = businessHours;
        return this;
    }

    /**
     * Value for AfterHours company hours
     * Required
     * Format: double
     */
    public Double afterHours;
    public CallsByCompanyHoursBreakdown afterHours(Double afterHours)
    {
        this.afterHours = afterHours;
        return this;
    }
}