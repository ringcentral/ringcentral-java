package com.ringcentral.definitions;


public class WordSegment
{
    /**
     * Example: JohnDoe
     */
    public String speakerId;
    public WordSegment speakerId(String speakerId)
    {
        this.speakerId = speakerId;
        return this;
    }

    /**
     * Required
     * Format: float
     * Example: 0.3
     */
    public Double start;
    public WordSegment start(Double start)
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
    public WordSegment end(Double end)
    {
        this.end = end;
        return this;
    }

    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    public WordSegment confidence(Double confidence)
    {
        this.confidence = confidence;
        return this;
    }

    /**
     * Required
     * Example: hello
     */
    public String word;
    public WordSegment word(String word)
    {
        this.word = word;
        return this;
    }
}