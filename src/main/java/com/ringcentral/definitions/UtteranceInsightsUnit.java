package com.ringcentral.definitions;


public class UtteranceInsightsUnit {
    /**
     * Required
     * Example: Emotion
     * Enum: Emotion
     */
    public String name;
    /**
     * Required
     * Example: Neutral
     */
    public String value;
    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;

    public UtteranceInsightsUnit name(String name) {
        this.name = name;
        return this;
    }

    public UtteranceInsightsUnit value(String value) {
        this.value = value;
        return this;
    }

    public UtteranceInsightsUnit confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
}
