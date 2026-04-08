package com.ringcentral.definitions;

public class CallsByEndingPartyBreakdown {
    /** Value for Caller ending party Required Format: double */
    public Double caller;

    public CallsByEndingPartyBreakdown caller(Double caller) {
        this.caller = caller;
        return this;
    }

    /** Value for Callee ending party Required Format: double */
    public Double callee;

    public CallsByEndingPartyBreakdown callee(Double callee) {
        this.callee = callee;
        return this;
    }

    /** Value for System ending party Required Format: double */
    public Double system;

    public CallsByEndingPartyBreakdown system(Double system) {
        this.system = system;
        return this;
    }
}
