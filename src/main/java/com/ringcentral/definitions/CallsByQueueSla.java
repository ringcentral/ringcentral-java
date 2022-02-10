package com.ringcentral.definitions;


public class CallsByQueueSla {
    /**
     * Required
     * Format: double
     */
    public Double inSla;
    /**
     * Required
     * Format: double
     */
    public Double outOfSla;

    public CallsByQueueSla inSla(Double inSla) {
        this.inSla = inSla;
        return this;
    }

    public CallsByQueueSla outOfSla(Double outOfSla) {
        this.outOfSla = outOfSla;
        return this;
    }
}
