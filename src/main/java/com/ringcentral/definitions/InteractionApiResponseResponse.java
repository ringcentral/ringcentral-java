package com.ringcentral.definitions;


public class InteractionApiResponseResponse
{
    /**
     */
    public UtteranceInsightsObject[] utteranceInsights;
    public InteractionApiResponseResponse utteranceInsights(UtteranceInsightsObject[] utteranceInsights)
    {
        this.utteranceInsights = utteranceInsights;
        return this;
    }

    /**
     */
    public SpeakerInsightsObject speakerInsights;
    public InteractionApiResponseResponse speakerInsights(SpeakerInsightsObject speakerInsights)
    {
        this.speakerInsights = speakerInsights;
        return this;
    }

    /**
     */
    public ConversationalInsightsUnit[] conversationalInsights;
    public InteractionApiResponseResponse conversationalInsights(ConversationalInsightsUnit[] conversationalInsights)
    {
        this.conversationalInsights = conversationalInsights;
        return this;
    }
}