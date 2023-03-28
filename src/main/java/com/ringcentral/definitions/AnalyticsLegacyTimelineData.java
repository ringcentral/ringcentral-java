package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineData {
    /**
     * Required
     */
    public String key;
    /**
     *
     */
    public AnalyticsLegacyKeyInfo keyInfo;
    /**
     *
     */
    public AnalyticsLegacyTimelineDataPoint[] points;

    public AnalyticsLegacyTimelineData key(String key) {
        this.key = key;
        return this;
    }

    public AnalyticsLegacyTimelineData keyInfo(AnalyticsLegacyKeyInfo keyInfo) {
        this.keyInfo = keyInfo;
        return this;
    }

    public AnalyticsLegacyTimelineData points(AnalyticsLegacyTimelineDataPoint[] points) {
        this.points = points;
        return this;
    }
}
