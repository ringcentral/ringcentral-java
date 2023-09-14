package com.ringcentral.definitions;


public class UtteranceInsightsObject {
    /**
     * Required
     * Format: float
     * Example: 0.3
     */
    public Double start;
    /**
     * Required
     * Format: float
     * Example: 5.1
     */
    public Double end;
    /**
     * Required
     * Example: Hello! This is John.
     */
    public String text;
    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    /**
     * Example: JohnDoe
     */
    public String speakerId;
    /**
     *
     */
    public WordTimingsUnit[] wordTimings;
    /**
     *
     */
    public UtteranceInsightsUnit[] insights;

    public UtteranceInsightsObject start(Double start) {
        this.start = start;
        return this;
    }

    public UtteranceInsightsObject end(Double end) {
        this.end = end;
        return this;
    }

    public UtteranceInsightsObject text(String text) {
        this.text = text;
        return this;
    }

    public UtteranceInsightsObject confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public UtteranceInsightsObject speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    public UtteranceInsightsObject wordTimings(WordTimingsUnit[] wordTimings) {
        this.wordTimings = wordTimings;
        return this;
    }

    public UtteranceInsightsObject insights(UtteranceInsightsUnit[] insights) {
        this.insights = insights;
        return this;
    }
}
