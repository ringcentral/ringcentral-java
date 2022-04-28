package com.ringcentral.definitions;


public class CallSegmentFilter {
    /**
     * Enum: Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup
     */
    public String callSegment;
    /**
     *
     */
    public PerformanceCallsCallSegmentLengthFilter callSegmentLength;

    public CallSegmentFilter callSegment(String callSegment) {
        this.callSegment = callSegment;
        return this;
    }

    public CallSegmentFilter callSegmentLength(PerformanceCallsCallSegmentLengthFilter callSegmentLength) {
        this.callSegmentLength = callSegmentLength;
        return this;
    }
}
