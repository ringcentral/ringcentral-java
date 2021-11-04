package com.ringcentral.definitions;


public class TimeSpentBySegments {
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

    public TimeSpentBySegments ringing(Long ringing) {
        this.ringing = ringing;
        return this;
    }

    public TimeSpentBySegments liveTalk(Long liveTalk) {
        this.liveTalk = liveTalk;
        return this;
    }

    public TimeSpentBySegments holds(Long holds) {
        this.holds = holds;
        return this;
    }

    public TimeSpentBySegments parks(Long parks) {
        this.parks = parks;
        return this;
    }

    public TimeSpentBySegments transfers(Long transfers) {
        this.transfers = transfers;
        return this;
    }

    public TimeSpentBySegments ivrPrompts(Long ivrPrompts) {
        this.ivrPrompts = ivrPrompts;
        return this;
    }

    public TimeSpentBySegments voiceMailing(Long voiceMailing) {
        this.voiceMailing = voiceMailing;
        return this;
    }

    public TimeSpentBySegments vmGreetings(Long vmGreetings) {
        this.vmGreetings = vmGreetings;
        return this;
    }
}
