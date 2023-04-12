package com.ringcentral.definitions;


public class SummaryUnit {
    /**
     * Example: JohnDoe
     */
    public String speakerId;
    /**
     * Required
     * Example: Hello! This is John.
     */
    public String text;
    /**
     * Format: float
     * Example: 0.3
     */
    public Double start;
    /**
     * Format: float
     * Example: 5.1
     */
    public Double end;

    public SummaryUnit speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    public SummaryUnit text(String text) {
        this.text = text;
        return this;
    }

    public SummaryUnit start(Double start) {
        this.start = start;
        return this;
    }

    public SummaryUnit end(Double end) {
        this.end = end;
        return this;
    }
}
