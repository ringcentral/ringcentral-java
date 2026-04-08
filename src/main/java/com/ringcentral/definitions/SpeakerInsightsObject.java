package com.ringcentral.definitions;


public class SpeakerInsightsObject
{
    /**
     * Format: int32
     * Example: 2
     */
    public Long speakerCount;
    public SpeakerInsightsObject speakerCount(Long speakerCount)
    {
        this.speakerCount = speakerCount;
        return this;
    }

    /**
     */
    public SpeakerInsightsUnit[] insights;
    public SpeakerInsightsObject insights(SpeakerInsightsUnit[] insights)
    {
        this.insights = insights;
        return this;
    }
}