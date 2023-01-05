package com.ringcentral.definitions;


public class AnalyticsLegacyCallsByResponse
{
    /**
     * Required
     * Format: double
     */
    public Double answered;
    public AnalyticsLegacyCallsByResponse answered(Double answered)
    {
        this.answered = answered;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double notAnswered;
    public AnalyticsLegacyCallsByResponse notAnswered(Double notAnswered)
    {
        this.notAnswered = notAnswered;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double connected;
    public AnalyticsLegacyCallsByResponse connected(Double connected)
    {
        this.connected = connected;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double notConnected;
    public AnalyticsLegacyCallsByResponse notConnected(Double notConnected)
    {
        this.notConnected = notConnected;
        return this;
    }
}