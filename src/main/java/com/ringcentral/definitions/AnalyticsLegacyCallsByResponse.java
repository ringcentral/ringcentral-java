package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByResponse {
    /**
     * Required
     * Format: double
     */
    public Double answered;
    /**
     * Required
     * Format: double
     */
    public Double notAnswered;
    /**
     * Required
     * Format: double
     */
    public Double connected;
    /**
     * Required
     * Format: double
     */
    public Double notConnected;

    public AnalyticsLegacyCallsByResponse answered(Double answered) {
        this.answered = answered;
        return this;
    }

    public AnalyticsLegacyCallsByResponse notAnswered(Double notAnswered) {
        this.notAnswered = notAnswered;
        return this;
    }

    public AnalyticsLegacyCallsByResponse connected(Double connected) {
        this.connected = connected;
        return this;
    }

    public AnalyticsLegacyCallsByResponse notConnected(Double notConnected) {
        this.notConnected = notConnected;
        return this;
    }
}
