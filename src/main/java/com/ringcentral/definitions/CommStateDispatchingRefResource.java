package com.ringcentral.definitions;


public class CommStateDispatchingRefResource {
    /**
     * Id/Type of a state the rule is based on
     * Required
     * Enum: after-hours, work-hours, dnd, forward-all-calls, agent
     */
    public String ruleId;
    /**
     *
     */
    public CommStateDispatchingResource dispatching;

    public CommStateDispatchingRefResource ruleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public CommStateDispatchingRefResource dispatching(CommStateDispatchingResource dispatching) {
        this.dispatching = dispatching;
        return this;
    }
}
