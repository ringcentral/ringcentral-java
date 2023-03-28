package com.ringcentral.definitions;


/**
 * Primary/additional CQ information
 */
public class CallInfoCQ {
    /**
     *
     */
    public PrimaryCQInfo primary;
    /**
     *
     */
    public AdditionalCQInfo additional;

    public CallInfoCQ primary(PrimaryCQInfo primary) {
        this.primary = primary;
        return this;
    }

    public CallInfoCQ additional(AdditionalCQInfo additional) {
        this.additional = additional;
        return this;
    }
}
