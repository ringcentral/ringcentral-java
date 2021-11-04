package com.ringcentral.definitions;


public class CallsByOrigin {
    /**
     * Required
     * Format: int64
     */
    public Long internal;
    /**
     * Required
     * Format: int64
     */
    public Long external;

    public CallsByOrigin internal(Long internal) {
        this.internal = internal;
        return this;
    }

    public CallsByOrigin external(Long external) {
        this.external = external;
        return this;
    }
}
