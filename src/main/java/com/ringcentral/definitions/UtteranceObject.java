package com.ringcentral.definitions;


public class UtteranceObject {
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

    public UtteranceObject start(Double start) {
        this.start = start;
        return this;
    }

    public UtteranceObject end(Double end) {
        this.end = end;
        return this;
    }

    public UtteranceObject text(String text) {
        this.text = text;
        return this;
    }

    public UtteranceObject confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public UtteranceObject speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    public UtteranceObject wordTimings(WordTimingsUnit[] wordTimings) {
        this.wordTimings = wordTimings;
        return this;
    }
}
