package com.ringcentral.definitions;


public class AnalyticsLegacyBadRequest
{
    /**
     */
    public AnalyticsLegacyErrorBody[] errors;
    public AnalyticsLegacyBadRequest errors(AnalyticsLegacyErrorBody[] errors)
    {
        this.errors = errors;
        return this;
    }
}