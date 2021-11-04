package com.ringcentral.definitions;


// Filtering calls by segment
public class CallSegmentFilter {
    /**
     * Required
     * Enum: Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, VoiceMailing, VmGreeting
     */
    public String callSegment;

    public CallSegmentFilter callSegment(String callSegment) {
        this.callSegment = callSegment;
        return this;
    }
}
