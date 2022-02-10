package com.ringcentral.definitions;


/**
 * Filtering calls by segment
 */
public class CallSegmentFilter {
    /**
     * Required
     * Enum: Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting
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
