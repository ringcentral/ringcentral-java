package com.ringcentral.definitions;


public class CallsByResponse {
    /**
     * Required
     * Format: int64
     */
    public Long answered;
    /**
     * Required
     * Format: int64
     */
    public Long notAnswered;

    public CallsByResponse answered(Long answered) {
        this.answered = answered;
        return this;
    }

    public CallsByResponse notAnswered(Long notAnswered) {
        this.notAnswered = notAnswered;
        return this;
    }
}
