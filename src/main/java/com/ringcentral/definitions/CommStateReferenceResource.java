package com.ringcentral.definitions;


public class CommStateReferenceResource {
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
    public CommStateScheduleConditionResource[] conditions;

    public CommStateReferenceResource id(String id) {
        this.id = id;
        return this;
    }

    public CommStateReferenceResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public CommStateReferenceResource conditions(CommStateScheduleConditionResource[] conditions) {
        this.conditions = conditions;
        return this;
    }
}
