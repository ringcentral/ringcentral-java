package com.ringcentral.definitions;


public class CallSegmentFilter
{
    /**
     * Call segment for filtering
     * Required
     * Enum: Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup
     */
    public String segment;
    public CallSegmentFilter segment(String segment)
    {
        this.segment = segment;
        return this;
    }

    /**
     */
    public CallSegmentLengthFilter length;
    public CallSegmentFilter length(CallSegmentLengthFilter length)
    {
        this.length = length;
        return this;
    }
}