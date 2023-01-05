package com.ringcentral.definitions;


public class AnalyticsLegacyCallSegmentFilter
{
    /**
     * Required
     * Enum: Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup
     */
    public String callSegment;
    public AnalyticsLegacyCallSegmentFilter callSegment(String callSegment)
    {
        this.callSegment = callSegment;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter callSegmentLength;
    public AnalyticsLegacyCallSegmentFilter callSegmentLength(AnalyticsLegacyPerformanceCallsCallSegmentLengthFilter callSegmentLength)
    {
        this.callSegmentLength = callSegmentLength;
        return this;
    }
}