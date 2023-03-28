package com.ringcentral.definitions;


/**
 * Result breakdown by origin
 */
public class CallsByOriginBreakdown {
    /**
     * Value for Internal origin
     * Required
     * Format: double
     */
    public Double internal;
    /**
     * Value for External origin
     * Required
     * Format: double
     */
    public Double external;

    public CallsByOriginBreakdown internal(Double internal) {
        this.internal = internal;
        return this;
    }

    public CallsByOriginBreakdown external(Double external) {
        this.external = external;
        return this;
    }
}
