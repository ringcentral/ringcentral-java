package com.ringcentral.definitions;


/**
 * Interaction rule
 */
public class CommInteractionRuleResource {
    /**
     * Internal identifier of a rule
     * Required
     * Example: 400133463175
     */
    public String id;
    /**
     * Required
     */
    public Object[] conditions;
    /**
     * Required
     */
    public CommInteractionDispatchingResource dispatching;
    /**
     * Specifies if a rule is enabled or not. *Work Hours* and *After Hours* rules cannot be disabled
     * Required
     */
    public Boolean enabled;
    /**
     * Custom name of a rule
     * Required
     */
    public String displayName;

    public CommInteractionRuleResource id(String id) {
        this.id = id;
        return this;
    }

    public CommInteractionRuleResource conditions(Object[] conditions) {
        this.conditions = conditions;
        return this;
    }

    public CommInteractionRuleResource dispatching(CommInteractionDispatchingResource dispatching) {
        this.dispatching = dispatching;
        return this;
    }

    public CommInteractionRuleResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommInteractionRuleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
