package com.ringcentral.definitions;


/**
 * Allows more granular control over time included in the report
 */
public class AdvancedTimeSettings {
    /**
     * Days of the week for which the report is calculated
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String[] includeDays;
    /**
     * Hours of the day for which the report is calculated
     */
    public HoursInterval[] includeHours;

    public AdvancedTimeSettings includeDays(String[] includeDays) {
        this.includeDays = includeDays;
        return this;
    }

    public AdvancedTimeSettings includeHours(HoursInterval[] includeHours) {
        this.includeHours = includeHours;
        return this;
    }
}
