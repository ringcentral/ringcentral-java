package com.ringcentral.definitions;


/**
 * Interaction rule create request
 */
public class CommInteractionRuleCreateRequest {
    /**
     * Required
     */
    public Object[] conditions;
    /**
     * Required
     */
    public CommDispatchingRequest dispatching;
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

    public CommInteractionRuleCreateRequest conditions(Object[] conditions) {
        this.conditions = conditions;
        return this;
    }

    public CommInteractionRuleCreateRequest dispatching(CommDispatchingRequest dispatching) {
        this.dispatching = dispatching;
        return this;
    }

    public CommInteractionRuleCreateRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommInteractionRuleCreateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
