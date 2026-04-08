package com.ringcentral.definitions;


public class BulletedSummaryInsightUnit
{
    /**
     * Value of the summary
     * Required
     * Example: conversational insights text
     */
    public String value;
    public BulletedSummaryInsightUnit value(String value)
    {
        this.value = value;
        return this;
    }

    /**
     * Section of the summary
     * Example: section name
     */
    public String section;
    public BulletedSummaryInsightUnit section(String section)
    {
        this.section = section;
        return this;
    }
}