package com.ringcentral.definitions;


/**
 * Call information on user interface
 */
public class UiCallInfo {
    /**
     *
     */
    public UiCallInfoRecord primary;
    /**
     *
     */
    public UiCallInfoRecord additional;

    public UiCallInfo primary(UiCallInfoRecord primary) {
        this.primary = primary;
        return this;
    }

    public UiCallInfo additional(UiCallInfoRecord additional) {
        this.additional = additional;
        return this;
    }
}
