package com.ringcentral.definitions;


    /**
* Result breakdown by segments
*/
public class CallsBySegmentsBreakdown
{
    /**
     * Value for Ringing segment
     * Required
     * Format: double
     */
    public Double ringing;
    public CallsBySegmentsBreakdown ringing(Double ringing)
    {
        this.ringing = ringing;
        return this;
    }

    /**
     * Value for LiveTalk segment
     * Required
     * Format: double
     */
    public Double liveTalk;
    public CallsBySegmentsBreakdown liveTalk(Double liveTalk)
    {
        this.liveTalk = liveTalk;
        return this;
    }

    /**
     * Value for Hold segment
     * Required
     * Format: double
     */
    public Double hold;
    public CallsBySegmentsBreakdown hold(Double hold)
    {
        this.hold = hold;
        return this;
    }

    /**
     * Value for Park segment
     * Required
     * Format: double
     */
    public Double park;
    public CallsBySegmentsBreakdown park(Double park)
    {
        this.park = park;
        return this;
    }

    /**
     * Value for Transfer segment
     * Required
     * Format: double
     */
    public Double transfer;
    public CallsBySegmentsBreakdown transfer(Double transfer)
    {
        this.transfer = transfer;
        return this;
    }

    /**
     * Value for IVRPrompt segment
     * Required
     * Format: double
     */
    public Double ivrPrompt;
    public CallsBySegmentsBreakdown ivrPrompt(Double ivrPrompt)
    {
        this.ivrPrompt = ivrPrompt;
        return this;
    }

    /**
     * Value for Voicemail segment
     * Required
     * Format: double
     */
    public Double voicemail;
    public CallsBySegmentsBreakdown voicemail(Double voicemail)
    {
        this.voicemail = voicemail;
        return this;
    }

    /**
     * Value for VMGreeting segment
     * Required
     * Format: double
     */
    public Double vmGreeting;
    public CallsBySegmentsBreakdown vmGreeting(Double vmGreeting)
    {
        this.vmGreeting = vmGreeting;
        return this;
    }

    /**
     * Value for Setup segment
     * Required
     * Format: double
     */
    public Double setup;
    public CallsBySegmentsBreakdown setup(Double setup)
    {
        this.setup = setup;
        return this;
    }
}