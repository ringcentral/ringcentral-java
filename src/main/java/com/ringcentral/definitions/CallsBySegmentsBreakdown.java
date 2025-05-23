package com.ringcentral.definitions;


/**
 * Result breakdown by segments
 */
public class CallsBySegmentsBreakdown {
    /**
     * Value for Ringing segment
     * Required
     * Format: double
     */
    public Double ringing;
    /**
     * Value for LiveTalk segment
     * Required
     * Format: double
     */
    public Double liveTalk;
    /**
     * Value for Hold segment
     * Required
     * Format: double
     */
    public Double hold;
    /**
     * Value for Park segment
     * Required
     * Format: double
     */
    public Double park;
    /**
     * Value for Transfer segment
     * Required
     * Format: double
     */
    public Double transfer;
    /**
     * Value for IVRPrompt segment
     * Required
     * Format: double
     */
    public Double ivrPrompt;
    /**
     * Value for Voicemail segment
     * Required
     * Format: double
     */
    public Double voicemail;
    /**
     * Value for VMGreeting segment
     * Required
     * Format: double
     */
    public Double vmGreeting;
    /**
     * Value for Setup segment
     * Required
     * Format: double
     */
    public Double setup;
    /**
     * Value for Forwarding segment
     * Required
     * Format: double
     */
    public Double forwarding;

    public CallsBySegmentsBreakdown ringing(Double ringing) {
        this.ringing = ringing;
        return this;
    }

    public CallsBySegmentsBreakdown liveTalk(Double liveTalk) {
        this.liveTalk = liveTalk;
        return this;
    }

    public CallsBySegmentsBreakdown hold(Double hold) {
        this.hold = hold;
        return this;
    }

    public CallsBySegmentsBreakdown park(Double park) {
        this.park = park;
        return this;
    }

    public CallsBySegmentsBreakdown transfer(Double transfer) {
        this.transfer = transfer;
        return this;
    }

    public CallsBySegmentsBreakdown ivrPrompt(Double ivrPrompt) {
        this.ivrPrompt = ivrPrompt;
        return this;
    }

    public CallsBySegmentsBreakdown voicemail(Double voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public CallsBySegmentsBreakdown vmGreeting(Double vmGreeting) {
        this.vmGreeting = vmGreeting;
        return this;
    }

    public CallsBySegmentsBreakdown setup(Double setup) {
        this.setup = setup;
        return this;
    }

    public CallsBySegmentsBreakdown forwarding(Double forwarding) {
        this.forwarding = forwarding;
        return this;
    }
}
