package com.ringcentral.definitions;


public class CallDurationByResult {
    /**
     * Required
     * Format: int64
     */
    public Long completedCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long abandonedCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long voiceMailCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long connectedCallsSeconds;

    public CallDurationByResult completedCallsSeconds(Long completedCallsSeconds) {
        this.completedCallsSeconds = completedCallsSeconds;
        return this;
    }

    public CallDurationByResult abandonedCallsSeconds(Long abandonedCallsSeconds) {
        this.abandonedCallsSeconds = abandonedCallsSeconds;
        return this;
    }

    public CallDurationByResult voiceMailCallsSeconds(Long voiceMailCallsSeconds) {
        this.voiceMailCallsSeconds = voiceMailCallsSeconds;
        return this;
    }

    public CallDurationByResult connectedCallsSeconds(Long connectedCallsSeconds) {
        this.connectedCallsSeconds = connectedCallsSeconds;
        return this;
    }
}
