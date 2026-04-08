package com.ringcentral.definitions;

public class CallsByEndingParty {
    /** Unit of the result value Required Enum: Percent, Seconds, Instances */
    public String valueType;

    public CallsByEndingParty valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /** Required */
    public CallsByEndingPartyBreakdown values;

    public CallsByEndingParty values(CallsByEndingPartyBreakdown values) {
        this.values = values;
        return this;
    }
}
