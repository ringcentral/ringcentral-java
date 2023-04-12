package com.ringcentral.definitions;


public class ConversationalInsightsUnitValues {
    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    /**
     * Required
     * Example: RingCentral MVP
     */
    public String value;
    /**
     * Required
     * Format: float
     * Example: 4.7
     */
    public Double start;
    /**
     * Required
     * Format: float
     * Example: 5.1
     */
    public Double end;

    public ConversationalInsightsUnitValues confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public ConversationalInsightsUnitValues value(String value) {
        this.value = value;
        return this;
    }

    public ConversationalInsightsUnitValues start(Double start) {
        this.start = start;
        return this;
    }

    public ConversationalInsightsUnitValues end(Double end) {
        this.end = end;
        return this;
    }
}
