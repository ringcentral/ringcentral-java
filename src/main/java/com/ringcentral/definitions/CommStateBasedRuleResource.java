package com.ringcentral.definitions;


/**
 * State-based rule information
 */
public class CommStateBasedRuleResource {
    /**
     * Id/Type of a state the rule is based on
     * Required
     * Enum: after-hours, work-hours, dnd, forward-all-calls, agent
     */
    public String id;
    /**
     * Predefined name of a state-based rule (similar to the name of a state)
     * Required
     * Enum: After Hours, Work Hours, Do not disturb, Forward all calls, Agent
     */
    public String displayName;
    /**
     * Required
     */
    public CommStateDispatchingResource dispatching;
    /**
     *
     */
    public CommStateDispatchingRefResource dispatchingRef;
    /**
     * Required
     */
    public CommStateResource state;

    public CommStateBasedRuleResource id(String id) {
        this.id = id;
        return this;
    }

    public CommStateBasedRuleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public CommStateBasedRuleResource dispatching(CommStateDispatchingResource dispatching) {
        this.dispatching = dispatching;
        return this;
    }

    public CommStateBasedRuleResource dispatchingRef(CommStateDispatchingRefResource dispatchingRef) {
        this.dispatchingRef = dispatchingRef;
        return this;
    }

    public CommStateBasedRuleResource state(CommStateResource state) {
        this.state = state;
        return this;
    }
}
