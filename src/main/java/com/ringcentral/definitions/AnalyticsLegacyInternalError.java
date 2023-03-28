package com.ringcentral.definitions;


public class AnalyticsLegacyInternalError {
    /**
     *
     */
    public AnalyticsLegacyErrorBody[] errors;

    public AnalyticsLegacyInternalError errors(AnalyticsLegacyErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
