package com.ringcentral.definitions;


public class CallsSegments {
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

    public CallsSegments ringing(Double ringing) {
        this.ringing = ringing;
        return this;
    }

    public CallsSegments liveTalk(Double liveTalk) {
        this.liveTalk = liveTalk;
        return this;
    }

    public CallsSegments holds(Double holds) {
        this.holds = holds;
        return this;
    }

    public CallsSegments parks(Double parks) {
        this.parks = parks;
        return this;
    }

    public CallsSegments transfers(Double transfers) {
        this.transfers = transfers;
        return this;
    }

    public CallsSegments ivrPrompts(Double ivrPrompts) {
        this.ivrPrompts = ivrPrompts;
        return this;
    }

    public CallsSegments voicemail(Double voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public CallsSegments vmGreetings(Double vmGreetings) {
        this.vmGreetings = vmGreetings;
        return this;
    }
}
