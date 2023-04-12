package com.ringcentral.definitions;


public class InteractionApiResponseResponse {
    /**
     *
     */
    public UtteranceInsightsObject[] utteranceInsights;
    /**
     *
     */
    public SpeakerInsightsObject speakerInsights;
    /**
     *
     */
    public ConversationalInsightsUnit[] conversationalInsights;

    public InteractionApiResponseResponse utteranceInsights(UtteranceInsightsObject[] utteranceInsights) {
        this.utteranceInsights = utteranceInsights;
        return this;
    }

    public InteractionApiResponseResponse speakerInsights(SpeakerInsightsObject speakerInsights) {
        this.speakerInsights = speakerInsights;
        return this;
    }

    public InteractionApiResponseResponse conversationalInsights(ConversationalInsightsUnit[] conversationalInsights) {
        this.conversationalInsights = conversationalInsights;
        return this;
    }
}
