package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByResult {
    /**
     * Required
     * Format: double
     */
    public Double completed;
    /**
     * Required
     * Format: double
     */
    public Double abandoned;
    /**
     * Required
     * Format: double
     */
    public Double voicemail;
    /**
     * Required
     * Format: double
     */
    public Double missed;
    /**
     * Required
     * Format: double
     */
    public Double accepted;
    /**
     * Required
     * Format: double
     */
    public Double unknown;

    public AnalyticsLegacyCallsByResult completed(Double completed) {
        this.completed = completed;
        return this;
    }

    public AnalyticsLegacyCallsByResult abandoned(Double abandoned) {
        this.abandoned = abandoned;
        return this;
    }

    public AnalyticsLegacyCallsByResult voicemail(Double voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public AnalyticsLegacyCallsByResult missed(Double missed) {
        this.missed = missed;
        return this;
    }

    public AnalyticsLegacyCallsByResult accepted(Double accepted) {
        this.accepted = accepted;
        return this;
    }

    public AnalyticsLegacyCallsByResult unknown(Double unknown) {
        this.unknown = unknown;
        return this;
    }
}
