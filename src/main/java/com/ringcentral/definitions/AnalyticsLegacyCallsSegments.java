package com.ringcentral.definitions;


public class AnalyticsLegacyCallsSegments
{
    /**
     * Required
     * Format: double
     */
    public Double ringing;
    public AnalyticsLegacyCallsSegments ringing(Double ringing)
    {
        this.ringing = ringing;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double liveTalk;
    public AnalyticsLegacyCallsSegments liveTalk(Double liveTalk)
    {
        this.liveTalk = liveTalk;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double holds;
    public AnalyticsLegacyCallsSegments holds(Double holds)
    {
        this.holds = holds;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double parks;
    public AnalyticsLegacyCallsSegments parks(Double parks)
    {
        this.parks = parks;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double transfers;
    public AnalyticsLegacyCallsSegments transfers(Double transfers)
    {
        this.transfers = transfers;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double ivrPrompts;
    public AnalyticsLegacyCallsSegments ivrPrompts(Double ivrPrompts)
    {
        this.ivrPrompts = ivrPrompts;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double voicemail;
    public AnalyticsLegacyCallsSegments voicemail(Double voicemail)
    {
        this.voicemail = voicemail;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double vmGreetings;
    public AnalyticsLegacyCallsSegments vmGreetings(Double vmGreetings)
    {
        this.vmGreetings = vmGreetings;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double setup;
    public AnalyticsLegacyCallsSegments setup(Double setup)
    {
        this.setup = setup;
        return this;
    }
}