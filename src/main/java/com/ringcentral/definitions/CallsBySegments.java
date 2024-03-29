package com.ringcentral.definitions;


/**
 * Data for calls with breakdown by segments (Ringing, LiveTalk, Hold, Park, Transfer, IvrPrompt, Voicemail, VmGreeting, Setup)
 */
public class CallsBySegments {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsBySegmentsBreakdown values;

    public CallsBySegments valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsBySegments values(CallsBySegmentsBreakdown values) {
        this.values = values;
        return this;
    }
}
