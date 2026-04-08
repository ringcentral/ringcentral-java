package com.ringcentral.definitions;


public class SummaryTimingsUnit
{
    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    public SummaryTimingsUnit confidence(Double confidence)
    {
        this.confidence = confidence;
        return this;
    }

    /**
     * Required
     * Example: This meeting is focussed on rise of on demand marketplaces, online marketplaces and regulated services
     */
    public String value;
    public SummaryTimingsUnit value(String value)
    {
        this.value = value;
        return this;
    }

    /**
     * Format: float
     * Example: 0.3
     */
    public Double start;
    public SummaryTimingsUnit start(Double start)
    {
        this.start = start;
        return this;
    }

    /**
     * Format: float
     * Example: 3600.1
     */
    public Double end;
    public SummaryTimingsUnit end(Double end)
    {
        this.end = end;
        return this;
    }
}