package com.ringcentral.definitions;


public class SummaryInsightUnit
{
    /**
     * Value of the summary
     * Required
     * Example: conversational insights text
     */
    public String value;
    public SummaryInsightUnit value(String value)
    {
        this.value = value;
        return this;
    }

    /**
     * Start time of the insight (in sec)
     * Required
     * Format: float
     * Example: 1.2
     */
    public Double start;
    public SummaryInsightUnit start(Double start)
    {
        this.start = start;
        return this;
    }

    /**
     * End time of the insight (in sec)
     * Required
     * Format: float
     * Example: 4.2
     */
    public Double end;
    public SummaryInsightUnit end(Double end)
    {
        this.end = end;
        return this;
    }
}