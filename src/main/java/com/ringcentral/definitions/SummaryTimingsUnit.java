package com.ringcentral.definitions;


public class SummaryTimingsUnit {
    /**
     * Format: float
     * Example: 0.97
     */
    public Double confidence;
    /**
     * Required
     * Example: This meeting is focussed on rise of on demand marketplaces, online marketplaces and regulated services
     */
    public String value;
    /**
     * Format: float
     * Example: 0.3
     */
    public Double start;
    /**
     * Format: float
     * Example: 3600.1
     */
    public Double end;

    public SummaryTimingsUnit confidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public SummaryTimingsUnit value(String value) {
        this.value = value;
        return this;
    }

    public SummaryTimingsUnit start(Double start) {
        this.start = start;
        return this;
    }

    public SummaryTimingsUnit end(Double end) {
        this.end = end;
        return this;
    }
}
