package com.ringcentral.definitions;


public class CallsByResult {
    /**
     * Required
     * Format: double
     */
    public Double completed;
    /**
     * Required
     * Format: double
     */
    public Double abandoned;
    /**
     * Required
     * Format: double
     */
    public Double voicemail;
    /**
     * Required
     * Format: double
     */
    public Double missed;
    /**
     * Required
     * Format: double
     */
    public Double accepted;
    /**
     * Required
     * Format: double
     */
    public Double unknown;

    public CallsByResult completed(Double completed) {
        this.completed = completed;
        return this;
    }

    public CallsByResult abandoned(Double abandoned) {
        this.abandoned = abandoned;
        return this;
    }

    public CallsByResult voicemail(Double voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public CallsByResult missed(Double missed) {
        this.missed = missed;
        return this;
    }

    public CallsByResult accepted(Double accepted) {
        this.accepted = accepted;
        return this;
    }

    public CallsByResult unknown(Double unknown) {
        this.unknown = unknown;
        return this;
    }
}
