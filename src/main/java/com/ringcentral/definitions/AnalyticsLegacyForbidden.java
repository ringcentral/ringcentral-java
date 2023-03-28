package com.ringcentral.definitions;


public class AnalyticsLegacyForbidden {
    /**
     *
     */
    public AnalyticsLegacyErrorBody[] errors;

    public AnalyticsLegacyForbidden errors(AnalyticsLegacyErrorBody[] errors) {
        this.errors = errors;
        return this;
    }
}
