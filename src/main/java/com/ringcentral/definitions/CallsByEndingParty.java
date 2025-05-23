package com.ringcentral.definitions;


public class CallsByEndingParty {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByEndingPartyBreakdown values;

    public CallsByEndingParty valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsByEndingParty values(CallsByEndingPartyBreakdown values) {
        this.values = values;
        return this;
    }
}
