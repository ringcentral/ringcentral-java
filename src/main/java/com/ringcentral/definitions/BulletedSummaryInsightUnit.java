package com.ringcentral.definitions;


public class BulletedSummaryInsightUnit {
    /**
     * Value of the summary
     * Required
     * Example: conversational insights text
     */
    public String value;

    public BulletedSummaryInsightUnit value(String value) {
        this.value = value;
        return this;
    }
}
