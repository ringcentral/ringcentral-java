package com.ringcentral.definitions;

public class CommStateReferenceResource {
    /**
     * Id/Type of a state the rule is based on Required Enum: after-hours, work-hours, dnd,
     * forward-all-calls, agent, busy
     */
    public String id;

    public CommStateReferenceResource id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Predefined name of a state-based rule (similar to the name of a state) Required Enum: After
     * Hours, Work Hours, Do not disturb, Forward all calls, Agent, Busy
     */
    public String displayName;

    public CommStateReferenceResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** Required */
    public CommStateScheduleConditionResource[] conditions;

    public CommStateReferenceResource conditions(CommStateScheduleConditionResource[] conditions) {
        this.conditions = conditions;
        return this;
    }
}
