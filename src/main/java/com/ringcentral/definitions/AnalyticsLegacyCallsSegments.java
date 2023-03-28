package com.ringcentral.definitions;


public class AnalyticsLegacyCallsSegments {
    /**
     * Required
     * Format: double
     */
    public Double ringing;
    /**
     * Required
     * Format: double
     */
    public Double liveTalk;
    /**
     * Required
     * Format: double
     */
    public Double holds;
    /**
     * Required
     * Format: double
     */
    public Double parks;
    /**
     * Required
     * Format: double
     */
    public Double transfers;
    /**
     * Required
     * Format: double
     */
    public Double ivrPrompts;
    /**
     * Required
     * Format: double
     */
    public Double voicemail;
    /**
     * Required
     * Format: double
     */
    public Double vmGreetings;
    /**
     * Required
     * Format: double
     */
    public Double setup;

    public AnalyticsLegacyCallsSegments ringing(Double ringing) {
        this.ringing = ringing;
        return this;
    }

    public AnalyticsLegacyCallsSegments liveTalk(Double liveTalk) {
        this.liveTalk = liveTalk;
        return this;
    }

    public AnalyticsLegacyCallsSegments holds(Double holds) {
        this.holds = holds;
        return this;
    }

    public AnalyticsLegacyCallsSegments parks(Double parks) {
        this.parks = parks;
        return this;
    }

    public AnalyticsLegacyCallsSegments transfers(Double transfers) {
        this.transfers = transfers;
        return this;
    }

    public AnalyticsLegacyCallsSegments ivrPrompts(Double ivrPrompts) {
        this.ivrPrompts = ivrPrompts;
        return this;
    }

    public AnalyticsLegacyCallsSegments voicemail(Double voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public AnalyticsLegacyCallsSegments vmGreetings(Double vmGreetings) {
        this.vmGreetings = vmGreetings;
        return this;
    }

    public AnalyticsLegacyCallsSegments setup(Double setup) {
        this.setup = setup;
        return this;
    }
}
