package com.ringcentral.definitions;


public class CallsByResponseType {
    /**
     * Required
     * Format: int64
     */
    public Long inboundDirect;
    /**
     * Required
     * Format: int64
     */
    public Long parkRetrieval;
    /**
     * Required
     * Format: int64
     */
    public Long queueCalls;
    /**
     * Required
     * Format: int64
     */
    public Long transferredCalls;
    /**
     * Required
     * Format: int64
     */
    public Long missed;
    /**
     * Required
     * Format: int64
     */
    public Long accepted;

    public CallsByResponseType inboundDirect(Long inboundDirect) {
        this.inboundDirect = inboundDirect;
        return this;
    }

    public CallsByResponseType parkRetrieval(Long parkRetrieval) {
        this.parkRetrieval = parkRetrieval;
        return this;
    }

    public CallsByResponseType queueCalls(Long queueCalls) {
        this.queueCalls = queueCalls;
        return this;
    }

    public CallsByResponseType transferredCalls(Long transferredCalls) {
        this.transferredCalls = transferredCalls;
        return this;
    }

    public CallsByResponseType missed(Long missed) {
        this.missed = missed;
        return this;
    }

    public CallsByResponseType accepted(Long accepted) {
        this.accepted = accepted;
        return this;
    }
}
