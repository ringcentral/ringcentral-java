package com.ringcentral.definitions;


public class CallsByResponse {
    /**
     * Required
     * Format: double
     */
    public Double answered;
    /**
     * Required
     * Format: double
     */
    public Double notAnswered;
    /**
     * Required
     * Format: double
     */
    public Double connected;
    /**
     * Required
     * Format: double
     */
    public Double notConnected;

    public CallsByResponse answered(Double answered) {
        this.answered = answered;
        return this;
    }

    public CallsByResponse notAnswered(Double notAnswered) {
        this.notAnswered = notAnswered;
        return this;
    }

    public CallsByResponse connected(Double connected) {
        this.connected = connected;
        return this;
    }

    public CallsByResponse notConnected(Double notConnected) {
        this.notConnected = notConnected;
        return this;
    }
}
