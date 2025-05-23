package com.ringcentral.definitions;


public class CallsByEndingPartyBreakdown {
    /**
     * Value for Caller ending party
     * Required
     * Format: double
     */
    public Double caller;
    /**
     * Value for Callee ending party
     * Required
     * Format: double
     */
    public Double callee;
    /**
     * Value for System ending party
     * Required
     * Format: double
     */
    public Double system;

    public CallsByEndingPartyBreakdown caller(Double caller) {
        this.caller = caller;
        return this;
    }

    public CallsByEndingPartyBreakdown callee(Double callee) {
        this.callee = callee;
        return this;
    }

    public CallsByEndingPartyBreakdown system(Double system) {
        this.system = system;
        return this;
    }
}
