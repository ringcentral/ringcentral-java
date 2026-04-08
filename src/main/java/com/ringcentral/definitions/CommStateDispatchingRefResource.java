package com.ringcentral.definitions;

public class CommStateDispatchingRefResource {
    /**
     * Id/Type of a state the rule is based on Required Enum: after-hours, work-hours, dnd,
     * forward-all-calls, agent, busy
     */
    public String ruleId;

    public CommStateDispatchingRefResource ruleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /** */
    public CommStateDispatchingResource dispatching;

    public CommStateDispatchingRefResource dispatching(CommStateDispatchingResource dispatching) {
        this.dispatching = dispatching;
        return this;
    }
}
