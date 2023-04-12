package com.ringcentral.definitions;


public class SpeakerInsightsValuesItems {
    /**
     * Required
     * Example: JohnDoe
     */
    public String speakerId;
    /**
     * The value corresponding to the insight for the speaker
     * Required
     * Example: 20:80
     */
    public String value;

    public SpeakerInsightsValuesItems speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    public SpeakerInsightsValuesItems value(String value) {
        this.value = value;
        return this;
    }
}
