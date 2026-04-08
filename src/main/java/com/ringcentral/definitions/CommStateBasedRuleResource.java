package com.ringcentral.definitions;

/** State-based rule information */
public class CommStateBasedRuleResource {
    /**
     * Id/Type of a state the rule is based on Required Enum: after-hours, work-hours, dnd,
     * forward-all-calls, agent, busy
     */
    public String id;

    public CommStateBasedRuleResource id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Predefined name of a state-based rule (similar to the name of a state) Required Enum: After
     * Hours, Work Hours, Do not disturb, Forward all calls, Agent, Busy
     */
    public String displayName;

    public CommStateBasedRuleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** Required */
    public CommStateDispatchingResource dispatching;

    public CommStateBasedRuleResource dispatching(CommStateDispatchingResource dispatching) {
        this.dispatching = dispatching;
        return this;
    }

    /** */
    public CommStateDispatchingRefResource dispatchingRef;

    public CommStateBasedRuleResource dispatchingRef(
            CommStateDispatchingRefResource dispatchingRef) {
        this.dispatchingRef = dispatchingRef;
        return this;
    }

    /** Required */
    public CommStateResource state;

    public CommStateBasedRuleResource state(CommStateResource state) {
        this.state = state;
        return this;
    }
}
