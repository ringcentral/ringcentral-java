package com.ringcentral.definitions;


public class CommStateResource
{
    /**
     * Id/Type of a state the rule is based on
     * Required
     * Enum: after-hours, work-hours, dnd, forward-all-calls, agent, busy
     */
    public String id;
    public CommStateResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Specifies if a state is enabled or not. *Work Hours* and *After Hours* states cannot be disabled
     * Required
     */
    public Boolean enabled;
    public CommStateResource enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Predefined name of a state-based rule (similar to the name of a state)
     * Required
     * Enum: After Hours, Work Hours, Do not disturb, Forward all calls, Agent, Busy
     */
    public String displayName;
    public CommStateResource displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Required
     */
    public Object[] conditions;
    public CommStateResource conditions(Object[] conditions)
    {
        this.conditions = conditions;
        return this;
    }
}