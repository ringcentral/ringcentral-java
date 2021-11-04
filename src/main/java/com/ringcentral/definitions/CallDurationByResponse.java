package com.ringcentral.definitions;


public class CallDurationByResponse {
    /**
     * Required
     * Format: int64
     */
    public Long answeredCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long notAnsweredCallsSeconds;

    public CallDurationByResponse answeredCallsSeconds(Long answeredCallsSeconds) {
        this.answeredCallsSeconds = answeredCallsSeconds;
        return this;
    }

    public CallDurationByResponse notAnsweredCallsSeconds(Long notAnsweredCallsSeconds) {
        this.notAnsweredCallsSeconds = notAnsweredCallsSeconds;
        return this;
    }
}
