package com.ringcentral.definitions;


/**
 * Result breakdown by call result
 */
public class CallsByResultBreakdown {
    /**
     * Value for Completed result
     * Required
     * Format: double
     */
    public Double completed;
    /**
     * Value for Abandoned result
     * Required
     * Format: double
     */
    public Double abandoned;
    /**
     * Value for Voicemail result
     * Required
     * Format: double
     */
    public Double voicemail;
    /**
     * Value for Missed result
     * Required
     * Format: double
     */
    public Double missed;
    /**
     * Value for Accepted result
     * Required
     * Format: double
     */
    public Double accepted;
    /**
     * Value for Unknown result
     * Required
     * Format: double
     */
    public Double unknown;
    /**
     * Value for Transferred result
     * Required
     * Format: double
     */
    public Double transferred;
    /**
     * Value for PickedUp result
     * Required
     * Format: double
     */
    public Double pickedUp;
    /**
     * Value for AnsweredElsewhere result
     * Required
     * Format: double
     */
    public Double answeredElsewhere;
    /**
     * Value for Forwarded result
     * Required
     * Format: double
     */
    public Double forwarded;

    public CallsByResultBreakdown completed(Double completed) {
        this.completed = completed;
        return this;
    }

    public CallsByResultBreakdown abandoned(Double abandoned) {
        this.abandoned = abandoned;
        return this;
    }

    public CallsByResultBreakdown voicemail(Double voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public CallsByResultBreakdown missed(Double missed) {
        this.missed = missed;
        return this;
    }

    public CallsByResultBreakdown accepted(Double accepted) {
        this.accepted = accepted;
        return this;
    }

    public CallsByResultBreakdown unknown(Double unknown) {
        this.unknown = unknown;
        return this;
    }

    public CallsByResultBreakdown transferred(Double transferred) {
        this.transferred = transferred;
        return this;
    }

    public CallsByResultBreakdown pickedUp(Double pickedUp) {
        this.pickedUp = pickedUp;
        return this;
    }

    public CallsByResultBreakdown answeredElsewhere(Double answeredElsewhere) {
        this.answeredElsewhere = answeredElsewhere;
        return this;
    }

    public CallsByResultBreakdown forwarded(Double forwarded) {
        this.forwarded = forwarded;
        return this;
    }
}
