package com.ringcentral.definitions;


public class CallSegmentFilter {
    /**
     * Call segment for filtering
     * Required
     * Enum: Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup, Forwarding
     */
    public String segment;
    /**
     *
     */
    public CallSegmentLengthFilter length;

    public CallSegmentFilter segment(String segment) {
        this.segment = segment;
        return this;
    }

    public CallSegmentFilter length(CallSegmentLengthFilter length) {
        this.length = length;
        return this;
    }
}
