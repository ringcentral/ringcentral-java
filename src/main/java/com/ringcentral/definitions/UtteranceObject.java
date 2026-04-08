package com.ringcentral.definitions;


public class UtteranceObject
{
    /**
     * Required
     * Format: float
     * Example: 0.3
     */
    public Double start;
    public UtteranceObject start(Double start)
    {
        this.start = start;
        return this;
    }

    /**
     * Required
     * Format: float
     * Example: 5.1
     */
    public Double end;
    public UtteranceObject end(Double end)
    {
        this.end = end;
        return this;
    }

    /**
     * Required
     * Example: Hello! This is John.
     */
    public String text;
    public UtteranceObject text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    public UtteranceObject confidence(Double confidence)
    {
        this.confidence = confidence;
        return this;
    }

    /**
     * Example: JohnDoe
     */
    public String speakerId;
    public UtteranceObject speakerId(String speakerId)
    {
        this.speakerId = speakerId;
        return this;
    }

    /**
     */
    public WordTimingsUnit[] wordTimings;
    public UtteranceObject wordTimings(WordTimingsUnit[] wordTimings)
    {
        this.wordTimings = wordTimings;
        return this;
    }
}