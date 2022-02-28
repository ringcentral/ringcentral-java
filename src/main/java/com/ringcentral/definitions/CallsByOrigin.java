package com.ringcentral.definitions;


public class CallsByOrigin {
    /**
     * Required
     * Format: double
     */
    public Double internal;
    /**
     * Required
     * Format: double
     */
    public Double external;

    public CallsByOrigin internal(Double internal) {
        this.internal = internal;
        return this;
    }

    public CallsByOrigin external(Double external) {
        this.external = external;
        return this;
    }
}
