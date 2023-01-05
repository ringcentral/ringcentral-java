package com.ringcentral.definitions;


    /**
* Result breakdown by call result
*/
public class CallsByResultBreakdown
{
    /**
     * Value for Completed result
     * Required
     * Format: double
     */
    public Double completed;
    public CallsByResultBreakdown completed(Double completed)
    {
        this.completed = completed;
        return this;
    }

    /**
     * Value for Abandoned result
     * Required
     * Format: double
     */
    public Double abandoned;
    public CallsByResultBreakdown abandoned(Double abandoned)
    {
        this.abandoned = abandoned;
        return this;
    }

    /**
     * Value for Voicemail result
     * Required
     * Format: double
     */
    public Double voicemail;
    public CallsByResultBreakdown voicemail(Double voicemail)
    {
        this.voicemail = voicemail;
        return this;
    }

    /**
     * Value for Missed result
     * Required
     * Format: double
     */
    public Double missed;
    public CallsByResultBreakdown missed(Double missed)
    {
        this.missed = missed;
        return this;
    }

    /**
     * Value for Accepted result
     * Required
     * Format: double
     */
    public Double accepted;
    public CallsByResultBreakdown accepted(Double accepted)
    {
        this.accepted = accepted;
        return this;
    }

    /**
     * Value for Unknown result
     * Required
     * Format: double
     */
    public Double unknown;
    public CallsByResultBreakdown unknown(Double unknown)
    {
        this.unknown = unknown;
        return this;
    }
}