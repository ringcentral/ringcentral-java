package com.ringcentral.definitions;


/**
 * Interaction rule update request
 */
public class CommInteractionRuleUpdateRequest {
    /**
     *
     */
    public Object[] conditions;
    /**
     *
     */
    public CommDispatchingRequest dispatching;
    /**
     * Specifies if a rule is enabled or not. *Work Hours* and *After Hours* rules cannot be disabled
     */
    public Boolean enabled;
    /**
     * Custom name of a rule
     */
    public String displayName;

    public CommInteractionRuleUpdateRequest conditions(Object[] conditions) {
        this.conditions = conditions;
        return this;
    }

    public CommInteractionRuleUpdateRequest dispatching(CommDispatchingRequest dispatching) {
        this.dispatching = dispatching;
        return this;
    }

    public CommInteractionRuleUpdateRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CommInteractionRuleUpdateRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
