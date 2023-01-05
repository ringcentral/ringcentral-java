package com.ringcentral.definitions;


public class AnalyticsLegacyUnauthorized
{
    /**
     */
    public AnalyticsLegacyErrorBody[] errors;
    public AnalyticsLegacyUnauthorized errors(AnalyticsLegacyErrorBody[] errors)
    {
        this.errors = errors;
        return this;
    }
}