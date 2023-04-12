package com.ringcentral.definitions;


public class SpeakerInsightsUnit {
    /**
     * Required
     * Example: TalkToListenRatio
     * Enum: Energy, Pace, TalkToListenRatio
     */
    public String name;
    /**
     * Required
     */
    public SpeakerInsightsValuesItems[] values;

    public SpeakerInsightsUnit name(String name) {
        this.name = name;
        return this;
    }

    public SpeakerInsightsUnit values(SpeakerInsightsValuesItems[] values) {
        this.values = values;
        return this;
    }
}
