package com.ringcentral.definitions;


public class SpeakerInsightsUnit
{
    /**
     * Required
     * Example: TalkToListenRatio
     * Enum: Pace, TalkToListenRatio, QuestionsAsked
     */
    public String name;
    public SpeakerInsightsUnit name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Required
     */
    public SpeakerInsightsValuesItems[] values;
    public SpeakerInsightsUnit values(SpeakerInsightsValuesItems[] values)
    {
        this.values = values;
        return this;
    }
}