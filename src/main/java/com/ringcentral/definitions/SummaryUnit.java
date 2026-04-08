package com.ringcentral.definitions;


public class SummaryUnit
{
    /**
     * Required
     * Example: JohnDoe
     */
    public String speakerId;
    public SummaryUnit speakerId(String speakerId)
    {
        this.speakerId = speakerId;
        return this;
    }

    /**
     * Required
     * Example: Hello! This is John.
     */
    public String text;
    public SummaryUnit text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * Required
     * Format: float
     * Example: 0.3
     */
    public Double start;
    public SummaryUnit start(Double start)
    {
        this.start = start;
        return this;
    }

    /**
     * Required
     * Format: float
     * Example: 5.1
     */
    public Double end;
    public SummaryUnit end(Double end)
    {
        this.end = end;
        return this;
    }
}