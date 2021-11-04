package com.ringcentral.definitions;


public class CallDurationByResponseType {
    /**
     * Required
     * Format: int64
     */
    public Long inboundDirectSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long parkRetrievalsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long queueCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long transferredCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long missedCallsSeconds;
    /**
     * Required
     * Format: int64
     */
    public Long acceptedCallsSeconds;

    public CallDurationByResponseType inboundDirectSeconds(Long inboundDirectSeconds) {
        this.inboundDirectSeconds = inboundDirectSeconds;
        return this;
    }

    public CallDurationByResponseType parkRetrievalsSeconds(Long parkRetrievalsSeconds) {
        this.parkRetrievalsSeconds = parkRetrievalsSeconds;
        return this;
    }

    public CallDurationByResponseType queueCallsSeconds(Long queueCallsSeconds) {
        this.queueCallsSeconds = queueCallsSeconds;
        return this;
    }

    public CallDurationByResponseType transferredCallsSeconds(Long transferredCallsSeconds) {
        this.transferredCallsSeconds = transferredCallsSeconds;
        return this;
    }

    public CallDurationByResponseType missedCallsSeconds(Long missedCallsSeconds) {
        this.missedCallsSeconds = missedCallsSeconds;
        return this;
    }

    public CallDurationByResponseType acceptedCallsSeconds(Long acceptedCallsSeconds) {
        this.acceptedCallsSeconds = acceptedCallsSeconds;
        return this;
    }
}
