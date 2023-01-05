package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByResult
{
    /**
     * Required
     * Format: double
     */
    public Double completed;
    public AnalyticsLegacyCallsByResult completed(Double completed)
    {
        this.completed = completed;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double abandoned;
    public AnalyticsLegacyCallsByResult abandoned(Double abandoned)
    {
        this.abandoned = abandoned;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double voicemail;
    public AnalyticsLegacyCallsByResult voicemail(Double voicemail)
    {
        this.voicemail = voicemail;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double missed;
    public AnalyticsLegacyCallsByResult missed(Double missed)
    {
        this.missed = missed;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double accepted;
    public AnalyticsLegacyCallsByResult accepted(Double accepted)
    {
        this.accepted = accepted;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double unknown;
    public AnalyticsLegacyCallsByResult unknown(Double unknown)
    {
        this.unknown = unknown;
        return this;
    }
}