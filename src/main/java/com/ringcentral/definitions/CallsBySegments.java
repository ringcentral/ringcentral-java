package com.ringcentral.definitions;


public class CallsBySegments {
    /**
     * Required
     * Format: int64
     */
    public Long ringing;
    /**
     * Required
     * Format: int64
     */
    public Long liveTalk;
    /**
     * Required
     * Format: int64
     */
    public Long holds;
    /**
     * Required
     * Format: int64
     */
    public Long parks;
    /**
     * Required
     * Format: int64
     */
    public Long transfers;
    /**
     * Required
     * Format: int64
     */
    public Long ivrPrompts;
    /**
     * Required
     * Format: int64
     */
    public Long voiceMailing;
    /**
     * Required
     * Format: int64
     */
    public Long vmGreetings;

    public CallsBySegments ringing(Long ringing) {
        this.ringing = ringing;
        return this;
    }

    public CallsBySegments liveTalk(Long liveTalk) {
        this.liveTalk = liveTalk;
        return this;
    }

    public CallsBySegments holds(Long holds) {
        this.holds = holds;
        return this;
    }

    public CallsBySegments parks(Long parks) {
        this.parks = parks;
        return this;
    }

    public CallsBySegments transfers(Long transfers) {
        this.transfers = transfers;
        return this;
    }

    public CallsBySegments ivrPrompts(Long ivrPrompts) {
        this.ivrPrompts = ivrPrompts;
        return this;
    }

    public CallsBySegments voiceMailing(Long voiceMailing) {
        this.voiceMailing = voiceMailing;
        return this;
    }

    public CallsBySegments vmGreetings(Long vmGreetings) {
        this.vmGreetings = vmGreetings;
        return this;
    }
}
