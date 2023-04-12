package com.ringcentral.definitions;


public class WordSegment {
    /**
     * Example: JohnDoe
     */
    public String speakerId;
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
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    /**
     * Required
     * Example: hello
     */
    public String word;

    public WordSegment speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    public WordSegment start(Double start) {
        this.start = start;
        return this;
    }

    public WordSegment end(Double end) {
        this.end = end;
        return this;
    }

    public WordSegment confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public WordSegment word(String word) {
        this.word = word;
        return this;
    }
}
