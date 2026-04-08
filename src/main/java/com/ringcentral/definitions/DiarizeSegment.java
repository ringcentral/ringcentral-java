package com.ringcentral.definitions;


public class DiarizeSegment
{
    /**
     * Required
     * Example: JohnDoe
     */
    public String speakerId;
    public DiarizeSegment speakerId(String speakerId)
    {
        this.speakerId = speakerId;
        return this;
    }

    /**
     * Required
     * Format: float
     * Example: 0.3
     */
    public Double start;
    public DiarizeSegment start(Double start)
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
    public DiarizeSegment end(Double end)
    {
        this.end = end;
        return this;
    }

    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    public DiarizeSegment confidence(Double confidence)
    {
        this.confidence = confidence;
        return this;
    }
}