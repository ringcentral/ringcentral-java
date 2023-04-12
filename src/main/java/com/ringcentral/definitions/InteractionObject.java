package com.ringcentral.definitions;


public class InteractionObject {
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

    public InteractionObject utteranceInsights(UtteranceInsightsObject[] utteranceInsights) {
        this.utteranceInsights = utteranceInsights;
        return this;
    }

    public InteractionObject speakerInsights(SpeakerInsightsObject speakerInsights) {
        this.speakerInsights = speakerInsights;
        return this;
    }

    public InteractionObject conversationalInsights(ConversationalInsightsUnit[] conversationalInsights) {
        this.conversationalInsights = conversationalInsights;
        return this;
    }
}
