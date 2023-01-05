package com.ringcentral.definitions;


public class AnalyticsLegacyTimelineData
{
    /**
     * Required
     */
    public String key;
    public AnalyticsLegacyTimelineData key(String key)
    {
        this.key = key;
        return this;
    }

    /**
     */
    public AnalyticsLegacyKeyInfo keyInfo;
    public AnalyticsLegacyTimelineData keyInfo(AnalyticsLegacyKeyInfo keyInfo)
    {
        this.keyInfo = keyInfo;
        return this;
    }

    /**
     */
    public AnalyticsLegacyTimelineDataPoint[] points;
    public AnalyticsLegacyTimelineData points(AnalyticsLegacyTimelineDataPoint[] points)
    {
        this.points = points;
        return this;
    }
}