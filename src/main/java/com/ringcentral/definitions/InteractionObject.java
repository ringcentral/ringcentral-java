package com.ringcentral.definitions;


public class InteractionObject
{
    /**
     */
    public UtteranceInsightsObject[] utteranceInsights;
    public InteractionObject utteranceInsights(UtteranceInsightsObject[] utteranceInsights)
    {
        this.utteranceInsights = utteranceInsights;
        return this;
    }

    /**
     */
    public SpeakerInsightsObject speakerInsights;
    public InteractionObject speakerInsights(SpeakerInsightsObject speakerInsights)
    {
        this.speakerInsights = speakerInsights;
        return this;
    }

    /**
     */
    public ConversationalInsightsUnit[] conversationalInsights;
    public InteractionObject conversationalInsights(ConversationalInsightsUnit[] conversationalInsights)
    {
        this.conversationalInsights = conversationalInsights;
        return this;
    }
}